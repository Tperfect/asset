package com.asset.repair.service.impl;



import com.asset.mapper.RepairMapper;
import com.asset.pojo.Repair;
import com.asset.pojo.RepairExample;
import com.asset.repair.result.LayUIResult;
import com.asset.repair.service.RepairOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RepairOrderServiceImpl implements RepairOrderService {
    @Autowired
    private RepairMapper repairMapper;

    public void insert() {
        for (int i = 0; i < 100; i++) {
            Repair repair = new Repair();
            repair.setRepairCreatedate(new Date());
            repair.setRepairCause("无法开机"+i);
            repair.setRepairResult("成功"+i);
            repairMapper.insert(repair);
        }

    }

    public LayUIResult queryOrder(Integer page,Integer limit) {
     //   PageHelper pageHelper = new PageHelper();
        PageHelper.startPage(page,limit);
        LayUIResult layUIResult = new LayUIResult();
        RepairExample example = new RepairExample();
        RepairExample.Criteria criteria = example.createCriteria();
        List<Repair> repairs = repairMapper.selectByExample(example);
        PageInfo info = new PageInfo(repairs);
        layUIResult.setCode(0);
        layUIResult.setMsg("");
        layUIResult.setCount(info.getTotal());
        layUIResult.setData(info.getList());
        return layUIResult;
    }
}
