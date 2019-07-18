package com.woniu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PorderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public PorderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
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
     * This method corresponds to the database table porder
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
     * This method corresponds to the database table porder
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
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
     * This class corresponds to the database table porder
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
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

        public Criteria andOcreatetimeIsNull() {
            addCriterion("ocreatetime is null");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeIsNotNull() {
            addCriterion("ocreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeEqualTo(Date value) {
            addCriterion("ocreatetime =", value, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeNotEqualTo(Date value) {
            addCriterion("ocreatetime <>", value, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeGreaterThan(Date value) {
            addCriterion("ocreatetime >", value, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ocreatetime >=", value, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeLessThan(Date value) {
            addCriterion("ocreatetime <", value, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ocreatetime <=", value, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeIn(List<Date> values) {
            addCriterion("ocreatetime in", values, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeNotIn(List<Date> values) {
            addCriterion("ocreatetime not in", values, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeBetween(Date value1, Date value2) {
            addCriterion("ocreatetime between", value1, value2, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ocreatetime not between", value1, value2, "ocreatetime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeIsNull() {
            addCriterion("ostarttime is null");
            return (Criteria) this;
        }

        public Criteria andOstarttimeIsNotNull() {
            addCriterion("ostarttime is not null");
            return (Criteria) this;
        }

        public Criteria andOstarttimeEqualTo(Date value) {
            addCriterion("ostarttime =", value, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeNotEqualTo(Date value) {
            addCriterion("ostarttime <>", value, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeGreaterThan(Date value) {
            addCriterion("ostarttime >", value, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ostarttime >=", value, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeLessThan(Date value) {
            addCriterion("ostarttime <", value, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("ostarttime <=", value, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeIn(List<Date> values) {
            addCriterion("ostarttime in", values, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeNotIn(List<Date> values) {
            addCriterion("ostarttime not in", values, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeBetween(Date value1, Date value2) {
            addCriterion("ostarttime between", value1, value2, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("ostarttime not between", value1, value2, "ostarttime");
            return (Criteria) this;
        }

        public Criteria andOendtimeIsNull() {
            addCriterion("oendtime is null");
            return (Criteria) this;
        }

        public Criteria andOendtimeIsNotNull() {
            addCriterion("oendtime is not null");
            return (Criteria) this;
        }

        public Criteria andOendtimeEqualTo(Date value) {
            addCriterion("oendtime =", value, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeNotEqualTo(Date value) {
            addCriterion("oendtime <>", value, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeGreaterThan(Date value) {
            addCriterion("oendtime >", value, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oendtime >=", value, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeLessThan(Date value) {
            addCriterion("oendtime <", value, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeLessThanOrEqualTo(Date value) {
            addCriterion("oendtime <=", value, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeIn(List<Date> values) {
            addCriterion("oendtime in", values, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeNotIn(List<Date> values) {
            addCriterion("oendtime not in", values, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeBetween(Date value1, Date value2) {
            addCriterion("oendtime between", value1, value2, "oendtime");
            return (Criteria) this;
        }

        public Criteria andOendtimeNotBetween(Date value1, Date value2) {
            addCriterion("oendtime not between", value1, value2, "oendtime");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalprice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Double value) {
            addCriterion("totalprice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Double value) {
            addCriterion("totalprice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Double value) {
            addCriterion("totalprice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("totalprice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Double value) {
            addCriterion("totalprice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("totalprice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Double> values) {
            addCriterion("totalprice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Double> values) {
            addCriterion("totalprice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Double value1, Double value2) {
            addCriterion("totalprice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("totalprice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andIscompletedIsNull() {
            addCriterion("iscompleted is null");
            return (Criteria) this;
        }

        public Criteria andIscompletedIsNotNull() {
            addCriterion("iscompleted is not null");
            return (Criteria) this;
        }

        public Criteria andIscompletedEqualTo(Boolean value) {
            addCriterion("iscompleted =", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedNotEqualTo(Boolean value) {
            addCriterion("iscompleted <>", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedGreaterThan(Boolean value) {
            addCriterion("iscompleted >", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iscompleted >=", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedLessThan(Boolean value) {
            addCriterion("iscompleted <", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedLessThanOrEqualTo(Boolean value) {
            addCriterion("iscompleted <=", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedIn(List<Boolean> values) {
            addCriterion("iscompleted in", values, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedNotIn(List<Boolean> values) {
            addCriterion("iscompleted not in", values, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedBetween(Boolean value1, Boolean value2) {
            addCriterion("iscompleted between", value1, value2, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iscompleted not between", value1, value2, "iscompleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table porder
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
     * This class corresponds to the database table porder
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