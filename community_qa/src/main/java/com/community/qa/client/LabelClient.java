package com.community.qa.client;

import com.community.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("community-base")
public interface LabelClient {
    @RequestMapping(value="/label/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable("id") String id);
}

