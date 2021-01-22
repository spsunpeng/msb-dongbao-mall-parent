package com.msb.dongbao.ums.service.impl;

import com.msb.dongbao.common.util.JwtUtil;
import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sun.security.util.Password;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author 孙鹏
 * @since 2020-12-28
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO) {

        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(umsMemberRegisterParamDTO, umsMember);

        //密码脱敏
       /*
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode(umsMember.getPassword());
        umsMember.setPassword(encode);
        */
        String encode = passwordEncoder.encode(umsMember.getPassword());
        umsMember.setPassword(encode);

        umsMemberMapper.insert(umsMember);

        return "register success";
    }

    @Override
    public String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO) {
        UmsMember umsMember = umsMemberMapper.selectByName(umsMemberLoginParamDTO.getUsername());
        if(umsMember == null){
            return "用户不存在";
        }else if(!passwordEncoder.matches(umsMemberLoginParamDTO.getPassword(), umsMember.getPassword())){
            return "密码错误";
        }

        String token = JwtUtil.createToken(umsMember.getUsername());
        return token;
    }
}
