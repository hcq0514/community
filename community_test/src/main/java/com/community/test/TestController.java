package com.community.test;

import com.api.LabelApi;
import com.community.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器层
 *
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {


    @Autowired
    LabelClient labelClient;






    @RequestMapping(value = "/label/{labelid}")
    public Result findLabelById(@PathVariable String labelid){
        Result result = labelClient.findById(labelid);
        return result;
    }


}
