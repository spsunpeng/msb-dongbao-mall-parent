package com.msb.dongbao.common.base.enums;

import lombok.Data;

/**
 * @author sunpeng
 * @Date 2021-01-13 10:22
 */
public enum StatusErrorEnums {

    /**
     * 用户名密码不正确
     */
    PASSWORD_ERROR(1001,"用户名密码不正确"),

    /**
     * 用户不存在
     */
    USER_EMPTY(1002,"用户不存在"),

    SUCCESS(200, "成功"),
    FAIL(400, "失败")
    ;
    private Integer code;
    private String msg;

    StatusErrorEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
