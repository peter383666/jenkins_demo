package com.itheima.user.controller;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/login")
    public String login(String username, String password){
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            return "用户名密码为空，不能登录";
        }
        logger.info("[login]username:{},password:{}", username, password);
        return username + "login success(登录成功)";
    }
}
