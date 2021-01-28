package com.msb.dongbao.portal.web.interceptor;

import com.msb.dongbao.common.base.annotations.TokenCheck;
import com.msb.dongbao.common.base.exception.TokenException;
import com.msb.dongbao.common.util.JwtUtil;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author sunpeng
 * @Date 2021-01-28 9:40
 */
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("进入拦截器");
        //有没有token
        String token = request.getHeader("token");
        if(null == token){
            throw new TokenException("token为空");
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        //有没有注解
        if(method.isAnnotationPresent(TokenCheck.class)){
            TokenCheck annotation = method.getAnnotation(TokenCheck.class);
            //注解中的请求是否为true
            if(annotation.required()) {
                try {
                    //校验token
                    JwtUtil.parseToken(token);
                    return true;
                } catch (Exception e) {
                    throw new TokenException("token校验错误");
                }
            }
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
