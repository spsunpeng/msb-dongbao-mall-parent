package com.msb.dongbao.ums.entity.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author sunpeng
 * @Date 2021-01-06 17:09
 */
@Data
@ToString
public class UmsMemberLoginParamDTO {
    private String username;
    private String password;
}
