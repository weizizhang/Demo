package com.example.app.demo.annotation;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ActionInterceptor implements HandlerInterceptor {
	@Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        log.info("在请求处理之前进行调用（Controller方法调用之前）");
        if(!(o instanceof HandlerMethod)){
            return false;
        }
        HandlerMethod  handlerMethod= (HandlerMethod) o;
        Method method=handlerMethod.getMethod();
        Authorization   authorization=method.getAnnotation(Authorization.class);
        PermissionEnum permission=  authorization.permission();
        log.info("permission的值:"+permission.name());
        if(!(PermissionEnum.YES.equals(permission.name()))){
            return false;
        }
        return true;
    }
 
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        log.info("-----postHandle---请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后--------");
                // 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }
 
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        log.info("-----afterCompletion-------在整个请求结束之后被调用，也就是在DispatcherServlet-----");
    }

}
