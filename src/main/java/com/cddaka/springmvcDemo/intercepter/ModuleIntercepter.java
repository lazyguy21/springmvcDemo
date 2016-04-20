package com.cddaka.springmvcDemo.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/2/26.
 */
public class ModuleIntercepter implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //根据URI判断当前请求对应的模块
        String uri=request.getRequestURI();
        int module=0;	//当前模块序号
        if(uri.contains("newOrder") || uri.contains("allOrder")){
            module=1;
        }else if(uri.contains("fund")){
            module=2;
        }else if(uri.contains("account")){
            module=3;
        }
        //将模块序号存入session
        request.getSession().setAttribute("module", module);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
