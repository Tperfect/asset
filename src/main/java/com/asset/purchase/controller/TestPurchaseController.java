package com.asset.purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestPurchaseController {
        @RequestMapping("/purchase/index")
    public String index(){
        return "login";
    }
}
