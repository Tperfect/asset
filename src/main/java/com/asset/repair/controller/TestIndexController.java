package com.asset.repair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 2018/4/11.
 */
@Controller
public class TestIndexController {
    @RequestMapping("/index")
    public String indexPage(){
        return "login";
    }
}
