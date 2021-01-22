package com.msb.dongbao.portal.web.advice;

import com.msb.dongbao.common.base.result.ResultWrapper;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author sunpeng
 * @Date 2021-01-16 11:48
 */
//表明这个类是处理异常的类
@RestControllerAdvice
public class GlobalExceptionHandle {

    //处理哪一种异常注解
    @ExceptionHandler(ArithmeticException.class)
    public ResultWrapper customException(){
        return ResultWrapper.builder().code(301).msg("服务异常").build();
    }
}
