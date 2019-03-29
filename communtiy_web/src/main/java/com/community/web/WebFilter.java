package com.community.web;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class WebFilter extends ZuulFilter {
    /**
     * 过滤器类型
     * pre ：可以在请求被路由之前调用
     * route ：在路由请求时候被调用
     * post ：在route和error过滤器之后被调用
     * error ：处理请求时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 优先级，数字越大，优先级越低
     * @return
     */

    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行此过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("zuul 过滤器");
        return null;
    }
}
