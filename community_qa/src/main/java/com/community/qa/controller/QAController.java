package com.community.qa.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.community.common.entity.Result;
import com.community.common.entity.StatusCode;
import com.community.qa.client.LabelClient;
import com.community.qa.entity.ProblemEntity;
import com.community.qa.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 控制器层
 *
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/problem")
public class QAController   {

    @Autowired
    private ProblemService problemService;


    @Autowired
    LabelClient labelClient;


    /**
     * 最新问题列表
     *
     * @param labelId
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/newlist/{labelId}/{page}/{size}", method = RequestMethod.GET)
    public Result selectLatestProblemByLabelId(@PathVariable String labelId, @PathVariable int page, @PathVariable int size) {
        IPage<ProblemEntity> problemEntityIPage = problemService.selectLatestProblemByLabelId(new Page<>(page, size),labelId);
        return new Result(true, StatusCode.OK, "查询成功", problemEntityIPage);
    }

    /**
     * 热门问题列表(回复数最多)
     *
     * @param labelId
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/hotlist/{labelId}/{page}/{size}", method = RequestMethod.GET)
    public Result selectHotProblemByLabelId(@PathVariable String labelId, @PathVariable int page, @PathVariable int size) {
        IPage<ProblemEntity> labelEntityIPage = problemService.selectHotProblemByLabelId(new Page<>(page, size),labelId);
        return new Result(true, StatusCode.OK, "查询成功", labelEntityIPage);
    }

    /**
     * 等待回答列表(回复数为0)
     *
     * @param labelId
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/waitlist/{labelId}/{page}/{size}", method = RequestMethod.GET)
    public Result selectWaitAnswerQuestionListByLabelId(@PathVariable String labelId, @PathVariable int page, @PathVariable int size) {
        IPage<ProblemEntity> waitAnswerList = problemService.selectWaitAnswerQuestionListByLabelId(new Page<>(page, size),labelId);
        return new Result(true, StatusCode.OK, "查询成功", waitAnswerList);
    }


    /** cloud调用测试
     *
     * @param labelid
     * @return
     */
    @RequestMapping(value = "/label/{labelid}")
    public Result findLabelById(@PathVariable String labelid){
        Result result = labelClient.findById(labelid);
        return result;
    }


}
