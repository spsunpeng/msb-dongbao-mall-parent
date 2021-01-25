package com.msb.dongbao.ums.entity.Response;

import com.msb.dongbao.ums.entity.UmsMember;
import lombok.Data;
import lombok.ToString;

/**
 * @author sunpeng
 * @Date 2021-01-25 15:51
 */
@Data
@ToString
public class UserMemberLoginResponse {

    private String token;
    private UmsMember umsMember;
}
