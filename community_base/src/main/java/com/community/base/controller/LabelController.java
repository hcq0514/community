package com.community.base.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.community.base.entity.LabelEntity;
import com.community.base.service.LabelService;
import com.community.common.entity.Result;
import com.community.common.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: hcq
 * @Date: 2019/3/23
 */
@RestController
@RequestMapping("/label")
@CrossOrigin
public class LabelController  {

    @Autowired
    LabelService labelService;

    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody LabelEntity labelEntity) {
        labelService.add(labelEntity);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable String id) {
        labelService.deleteById(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable String id,@RequestBody LabelEntity labelEntity) {
        labelEntity.setId(id);
        labelService.update(labelEntity);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id) {
        return new Result(true, StatusCode.OK, "查询成功", labelService.findById(id));
    }

    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        return new Result(true, StatusCode.OK, "查询成功", labelService.findAll());
    }

    @RequestMapping(value = "testPage",method = RequestMethod.GET)
    public Result pageTest() {
        Page<LabelEntity> page = new Page<>(2, 1);
        IPage<LabelEntity> labelEntityIPage = labelService.selectPageVo(page);
        return new Result(true, StatusCode.OK, "查询成功", labelEntityIPage);
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public Result selectAvailableLabel() {
//        return new Result(true, StatusCode.OK, "查询成功", labelService.selectAvailableLabel());
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public Result selectRecommendLabel() {
//        return new Result(true, StatusCode.OK, "查询成功", labelService.selectRecommendLabel());
//    }




}
