package com.msb.dongbao.ums.entity.dto;

import lombok.Data;
import lombok.ToString;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author sunpeng
 * @Date 2021-01-06 16:19
 */
@Data
@ToString
public class UmsMemberRegisterParamDTO {

    private String username;
    private String password;
    private String icon;
    private String email;
    private String nickName;
}
