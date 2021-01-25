package com.msb.dongbao.portal.web.controller;

import com.msb.dongbao.common.base.result.ResultWrapper;
import com.msb.dongbao.common.util.JwtUtil;
import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Email;

/**
 * @author sunpeng
 * @Date 2020-12-30 14:48
 */
@RestController
@RequestMapping("/user-member")
public class UserMemberController {

    @Autowired
    private UmsMemberService umsMemberService;

    @GetMapping("/hello")
    public String hello(){
        return "hello dongbao";
    }

    @PostMapping("/register")
    public ResultWrapper register(@RequestBody @Valid UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){
        return umsMemberService.register(umsMemberRegisterParamDTO);
    }

    @PostMapping("/login")
    public ResultWrapper login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO){
        return umsMemberService.login(umsMemberLoginParamDTO);
    }

    @PostMapping("/edit")
    public ResultWrapper edit(@RequestBody UmsMember umsMember){
        return umsMemberService.edit(umsMember);
    }

    @GetMapping("/testToken")
    public String testToken(String token){
        String subject = JwtUtil.parseToken(token);
        return subject;
    }

}
