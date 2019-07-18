package com.woniu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AuditExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public AuditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
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
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
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

        public Criteria andAuditidIsNull() {
            addCriterion("auditid is null");
            return (Criteria) this;
        }

        public Criteria andAuditidIsNotNull() {
            addCriterion("auditid is not null");
            return (Criteria) this;
        }

        public Criteria andAuditidEqualTo(String value) {
            addCriterion("auditid =", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidNotEqualTo(String value) {
            addCriterion("auditid <>", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidGreaterThan(String value) {
            addCriterion("auditid >", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidGreaterThanOrEqualTo(String value) {
            addCriterion("auditid >=", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidLessThan(String value) {
            addCriterion("auditid <", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidLessThanOrEqualTo(String value) {
            addCriterion("auditid <=", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidLike(String value) {
            addCriterion("auditid like", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidNotLike(String value) {
            addCriterion("auditid not like", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidIn(List<String> values) {
            addCriterion("auditid in", values, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidNotIn(List<String> values) {
            addCriterion("auditid not in", values, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidBetween(String value1, String value2) {
            addCriterion("auditid between", value1, value2, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidNotBetween(String value1, String value2) {
            addCriterion("auditid not between", value1, value2, "auditid");
            return (Criteria) this;
        }

        public Criteria andParkidIsNull() {
            addCriterion("parkid is null");
            return (Criteria) this;
        }

        public Criteria andParkidIsNotNull() {
            addCriterion("parkid is not null");
            return (Criteria) this;
        }

        public Criteria andParkidEqualTo(String value) {
            addCriterion("parkid =", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotEqualTo(String value) {
            addCriterion("parkid <>", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidGreaterThan(String value) {
            addCriterion("parkid >", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidGreaterThanOrEqualTo(String value) {
            addCriterion("parkid >=", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLessThan(String value) {
            addCriterion("parkid <", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLessThanOrEqualTo(String value) {
            addCriterion("parkid <=", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLike(String value) {
            addCriterion("parkid like", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotLike(String value) {
            addCriterion("parkid not like", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidIn(List<String> values) {
            addCriterion("parkid in", values, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotIn(List<String> values) {
            addCriterion("parkid not in", values, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidBetween(String value1, String value2) {
            addCriterion("parkid between", value1, value2, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotBetween(String value1, String value2) {
            addCriterion("parkid not between", value1, value2, "parkid");
            return (Criteria) this;
        }

        public Criteria andParklicenceIsNull() {
            addCriterion("parklicence is null");
            return (Criteria) this;
        }

        public Criteria andParklicenceIsNotNull() {
            addCriterion("parklicence is not null");
            return (Criteria) this;
        }

        public Criteria andParklicenceEqualTo(String value) {
            addCriterion("parklicence =", value, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceNotEqualTo(String value) {
            addCriterion("parklicence <>", value, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceGreaterThan(String value) {
            addCriterion("parklicence >", value, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceGreaterThanOrEqualTo(String value) {
            addCriterion("parklicence >=", value, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceLessThan(String value) {
            addCriterion("parklicence <", value, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceLessThanOrEqualTo(String value) {
            addCriterion("parklicence <=", value, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceLike(String value) {
            addCriterion("parklicence like", value, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceNotLike(String value) {
            addCriterion("parklicence not like", value, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceIn(List<String> values) {
            addCriterion("parklicence in", values, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceNotIn(List<String> values) {
            addCriterion("parklicence not in", values, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceBetween(String value1, String value2) {
            addCriterion("parklicence between", value1, value2, "parklicence");
            return (Criteria) this;
        }

        public Criteria andParklicenceNotBetween(String value1, String value2) {
            addCriterion("parklicence not between", value1, value2, "parklicence");
            return (Criteria) this;
        }

        public Criteria andAplytimeIsNull() {
            addCriterion("aplytime is null");
            return (Criteria) this;
        }

        public Criteria andAplytimeIsNotNull() {
            addCriterion("aplytime is not null");
            return (Criteria) this;
        }

        public Criteria andAplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("aplytime =", value, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("aplytime <>", value, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("aplytime >", value, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aplytime >=", value, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeLessThan(Date value) {
            addCriterionForJDBCDate("aplytime <", value, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aplytime <=", value, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("aplytime in", values, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("aplytime not in", values, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aplytime between", value1, value2, "aplytime");
            return (Criteria) this;
        }

        public Criteria andAplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aplytime not between", value1, value2, "aplytime");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNull() {
            addCriterion("isfinish is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNotNull() {
            addCriterion("isfinish is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishEqualTo(Boolean value) {
            addCriterion("isfinish =", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotEqualTo(Boolean value) {
            addCriterion("isfinish <>", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThan(Boolean value) {
            addCriterion("isfinish >", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isfinish >=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThan(Boolean value) {
            addCriterion("isfinish <", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThanOrEqualTo(Boolean value) {
            addCriterion("isfinish <=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishIn(List<Boolean> values) {
            addCriterion("isfinish in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotIn(List<Boolean> values) {
            addCriterion("isfinish not in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishBetween(Boolean value1, Boolean value2) {
            addCriterion("isfinish between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isfinish not between", value1, value2, "isfinish");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table audit
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 18 16:44:42 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table audit
     *
     * @mbggenerated Thu Jul 18 16:44:42 CST 2019
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