package com.asset.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Repair {
    private Integer id;

    private Date repairCreatedate;

    private String repairPeople;

    private BigDecimal repairMoney;

    private BigDecimal repairServicesMoney;

    private BigDecimal repairMaterialMoney;

    private String repairCause;

    private String repairStatus;

    private String repairOperation;

    private Date repairUpdate;

    private String repairResult;

    private String repairRecordPeople;

    private Date repairVerifydate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRepairCreatedate() {
        return repairCreatedate;
    }

    public void setRepairCreatedate(Date repairCreatedate) {
        this.repairCreatedate = repairCreatedate;
    }

    public String getRepairPeople() {
        return repairPeople;
    }

    public void setRepairPeople(String repairPeople) {
        this.repairPeople = repairPeople == null ? null : repairPeople.trim();
    }

    public BigDecimal getRepairMoney() {
        return repairMoney;
    }

    public void setRepairMoney(BigDecimal repairMoney) {
        this.repairMoney = repairMoney;
    }

    public BigDecimal getRepairServicesMoney() {
        return repairServicesMoney;
    }

    public void setRepairServicesMoney(BigDecimal repairServicesMoney) {
        this.repairServicesMoney = repairServicesMoney;
    }

    public BigDecimal getRepairMaterialMoney() {
        return repairMaterialMoney;
    }

    public void setRepairMaterialMoney(BigDecimal repairMaterialMoney) {
        this.repairMaterialMoney = repairMaterialMoney;
    }

    public String getRepairCause() {
        return repairCause;
    }

    public void setRepairCause(String repairCause) {
        this.repairCause = repairCause == null ? null : repairCause.trim();
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus == null ? null : repairStatus.trim();
    }

    public String getRepairOperation() {
        return repairOperation;
    }

    public void setRepairOperation(String repairOperation) {
        this.repairOperation = repairOperation == null ? null : repairOperation.trim();
    }

    public Date getRepairUpdate() {
        return repairUpdate;
    }

    public void setRepairUpdate(Date repairUpdate) {
        this.repairUpdate = repairUpdate;
    }

    public String getRepairResult() {
        return repairResult;
    }

    public void setRepairResult(String repairResult) {
        this.repairResult = repairResult == null ? null : repairResult.trim();
    }

    public String getRepairRecordPeople() {
        return repairRecordPeople;
    }

    public void setRepairRecordPeople(String repairRecordPeople) {
        this.repairRecordPeople = repairRecordPeople == null ? null : repairRecordPeople.trim();
    }

    public Date getRepairVerifydate() {
        return repairVerifydate;
    }

    public void setRepairVerifydate(Date repairVerifydate) {
        this.repairVerifydate = repairVerifydate;
    }
}