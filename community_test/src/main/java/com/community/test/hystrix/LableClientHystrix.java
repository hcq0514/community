package com.community.test.hystrix;

import com.community.common.entity.Result;
import com.community.test.LabelClient;
import org.springframework.stereotype.Component;

/**
 * 熔断器
 */
@Component
public class LableClientHystrix implements LabelClient {
    @Override
    public Result findById(String id) {
        return new Result(false, 200, "hystirx");
    }
}
