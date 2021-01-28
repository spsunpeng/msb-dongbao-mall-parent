package com.msb.dongbao.common.base.result;

import com.msb.dongbao.common.base.enums.StatusErrorEnums;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sunpeng
 * @Date 2021-01-13 10:27
 */
@Data
@Builder
public class ResultWrapper<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public static ResultWrapper.ResultWrapperBuilder getSuccessBuilder(){
        return ResultWrapper.builder().code(StatusErrorEnums.SUCCESS.getCode()).msg(StatusErrorEnums.SUCCESS.getMsg());
    }

    public static ResultWrapper.ResultWrapperBuilder getFailBuilder(){
        return ResultWrapper.builder().code(StatusErrorEnums.FAIL.getCode()).msg(StatusErrorEnums.FAIL.getMsg());
    }

}
