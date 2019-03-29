package com.api.hystrix;

import com.api.LabelApi;
import com.community.common.entity.Result;
import org.springframework.stereotype.Component;

@Component
public class LabelApiImp implements LabelApi {
    @Override
    public Result findById(String id) {
        return null;
    }
}
