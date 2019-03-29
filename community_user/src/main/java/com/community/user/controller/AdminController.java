package com.community.user.controller;

import com.community.common.entity.Result;
import com.community.common.entity.StatusCode;
import com.community.common.util.JwtUtil;
import com.community.user.entity.AdminEntity;
import com.community.user.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

public class AdminController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AdminService adminService;

    /**
     *
     * @param loginMap
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody Map<String, String> loginMap) {
        AdminEntity admin =
                adminService.findByLoginnameAndPassword(loginMap.get("loginname"),loginMap.get("password"));
        if (admin != null) {
//生成token
            String token = jwtUtil.createJWT(admin.getId(),
                    admin.getLoginname(), "admin");
            Map map = new HashMap();
            map.put("token", token);
            map.put("name", admin.getLoginname());//登陆名
            return new Result(true, StatusCode.OK, "登陆成功", map);
        } else {
            return new Result(false, StatusCode.LOGINERROR, "用户名或密码错误");
        }
    }
}
