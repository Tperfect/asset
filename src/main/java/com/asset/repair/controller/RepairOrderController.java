package com.asset.repair.controller;

import com.asset.repair.result.LayUIResult;
import com.asset.repair.service.RepairOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/repair")
public class RepairOrderController {
    @Autowired
    private RepairOrderService repairOrderService;
    @RequestMapping("/order")
    @ResponseBody
    public LayUIResult queryOrder(Integer page,Integer limit){
        LayUIResult layUIResult = new LayUIResult();
        layUIResult = repairOrderService.queryOrder(page,limit);
        return layUIResult;
    }

    @RequestMapping("/insert")
    public void insert(){
        repairOrderService.insert();
    }

}
