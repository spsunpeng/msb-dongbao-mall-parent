package com.msb.dongbao.portal.web.controller;

import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/register")
    public String register(){
        umsMemberService.register();
        return "register";
    }

}
