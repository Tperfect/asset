package com.asset.mapper;

import com.asset.pojo.RepairApply;
import com.asset.pojo.RepairApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepairApplyMapper {
    int countByExample(RepairApplyExample example);

    int deleteByExample(RepairApplyExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(RepairApply record);

    int insertSelective(RepairApply record);

    List<RepairApply> selectByExample(RepairApplyExample example);

    RepairApply selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") RepairApply record, @Param("example") RepairApplyExample example);

    int updateByExample(@Param("record") RepairApply record, @Param("example") RepairApplyExample example);

    int updateByPrimaryKeySelective(RepairApply record);

    int updateByPrimaryKey(RepairApply record);
}