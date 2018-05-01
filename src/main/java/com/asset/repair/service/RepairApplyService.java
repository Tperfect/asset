package com.asset.repair.service;

import com.asset.pojo.RepairApply;
import com.asset.repair.result.LayUIResult;
import com.asset.repair.result.Result;
public interface RepairApplyService {
    Result repairApplyAdd(RepairApply repairApply);

    LayUIResult repairApplyExamine(RepairApply repairApply,String date,Integer page,Integer limit);

    void repairApplyUpdate(Integer applyId,Integer applyExamine,Integer applyDegree);

    void repairApplyUpdateFinishdate(RepairApply repairApply);
}
