package com.asset.repair.service;

import com.asset.repair.result.LayUIResult;
import org.springframework.stereotype.Service;

public interface RepairOrderService {
    LayUIResult queryOrder(Integer page,Integer limit);

    void insert();
}
