package com.yangjiaying.book.modular.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @PackageName:com.yangjiaying.book.modular.system.service
 * @ClassName:RequestAspect
 * @author:yangjiaying
 * @date 2020/1/9 16:05
 */
@Component
public class RequestAspect implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        String name = null;
        Cookie[] cookie = httpServletRequest.getCookies();//获取的是请求里的所有cookie组成的数组
        for(int i=0;i<cookie.length;i++){
            if("name".equals(cookie[i].getName())){
                name = cookie[i].getValue();
                break;
            }
        }
        if(name==null){
            try {
                httpServletResponse.sendRedirect("/login");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
      return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


}