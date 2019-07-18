package com.woniu.model;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public CarExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
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

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carid like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carid not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCarnumIsNull() {
            addCriterion("carnum is null");
            return (Criteria) this;
        }

        public Criteria andCarnumIsNotNull() {
            addCriterion("carnum is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumEqualTo(String value) {
            addCriterion("carnum =", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotEqualTo(String value) {
            addCriterion("carnum <>", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThan(String value) {
            addCriterion("carnum >", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThanOrEqualTo(String value) {
            addCriterion("carnum >=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThan(String value) {
            addCriterion("carnum <", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThanOrEqualTo(String value) {
            addCriterion("carnum <=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLike(String value) {
            addCriterion("carnum like", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotLike(String value) {
            addCriterion("carnum not like", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumIn(List<String> values) {
            addCriterion("carnum in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotIn(List<String> values) {
            addCriterion("carnum not in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumBetween(String value1, String value2) {
            addCriterion("carnum between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotBetween(String value1, String value2) {
            addCriterion("carnum not between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarcolorIsNull() {
            addCriterion("carcolor is null");
            return (Criteria) this;
        }

        public Criteria andCarcolorIsNotNull() {
            addCriterion("carcolor is not null");
            return (Criteria) this;
        }

        public Criteria andCarcolorEqualTo(String value) {
            addCriterion("carcolor =", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorNotEqualTo(String value) {
            addCriterion("carcolor <>", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorGreaterThan(String value) {
            addCriterion("carcolor >", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorGreaterThanOrEqualTo(String value) {
            addCriterion("carcolor >=", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorLessThan(String value) {
            addCriterion("carcolor <", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorLessThanOrEqualTo(String value) {
            addCriterion("carcolor <=", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorLike(String value) {
            addCriterion("carcolor like", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorNotLike(String value) {
            addCriterion("carcolor not like", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorIn(List<String> values) {
            addCriterion("carcolor in", values, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorNotIn(List<String> values) {
            addCriterion("carcolor not in", values, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorBetween(String value1, String value2) {
            addCriterion("carcolor between", value1, value2, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorNotBetween(String value1, String value2) {
            addCriterion("carcolor not between", value1, value2, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNull() {
            addCriterion("carbrand is null");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNotNull() {
            addCriterion("carbrand is not null");
            return (Criteria) this;
        }

        public Criteria andCarbrandEqualTo(String value) {
            addCriterion("carbrand =", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotEqualTo(String value) {
            addCriterion("carbrand <>", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThan(String value) {
            addCriterion("carbrand >", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThanOrEqualTo(String value) {
            addCriterion("carbrand >=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThan(String value) {
            addCriterion("carbrand <", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThanOrEqualTo(String value) {
            addCriterion("carbrand <=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLike(String value) {
            addCriterion("carbrand like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotLike(String value) {
            addCriterion("carbrand not like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandIn(List<String> values) {
            addCriterion("carbrand in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotIn(List<String> values) {
            addCriterion("carbrand not in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandBetween(String value1, String value2) {
            addCriterion("carbrand between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotBetween(String value1, String value2) {
            addCriterion("carbrand not between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarinfoIsNull() {
            addCriterion("carinfo is null");
            return (Criteria) this;
        }

        public Criteria andCarinfoIsNotNull() {
            addCriterion("carinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCarinfoEqualTo(String value) {
            addCriterion("carinfo =", value, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoNotEqualTo(String value) {
            addCriterion("carinfo <>", value, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoGreaterThan(String value) {
            addCriterion("carinfo >", value, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoGreaterThanOrEqualTo(String value) {
            addCriterion("carinfo >=", value, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoLessThan(String value) {
            addCriterion("carinfo <", value, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoLessThanOrEqualTo(String value) {
            addCriterion("carinfo <=", value, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoLike(String value) {
            addCriterion("carinfo like", value, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoNotLike(String value) {
            addCriterion("carinfo not like", value, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoIn(List<String> values) {
            addCriterion("carinfo in", values, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoNotIn(List<String> values) {
            addCriterion("carinfo not in", values, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoBetween(String value1, String value2) {
            addCriterion("carinfo between", value1, value2, "carinfo");
            return (Criteria) this;
        }

        public Criteria andCarinfoNotBetween(String value1, String value2) {
            addCriterion("carinfo not between", value1, value2, "carinfo");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Boolean value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Boolean value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Boolean value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Boolean value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Boolean> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Boolean> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table car
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 18 16:02:22 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table car
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
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