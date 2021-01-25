package com.msb.dongbao.ums.service;

import com.msb.dongbao.common.base.result.ResultWrapper;
import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author sunpeng
 * @Date 2020-12-30 15:09
 */
public interface UmsMemberService {
    public ResultWrapper register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO);
    public ResultWrapper login(UmsMemberLoginParamDTO umsMemberLoginParamDTO);
    public ResultWrapper edit(UmsMember umsMember);
}


