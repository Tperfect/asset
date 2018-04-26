package com.asset.stock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestStockController {
    @RequestMapping("/stock/index")
    public String index(){
        return "index";
    }
}
