package com.asset.repair.service.impl;

import com.asset.mapper.RepairApplyMapper;
import com.asset.pojo.RepairApply;
import com.asset.pojo.RepairApplyExample;
import com.asset.pojo.RepairApplyExample.Criteria;
import com.asset.repair.result.LayUIResult;
import com.asset.repair.result.Result;
import com.asset.repair.service.RepairApplyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RepairApplyServiceImpl implements RepairApplyService {
    @Value("${PAGE}")
    private Integer PAGE;
    @Value(("${LIMIT}"))
    private Integer LIMIT;
    @Autowired
    private RepairApplyMapper repairApplyMapper;
    public Result repairApplyAdd(RepairApply repairApply) {
        repairApply.setApplyDate(new Date());
        repairApply.setApplyBudget(100l);
        repairApply.setApplyStatus(0);
        repairApply.setApplyExamine(0);
        repairApplyMapper.insert(repairApply);
        return new Result();
    }

    public LayUIResult repairApplyExamine(RepairApply repairApply,String date,Integer page,Integer limit) {
        if(page == null){
            page = PAGE;
        }
        if(limit == null){
            limit = LIMIT;
        }

        PageHelper.startPage(page,limit);
        LayUIResult layUIResult =new LayUIResult();
        RepairApplyExample example = new RepairApplyExample();
        Criteria criteria = example.createCriteria();
        if (repairApply != null){
            if (!StringUtils.isEmpty(repairApply.getApplyId())){
                criteria.andApplyIdEqualTo(repairApply.getApplyId());
            }
            if (!StringUtils.isEmpty(repairApply.getApplyPeople())){
                criteria.andApplyPeopleLike(repairApply.getApplyPeople());
            }
        }
        if(!StringUtils.isEmpty(date)){
            String[] dates = date.split(" - ");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date0 = simpleDateFormat.parse(dates[0]);
                Date date1 = simpleDateFormat.parse(dates[1]);
                criteria.andApplyDateBetween(date0,date1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        List<RepairApply> repairApplies = repairApplyMapper.selectByExample(example);
        PageInfo info = new PageInfo(repairApplies);
        layUIResult.setCode(0);
        layUIResult.setMsg("");
        layUIResult.setCount(info.getTotal());
        layUIResult.setData(info.getList());
        return layUIResult;
    }
}
