package com.asset.pojo;

import java.util.Date;

public class RepairApply {
    private Integer applyId;

    private String applyPeople;

    private String applyDept;

    private Date applyDate;

    private Integer applyAssetId;

    private String applyAssetName;

    private String applyAssetSpec;

    private Integer applyAssetNum;

    private String applyAssetPlace;

    private Long applyBudget;

    private Integer applyDegree;

    private Date applyRepairdate;

    private Date applyFinishdate;

    private String applyContent;

    private String applyCase;

    private Integer applyStatus;

    private Integer applyExamine;

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getApplyPeople() {
        return applyPeople;
    }

    public void setApplyPeople(String applyPeople) {
        this.applyPeople = applyPeople == null ? null : applyPeople.trim();
    }

    public String getApplyDept() {
        return applyDept;
    }

    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept == null ? null : applyDept.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Integer getApplyAssetId() {
        return applyAssetId;
    }

    public void setApplyAssetId(Integer applyAssetId) {
        this.applyAssetId = applyAssetId;
    }

    public String getApplyAssetName() {
        return applyAssetName;
    }

    public void setApplyAssetName(String applyAssetName) {
        this.applyAssetName = applyAssetName == null ? null : applyAssetName.trim();
    }

    public String getApplyAssetSpec() {
        return applyAssetSpec;
    }

    public void setApplyAssetSpec(String applyAssetSpec) {
        this.applyAssetSpec = applyAssetSpec == null ? null : applyAssetSpec.trim();
    }

    public Integer getApplyAssetNum() {
        return applyAssetNum;
    }

    public void setApplyAssetNum(Integer applyAssetNum) {
        this.applyAssetNum = applyAssetNum;
    }

    public String getApplyAssetPlace() {
        return applyAssetPlace;
    }

    public void setApplyAssetPlace(String applyAssetPlace) {
        this.applyAssetPlace = applyAssetPlace == null ? null : applyAssetPlace.trim();
    }

    public Long getApplyBudget() {
        return applyBudget;
    }

    public void setApplyBudget(Long applyBudget) {
        this.applyBudget = applyBudget;
    }

    public Integer getApplyDegree() {
        return applyDegree;
    }

    public void setApplyDegree(Integer applyDegree) {
        this.applyDegree = applyDegree;
    }

    public Date getApplyRepairdate() {
        return applyRepairdate;
    }

    public void setApplyRepairdate(Date applyRepairdate) {
        this.applyRepairdate = applyRepairdate;
    }

    public Date getApplyFinishdate() {
        return applyFinishdate;
    }

    public void setApplyFinishdate(Date applyFinishdate) {
        this.applyFinishdate = applyFinishdate;
    }

    public String getApplyContent() {
        return applyContent;
    }

    public void setApplyContent(String applyContent) {
        this.applyContent = applyContent == null ? null : applyContent.trim();
    }

    public String getApplyCase() {
        return applyCase;
    }

    public void setApplyCase(String applyCase) {
        this.applyCase = applyCase == null ? null : applyCase.trim();
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Integer getApplyExamine() {
        return applyExamine;
    }

    public void setApplyExamine(Integer applyExamine) {
        this.applyExamine = applyExamine;
    }
}