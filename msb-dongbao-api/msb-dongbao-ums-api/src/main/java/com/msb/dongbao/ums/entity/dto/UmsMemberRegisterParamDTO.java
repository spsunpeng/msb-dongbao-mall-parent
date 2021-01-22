package com.msb.dongbao.ums.entity.dto;

import lombok.Data;
import lombok.ToString;

import javax.annotation.sql.DataSourceDefinition;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author sunpeng
 * @Date 2021-01-06 16:19
 */
@Data
@ToString
public class UmsMemberRegisterParamDTO {

    @Size(min = 1, max = 8, message = "名字的长度必须在1到8之间")
    private String username;

    @NotNull
    private String password;

    private String icon;

    private String email;
    private String nickName;
}
