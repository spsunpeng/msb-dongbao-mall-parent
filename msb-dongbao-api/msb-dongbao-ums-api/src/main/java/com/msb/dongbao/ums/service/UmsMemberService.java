package com.msb.dongbao.ums.service;

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
    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO);
    public String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO);
}


