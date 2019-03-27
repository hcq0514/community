package com.community.article.controller;

import com.community.article.service.ArticleService;
import com.community.common.entity.Result;
import com.community.common.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 控制器层
 *
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;


    /**
     * 审核
     * @param id
     * @return
     */
    @RequestMapping(value="/examine/{id}",method= RequestMethod.PUT)
    public Result examine( @PathVariable String id){
        articleService.examine(id);
        return new Result(true,StatusCode.OK,"审核成功");
    }

    /**
     * 点赞
     * @param id
     * @return
     */
    @RequestMapping(value="/thumbup/{id}",method= RequestMethod.PUT)
    public Result updateThumbup( @PathVariable String id){
        articleService.updateThumbup(id);
        return new Result(true,StatusCode.OK,"点赞成功");
    }



}
