package com.asset.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairApplyExample() {
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

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleIsNull() {
            addCriterion("apply_people is null");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleIsNotNull() {
            addCriterion("apply_people is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleEqualTo(String value) {
            addCriterion("apply_people =", value, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleNotEqualTo(String value) {
            addCriterion("apply_people <>", value, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleGreaterThan(String value) {
            addCriterion("apply_people >", value, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("apply_people >=", value, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleLessThan(String value) {
            addCriterion("apply_people <", value, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleLessThanOrEqualTo(String value) {
            addCriterion("apply_people <=", value, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleLike(String value) {
            addCriterion("apply_people like", value, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleNotLike(String value) {
            addCriterion("apply_people not like", value, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleIn(List<String> values) {
            addCriterion("apply_people in", values, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleNotIn(List<String> values) {
            addCriterion("apply_people not in", values, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleBetween(String value1, String value2) {
            addCriterion("apply_people between", value1, value2, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyPeopleNotBetween(String value1, String value2) {
            addCriterion("apply_people not between", value1, value2, "applyPeople");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIsNull() {
            addCriterion("apply_dept is null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIsNotNull() {
            addCriterion("apply_dept is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptEqualTo(String value) {
            addCriterion("apply_dept =", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotEqualTo(String value) {
            addCriterion("apply_dept <>", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptGreaterThan(String value) {
            addCriterion("apply_dept >", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptGreaterThanOrEqualTo(String value) {
            addCriterion("apply_dept >=", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLessThan(String value) {
            addCriterion("apply_dept <", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLessThanOrEqualTo(String value) {
            addCriterion("apply_dept <=", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLike(String value) {
            addCriterion("apply_dept like", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotLike(String value) {
            addCriterion("apply_dept not like", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIn(List<String> values) {
            addCriterion("apply_dept in", values, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotIn(List<String> values) {
            addCriterion("apply_dept not in", values, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptBetween(String value1, String value2) {
            addCriterion("apply_dept between", value1, value2, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotBetween(String value1, String value2) {
            addCriterion("apply_dept not between", value1, value2, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdIsNull() {
            addCriterion("apply_asset_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdIsNotNull() {
            addCriterion("apply_asset_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdEqualTo(Integer value) {
            addCriterion("apply_asset_id =", value, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdNotEqualTo(Integer value) {
            addCriterion("apply_asset_id <>", value, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdGreaterThan(Integer value) {
            addCriterion("apply_asset_id >", value, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_asset_id >=", value, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdLessThan(Integer value) {
            addCriterion("apply_asset_id <", value, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_asset_id <=", value, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdIn(List<Integer> values) {
            addCriterion("apply_asset_id in", values, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdNotIn(List<Integer> values) {
            addCriterion("apply_asset_id not in", values, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_asset_id between", value1, value2, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_asset_id not between", value1, value2, "applyAssetId");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameIsNull() {
            addCriterion("apply_asset_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameIsNotNull() {
            addCriterion("apply_asset_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameEqualTo(String value) {
            addCriterion("apply_asset_name =", value, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameNotEqualTo(String value) {
            addCriterion("apply_asset_name <>", value, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameGreaterThan(String value) {
            addCriterion("apply_asset_name >", value, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_asset_name >=", value, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameLessThan(String value) {
            addCriterion("apply_asset_name <", value, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameLessThanOrEqualTo(String value) {
            addCriterion("apply_asset_name <=", value, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameLike(String value) {
            addCriterion("apply_asset_name like", value, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameNotLike(String value) {
            addCriterion("apply_asset_name not like", value, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameIn(List<String> values) {
            addCriterion("apply_asset_name in", values, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameNotIn(List<String> values) {
            addCriterion("apply_asset_name not in", values, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameBetween(String value1, String value2) {
            addCriterion("apply_asset_name between", value1, value2, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNameNotBetween(String value1, String value2) {
            addCriterion("apply_asset_name not between", value1, value2, "applyAssetName");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecIsNull() {
            addCriterion("apply_asset_spec is null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecIsNotNull() {
            addCriterion("apply_asset_spec is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecEqualTo(String value) {
            addCriterion("apply_asset_spec =", value, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecNotEqualTo(String value) {
            addCriterion("apply_asset_spec <>", value, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecGreaterThan(String value) {
            addCriterion("apply_asset_spec >", value, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecGreaterThanOrEqualTo(String value) {
            addCriterion("apply_asset_spec >=", value, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecLessThan(String value) {
            addCriterion("apply_asset_spec <", value, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecLessThanOrEqualTo(String value) {
            addCriterion("apply_asset_spec <=", value, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecLike(String value) {
            addCriterion("apply_asset_spec like", value, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecNotLike(String value) {
            addCriterion("apply_asset_spec not like", value, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecIn(List<String> values) {
            addCriterion("apply_asset_spec in", values, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecNotIn(List<String> values) {
            addCriterion("apply_asset_spec not in", values, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecBetween(String value1, String value2) {
            addCriterion("apply_asset_spec between", value1, value2, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetSpecNotBetween(String value1, String value2) {
            addCriterion("apply_asset_spec not between", value1, value2, "applyAssetSpec");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumIsNull() {
            addCriterion("apply_asset_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumIsNotNull() {
            addCriterion("apply_asset_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumEqualTo(Integer value) {
            addCriterion("apply_asset_num =", value, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumNotEqualTo(Integer value) {
            addCriterion("apply_asset_num <>", value, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumGreaterThan(Integer value) {
            addCriterion("apply_asset_num >", value, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_asset_num >=", value, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumLessThan(Integer value) {
            addCriterion("apply_asset_num <", value, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumLessThanOrEqualTo(Integer value) {
            addCriterion("apply_asset_num <=", value, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumIn(List<Integer> values) {
            addCriterion("apply_asset_num in", values, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumNotIn(List<Integer> values) {
            addCriterion("apply_asset_num not in", values, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumBetween(Integer value1, Integer value2) {
            addCriterion("apply_asset_num between", value1, value2, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_asset_num not between", value1, value2, "applyAssetNum");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceIsNull() {
            addCriterion("apply_asset_place is null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceIsNotNull() {
            addCriterion("apply_asset_place is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceEqualTo(String value) {
            addCriterion("apply_asset_place =", value, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceNotEqualTo(String value) {
            addCriterion("apply_asset_place <>", value, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceGreaterThan(String value) {
            addCriterion("apply_asset_place >", value, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("apply_asset_place >=", value, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceLessThan(String value) {
            addCriterion("apply_asset_place <", value, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceLessThanOrEqualTo(String value) {
            addCriterion("apply_asset_place <=", value, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceLike(String value) {
            addCriterion("apply_asset_place like", value, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceNotLike(String value) {
            addCriterion("apply_asset_place not like", value, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceIn(List<String> values) {
            addCriterion("apply_asset_place in", values, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceNotIn(List<String> values) {
            addCriterion("apply_asset_place not in", values, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceBetween(String value1, String value2) {
            addCriterion("apply_asset_place between", value1, value2, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyAssetPlaceNotBetween(String value1, String value2) {
            addCriterion("apply_asset_place not between", value1, value2, "applyAssetPlace");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetIsNull() {
            addCriterion("apply_budget is null");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetIsNotNull() {
            addCriterion("apply_budget is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetEqualTo(Long value) {
            addCriterion("apply_budget =", value, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetNotEqualTo(Long value) {
            addCriterion("apply_budget <>", value, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetGreaterThan(Long value) {
            addCriterion("apply_budget >", value, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_budget >=", value, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetLessThan(Long value) {
            addCriterion("apply_budget <", value, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetLessThanOrEqualTo(Long value) {
            addCriterion("apply_budget <=", value, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetIn(List<Long> values) {
            addCriterion("apply_budget in", values, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetNotIn(List<Long> values) {
            addCriterion("apply_budget not in", values, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetBetween(Long value1, Long value2) {
            addCriterion("apply_budget between", value1, value2, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyBudgetNotBetween(Long value1, Long value2) {
            addCriterion("apply_budget not between", value1, value2, "applyBudget");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeIsNull() {
            addCriterion("apply_degree is null");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeIsNotNull() {
            addCriterion("apply_degree is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeEqualTo(Integer value) {
            addCriterion("apply_degree =", value, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeNotEqualTo(Integer value) {
            addCriterion("apply_degree <>", value, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeGreaterThan(Integer value) {
            addCriterion("apply_degree >", value, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_degree >=", value, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeLessThan(Integer value) {
            addCriterion("apply_degree <", value, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("apply_degree <=", value, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeIn(List<Integer> values) {
            addCriterion("apply_degree in", values, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeNotIn(List<Integer> values) {
            addCriterion("apply_degree not in", values, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeBetween(Integer value1, Integer value2) {
            addCriterion("apply_degree between", value1, value2, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_degree not between", value1, value2, "applyDegree");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateIsNull() {
            addCriterion("apply_repairdate is null");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateIsNotNull() {
            addCriterion("apply_repairdate is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateEqualTo(Date value) {
            addCriterion("apply_repairdate =", value, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateNotEqualTo(Date value) {
            addCriterion("apply_repairdate <>", value, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateGreaterThan(Date value) {
            addCriterion("apply_repairdate >", value, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_repairdate >=", value, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateLessThan(Date value) {
            addCriterion("apply_repairdate <", value, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateLessThanOrEqualTo(Date value) {
            addCriterion("apply_repairdate <=", value, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateIn(List<Date> values) {
            addCriterion("apply_repairdate in", values, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateNotIn(List<Date> values) {
            addCriterion("apply_repairdate not in", values, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateBetween(Date value1, Date value2) {
            addCriterion("apply_repairdate between", value1, value2, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyRepairdateNotBetween(Date value1, Date value2) {
            addCriterion("apply_repairdate not between", value1, value2, "applyRepairdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateIsNull() {
            addCriterion("apply_finishdate is null");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateIsNotNull() {
            addCriterion("apply_finishdate is not null");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateEqualTo(Date value) {
            addCriterion("apply_finishdate =", value, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateNotEqualTo(Date value) {
            addCriterion("apply_finishdate <>", value, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateGreaterThan(Date value) {
            addCriterion("apply_finishdate >", value, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_finishdate >=", value, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateLessThan(Date value) {
            addCriterion("apply_finishdate <", value, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateLessThanOrEqualTo(Date value) {
            addCriterion("apply_finishdate <=", value, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateIn(List<Date> values) {
            addCriterion("apply_finishdate in", values, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateNotIn(List<Date> values) {
            addCriterion("apply_finishdate not in", values, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateBetween(Date value1, Date value2) {
            addCriterion("apply_finishdate between", value1, value2, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyFinishdateNotBetween(Date value1, Date value2) {
            addCriterion("apply_finishdate not between", value1, value2, "applyFinishdate");
            return (Criteria) this;
        }

        public Criteria andApplyContentIsNull() {
            addCriterion("apply_content is null");
            return (Criteria) this;
        }

        public Criteria andApplyContentIsNotNull() {
            addCriterion("apply_content is not null");
            return (Criteria) this;
        }

        public Criteria andApplyContentEqualTo(String value) {
            addCriterion("apply_content =", value, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentNotEqualTo(String value) {
            addCriterion("apply_content <>", value, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentGreaterThan(String value) {
            addCriterion("apply_content >", value, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("apply_content >=", value, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentLessThan(String value) {
            addCriterion("apply_content <", value, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentLessThanOrEqualTo(String value) {
            addCriterion("apply_content <=", value, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentLike(String value) {
            addCriterion("apply_content like", value, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentNotLike(String value) {
            addCriterion("apply_content not like", value, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentIn(List<String> values) {
            addCriterion("apply_content in", values, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentNotIn(List<String> values) {
            addCriterion("apply_content not in", values, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentBetween(String value1, String value2) {
            addCriterion("apply_content between", value1, value2, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyContentNotBetween(String value1, String value2) {
            addCriterion("apply_content not between", value1, value2, "applyContent");
            return (Criteria) this;
        }

        public Criteria andApplyCaseIsNull() {
            addCriterion("apply_case is null");
            return (Criteria) this;
        }

        public Criteria andApplyCaseIsNotNull() {
            addCriterion("apply_case is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCaseEqualTo(String value) {
            addCriterion("apply_case =", value, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseNotEqualTo(String value) {
            addCriterion("apply_case <>", value, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseGreaterThan(String value) {
            addCriterion("apply_case >", value, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseGreaterThanOrEqualTo(String value) {
            addCriterion("apply_case >=", value, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseLessThan(String value) {
            addCriterion("apply_case <", value, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseLessThanOrEqualTo(String value) {
            addCriterion("apply_case <=", value, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseLike(String value) {
            addCriterion("apply_case like", value, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseNotLike(String value) {
            addCriterion("apply_case not like", value, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseIn(List<String> values) {
            addCriterion("apply_case in", values, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseNotIn(List<String> values) {
            addCriterion("apply_case not in", values, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseBetween(String value1, String value2) {
            addCriterion("apply_case between", value1, value2, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyCaseNotBetween(String value1, String value2) {
            addCriterion("apply_case not between", value1, value2, "applyCase");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNull() {
            addCriterion("apply_status is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNotNull() {
            addCriterion("apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusEqualTo(Integer value) {
            addCriterion("apply_status =", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotEqualTo(Integer value) {
            addCriterion("apply_status <>", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThan(Integer value) {
            addCriterion("apply_status >", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_status >=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThan(Integer value) {
            addCriterion("apply_status <", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("apply_status <=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIn(List<Integer> values) {
            addCriterion("apply_status in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotIn(List<Integer> values) {
            addCriterion("apply_status not in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusBetween(Integer value1, Integer value2) {
            addCriterion("apply_status between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_status not between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyExamineIsNull() {
            addCriterion("apply_examine is null");
            return (Criteria) this;
        }

        public Criteria andApplyExamineIsNotNull() {
            addCriterion("apply_examine is not null");
            return (Criteria) this;
        }

        public Criteria andApplyExamineEqualTo(Integer value) {
            addCriterion("apply_examine =", value, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineNotEqualTo(Integer value) {
            addCriterion("apply_examine <>", value, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineGreaterThan(Integer value) {
            addCriterion("apply_examine >", value, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_examine >=", value, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineLessThan(Integer value) {
            addCriterion("apply_examine <", value, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineLessThanOrEqualTo(Integer value) {
            addCriterion("apply_examine <=", value, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineIn(List<Integer> values) {
            addCriterion("apply_examine in", values, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineNotIn(List<Integer> values) {
            addCriterion("apply_examine not in", values, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineBetween(Integer value1, Integer value2) {
            addCriterion("apply_examine between", value1, value2, "applyExamine");
            return (Criteria) this;
        }

        public Criteria andApplyExamineNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_examine not between", value1, value2, "applyExamine");
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