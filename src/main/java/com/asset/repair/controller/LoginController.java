package com.asset.repair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 2018/4/11.
 */
@Controller
public class LoginController {
    @RequestMapping("login")
    public String login(@RequestBody String map){
        //登陆验证
        System.out.println(map);
     //   System.out.println(user.getUserName());
        return "login";
    }
}
