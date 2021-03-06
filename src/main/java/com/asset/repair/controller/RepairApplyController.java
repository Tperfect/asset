package com.asset.repair.controller;

import com.asset.pojo.RepairApply;
import com.asset.repair.result.LayUIResult;
import com.asset.repair.result.Result;
import com.asset.repair.service.RepairApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/repair")
public class RepairApplyController {
    @Autowired
    private RepairApplyService repairApplyService;
    @RequestMapping("/apply/add")
    @ResponseBody
    public Result repairAppleAdd(RepairApply repairApply){
        repairApplyService.repairApplyAdd(repairApply);
        return null;
    }

    @RequestMapping(value = "/apply/examine")
    @ResponseBody
    public LayUIResult repaieApplyExamine(RepairApply repairApply,String date,Integer page,Integer limit){
        return repairApplyService.repairApplyExamine(repairApply,date,page,limit);
    }

    @RequestMapping("/apply/update")
    @ResponseBody
    public Result repairApplyUpdate(Integer applyId,Integer applyExamine,Integer applyDegree){
        repairApplyService.repairApplyUpdate(applyId,applyExamine,applyDegree);
        return null;
    }

    @RequestMapping("/apply/updateFinishdate")
    public Result repairApplyUpdateFinishdate(RepairApply repairApply){
        repairApplyService.repairApplyUpdateFinishdate(repairApply);
        return null;
    }
}
