package com.asset.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateIsNull() {
            addCriterion("repair_createdate is null");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateIsNotNull() {
            addCriterion("repair_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("repair_createdate =", value, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repair_createdate <>", value, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("repair_createdate >", value, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repair_createdate >=", value, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("repair_createdate <", value, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repair_createdate <=", value, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("repair_createdate in", values, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repair_createdate not in", values, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repair_createdate between", value1, value2, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repair_createdate not between", value1, value2, "repairCreatedate");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleIsNull() {
            addCriterion("repair_people is null");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleIsNotNull() {
            addCriterion("repair_people is not null");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleEqualTo(String value) {
            addCriterion("repair_people =", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleNotEqualTo(String value) {
            addCriterion("repair_people <>", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleGreaterThan(String value) {
            addCriterion("repair_people >", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("repair_people >=", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleLessThan(String value) {
            addCriterion("repair_people <", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleLessThanOrEqualTo(String value) {
            addCriterion("repair_people <=", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleLike(String value) {
            addCriterion("repair_people like", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleNotLike(String value) {
            addCriterion("repair_people not like", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleIn(List<String> values) {
            addCriterion("repair_people in", values, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleNotIn(List<String> values) {
            addCriterion("repair_people not in", values, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleBetween(String value1, String value2) {
            addCriterion("repair_people between", value1, value2, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleNotBetween(String value1, String value2) {
            addCriterion("repair_people not between", value1, value2, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyIsNull() {
            addCriterion("repair_money is null");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyIsNotNull() {
            addCriterion("repair_money is not null");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyEqualTo(BigDecimal value) {
            addCriterion("repair_money =", value, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyNotEqualTo(BigDecimal value) {
            addCriterion("repair_money <>", value, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyGreaterThan(BigDecimal value) {
            addCriterion("repair_money >", value, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_money >=", value, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyLessThan(BigDecimal value) {
            addCriterion("repair_money <", value, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_money <=", value, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyIn(List<BigDecimal> values) {
            addCriterion("repair_money in", values, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyNotIn(List<BigDecimal> values) {
            addCriterion("repair_money not in", values, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_money between", value1, value2, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_money not between", value1, value2, "repairMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyIsNull() {
            addCriterion("repair_services_money is null");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyIsNotNull() {
            addCriterion("repair_services_money is not null");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyEqualTo(BigDecimal value) {
            addCriterion("repair_services_money =", value, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyNotEqualTo(BigDecimal value) {
            addCriterion("repair_services_money <>", value, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyGreaterThan(BigDecimal value) {
            addCriterion("repair_services_money >", value, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_services_money >=", value, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyLessThan(BigDecimal value) {
            addCriterion("repair_services_money <", value, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_services_money <=", value, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyIn(List<BigDecimal> values) {
            addCriterion("repair_services_money in", values, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyNotIn(List<BigDecimal> values) {
            addCriterion("repair_services_money not in", values, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_services_money between", value1, value2, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairServicesMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_services_money not between", value1, value2, "repairServicesMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyIsNull() {
            addCriterion("repair_material_money is null");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyIsNotNull() {
            addCriterion("repair_material_money is not null");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyEqualTo(BigDecimal value) {
            addCriterion("repair_material_money =", value, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyNotEqualTo(BigDecimal value) {
            addCriterion("repair_material_money <>", value, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyGreaterThan(BigDecimal value) {
            addCriterion("repair_material_money >", value, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_material_money >=", value, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyLessThan(BigDecimal value) {
            addCriterion("repair_material_money <", value, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_material_money <=", value, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyIn(List<BigDecimal> values) {
            addCriterion("repair_material_money in", values, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyNotIn(List<BigDecimal> values) {
            addCriterion("repair_material_money not in", values, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_material_money between", value1, value2, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairMaterialMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_material_money not between", value1, value2, "repairMaterialMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCauseIsNull() {
            addCriterion("repair_cause is null");
            return (Criteria) this;
        }

        public Criteria andRepairCauseIsNotNull() {
            addCriterion("repair_cause is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCauseEqualTo(String value) {
            addCriterion("repair_cause =", value, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseNotEqualTo(String value) {
            addCriterion("repair_cause <>", value, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseGreaterThan(String value) {
            addCriterion("repair_cause >", value, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseGreaterThanOrEqualTo(String value) {
            addCriterion("repair_cause >=", value, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseLessThan(String value) {
            addCriterion("repair_cause <", value, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseLessThanOrEqualTo(String value) {
            addCriterion("repair_cause <=", value, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseLike(String value) {
            addCriterion("repair_cause like", value, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseNotLike(String value) {
            addCriterion("repair_cause not like", value, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseIn(List<String> values) {
            addCriterion("repair_cause in", values, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseNotIn(List<String> values) {
            addCriterion("repair_cause not in", values, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseBetween(String value1, String value2) {
            addCriterion("repair_cause between", value1, value2, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairCauseNotBetween(String value1, String value2) {
            addCriterion("repair_cause not between", value1, value2, "repairCause");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIsNull() {
            addCriterion("repair_status is null");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIsNotNull() {
            addCriterion("repair_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepairStatusEqualTo(String value) {
            addCriterion("repair_status =", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotEqualTo(String value) {
            addCriterion("repair_status <>", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusGreaterThan(String value) {
            addCriterion("repair_status >", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusGreaterThanOrEqualTo(String value) {
            addCriterion("repair_status >=", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLessThan(String value) {
            addCriterion("repair_status <", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLessThanOrEqualTo(String value) {
            addCriterion("repair_status <=", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLike(String value) {
            addCriterion("repair_status like", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotLike(String value) {
            addCriterion("repair_status not like", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIn(List<String> values) {
            addCriterion("repair_status in", values, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotIn(List<String> values) {
            addCriterion("repair_status not in", values, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusBetween(String value1, String value2) {
            addCriterion("repair_status between", value1, value2, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotBetween(String value1, String value2) {
            addCriterion("repair_status not between", value1, value2, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairOperationIsNull() {
            addCriterion("repair_operation is null");
            return (Criteria) this;
        }

        public Criteria andRepairOperationIsNotNull() {
            addCriterion("repair_operation is not null");
            return (Criteria) this;
        }

        public Criteria andRepairOperationEqualTo(String value) {
            addCriterion("repair_operation =", value, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationNotEqualTo(String value) {
            addCriterion("repair_operation <>", value, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationGreaterThan(String value) {
            addCriterion("repair_operation >", value, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationGreaterThanOrEqualTo(String value) {
            addCriterion("repair_operation >=", value, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationLessThan(String value) {
            addCriterion("repair_operation <", value, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationLessThanOrEqualTo(String value) {
            addCriterion("repair_operation <=", value, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationLike(String value) {
            addCriterion("repair_operation like", value, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationNotLike(String value) {
            addCriterion("repair_operation not like", value, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationIn(List<String> values) {
            addCriterion("repair_operation in", values, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationNotIn(List<String> values) {
            addCriterion("repair_operation not in", values, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationBetween(String value1, String value2) {
            addCriterion("repair_operation between", value1, value2, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairOperationNotBetween(String value1, String value2) {
            addCriterion("repair_operation not between", value1, value2, "repairOperation");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateIsNull() {
            addCriterion("repair_update is null");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateIsNotNull() {
            addCriterion("repair_update is not null");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("repair_update =", value, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repair_update <>", value, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("repair_update >", value, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repair_update >=", value, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateLessThan(Date value) {
            addCriterionForJDBCDate("repair_update <", value, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repair_update <=", value, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("repair_update in", values, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repair_update not in", values, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repair_update between", value1, value2, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repair_update not between", value1, value2, "repairUpdate");
            return (Criteria) this;
        }

        public Criteria andRepairResultIsNull() {
            addCriterion("repair_result is null");
            return (Criteria) this;
        }

        public Criteria andRepairResultIsNotNull() {
            addCriterion("repair_result is not null");
            return (Criteria) this;
        }

        public Criteria andRepairResultEqualTo(String value) {
            addCriterion("repair_result =", value, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultNotEqualTo(String value) {
            addCriterion("repair_result <>", value, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultGreaterThan(String value) {
            addCriterion("repair_result >", value, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultGreaterThanOrEqualTo(String value) {
            addCriterion("repair_result >=", value, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultLessThan(String value) {
            addCriterion("repair_result <", value, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultLessThanOrEqualTo(String value) {
            addCriterion("repair_result <=", value, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultLike(String value) {
            addCriterion("repair_result like", value, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultNotLike(String value) {
            addCriterion("repair_result not like", value, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultIn(List<String> values) {
            addCriterion("repair_result in", values, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultNotIn(List<String> values) {
            addCriterion("repair_result not in", values, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultBetween(String value1, String value2) {
            addCriterion("repair_result between", value1, value2, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairResultNotBetween(String value1, String value2) {
            addCriterion("repair_result not between", value1, value2, "repairResult");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleIsNull() {
            addCriterion("repair_record_people is null");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleIsNotNull() {
            addCriterion("repair_record_people is not null");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleEqualTo(String value) {
            addCriterion("repair_record_people =", value, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleNotEqualTo(String value) {
            addCriterion("repair_record_people <>", value, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleGreaterThan(String value) {
            addCriterion("repair_record_people >", value, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("repair_record_people >=", value, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleLessThan(String value) {
            addCriterion("repair_record_people <", value, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleLessThanOrEqualTo(String value) {
            addCriterion("repair_record_people <=", value, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleLike(String value) {
            addCriterion("repair_record_people like", value, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleNotLike(String value) {
            addCriterion("repair_record_people not like", value, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleIn(List<String> values) {
            addCriterion("repair_record_people in", values, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleNotIn(List<String> values) {
            addCriterion("repair_record_people not in", values, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleBetween(String value1, String value2) {
            addCriterion("repair_record_people between", value1, value2, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairRecordPeopleNotBetween(String value1, String value2) {
            addCriterion("repair_record_people not between", value1, value2, "repairRecordPeople");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateIsNull() {
            addCriterion("repair_verifydate is null");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateIsNotNull() {
            addCriterion("repair_verifydate is not null");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateEqualTo(Date value) {
            addCriterionForJDBCDate("repair_verifydate =", value, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repair_verifydate <>", value, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateGreaterThan(Date value) {
            addCriterionForJDBCDate("repair_verifydate >", value, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repair_verifydate >=", value, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateLessThan(Date value) {
            addCriterionForJDBCDate("repair_verifydate <", value, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repair_verifydate <=", value, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateIn(List<Date> values) {
            addCriterionForJDBCDate("repair_verifydate in", values, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repair_verifydate not in", values, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repair_verifydate between", value1, value2, "repairVerifydate");
            return (Criteria) this;
        }

        public Criteria andRepairVerifydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repair_verifydate not between", value1, value2, "repairVerifydate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}