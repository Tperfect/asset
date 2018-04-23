package com.asset.declare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestDeclareController {
    @RequestMapping("/declare/index")
    public String index(){
        return "login";
    }
}
