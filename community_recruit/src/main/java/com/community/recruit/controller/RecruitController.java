package com.community.recruit.controller;


import com.community.common.entity.Result;
import com.community.common.entity.StateCode;
import com.community.common.entity.StatusCode;
import com.community.recruit.entity.RecruitEntity;
import com.community.recruit.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hcq
 * @date  2019-03-25
 */
@RestController
@RequestMapping("/recruit")
@CrossOrigin
public class RecruitController  {
    @Autowired
    RecruitService recruitService;

    /**
     *  推荐企业列表
     * @return
     */
    @RequestMapping(value="/search/recommend",method= RequestMethod.GET)
    public  Result recommend(){
        List<RecruitEntity> list = recruitService.selectRecommendCompany("1");
        return new Result(true,StatusCode.OK,"查询成功",list);
    }


    /**
     *  最新职位列表
     * @return
     */
    @RequestMapping(value="/search/newlist",method= RequestMethod.GET)
    public  Result newlist(){
        List<RecruitEntity> list = recruitService.selectLatestJob(StateCode.OPEN);
        return new Result(true,StatusCode.OK,"查询成功",list);
    }

}
