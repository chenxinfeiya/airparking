package com.woniu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplainExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public ComplainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
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
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
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

        public Criteria andComplainidIsNull() {
            addCriterion("complainid is null");
            return (Criteria) this;
        }

        public Criteria andComplainidIsNotNull() {
            addCriterion("complainid is not null");
            return (Criteria) this;
        }

        public Criteria andComplainidEqualTo(Integer value) {
            addCriterion("complainid =", value, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidNotEqualTo(Integer value) {
            addCriterion("complainid <>", value, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidGreaterThan(Integer value) {
            addCriterion("complainid >", value, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidGreaterThanOrEqualTo(Integer value) {
            addCriterion("complainid >=", value, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidLessThan(Integer value) {
            addCriterion("complainid <", value, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidLessThanOrEqualTo(Integer value) {
            addCriterion("complainid <=", value, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidIn(List<Integer> values) {
            addCriterion("complainid in", values, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidNotIn(List<Integer> values) {
            addCriterion("complainid not in", values, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidBetween(Integer value1, Integer value2) {
            addCriterion("complainid between", value1, value2, "complainid");
            return (Criteria) this;
        }

        public Criteria andComplainidNotBetween(Integer value1, Integer value2) {
            addCriterion("complainid not between", value1, value2, "complainid");
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

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andComplaintimeIsNull() {
            addCriterion("complaintime is null");
            return (Criteria) this;
        }

        public Criteria andComplaintimeIsNotNull() {
            addCriterion("complaintime is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintimeEqualTo(Date value) {
            addCriterion("complaintime =", value, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeNotEqualTo(Date value) {
            addCriterion("complaintime <>", value, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeGreaterThan(Date value) {
            addCriterion("complaintime >", value, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complaintime >=", value, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeLessThan(Date value) {
            addCriterion("complaintime <", value, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeLessThanOrEqualTo(Date value) {
            addCriterion("complaintime <=", value, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeIn(List<Date> values) {
            addCriterion("complaintime in", values, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeNotIn(List<Date> values) {
            addCriterion("complaintime not in", values, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeBetween(Date value1, Date value2) {
            addCriterion("complaintime between", value1, value2, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaintimeNotBetween(Date value1, Date value2) {
            addCriterion("complaintime not between", value1, value2, "complaintime");
            return (Criteria) this;
        }

        public Criteria andComplaincontentIsNull() {
            addCriterion("complaincontent is null");
            return (Criteria) this;
        }

        public Criteria andComplaincontentIsNotNull() {
            addCriterion("complaincontent is not null");
            return (Criteria) this;
        }

        public Criteria andComplaincontentEqualTo(String value) {
            addCriterion("complaincontent =", value, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentNotEqualTo(String value) {
            addCriterion("complaincontent <>", value, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentGreaterThan(String value) {
            addCriterion("complaincontent >", value, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentGreaterThanOrEqualTo(String value) {
            addCriterion("complaincontent >=", value, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentLessThan(String value) {
            addCriterion("complaincontent <", value, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentLessThanOrEqualTo(String value) {
            addCriterion("complaincontent <=", value, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentLike(String value) {
            addCriterion("complaincontent like", value, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentNotLike(String value) {
            addCriterion("complaincontent not like", value, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentIn(List<String> values) {
            addCriterion("complaincontent in", values, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentNotIn(List<String> values) {
            addCriterion("complaincontent not in", values, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentBetween(String value1, String value2) {
            addCriterion("complaincontent between", value1, value2, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andComplaincontentNotBetween(String value1, String value2) {
            addCriterion("complaincontent not between", value1, value2, "complaincontent");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("replytime is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("replytime is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(Date value) {
            addCriterion("replytime =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(Date value) {
            addCriterion("replytime <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(Date value) {
            addCriterion("replytime >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("replytime >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(Date value) {
            addCriterion("replytime <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(Date value) {
            addCriterion("replytime <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<Date> values) {
            addCriterion("replytime in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<Date> values) {
            addCriterion("replytime not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(Date value1, Date value2) {
            addCriterion("replytime between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(Date value1, Date value2) {
            addCriterion("replytime not between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNull() {
            addCriterion("replycontent is null");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNotNull() {
            addCriterion("replycontent is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontentEqualTo(String value) {
            addCriterion("replycontent =", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotEqualTo(String value) {
            addCriterion("replycontent <>", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThan(String value) {
            addCriterion("replycontent >", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("replycontent >=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThan(String value) {
            addCriterion("replycontent <", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThanOrEqualTo(String value) {
            addCriterion("replycontent <=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLike(String value) {
            addCriterion("replycontent like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotLike(String value) {
            addCriterion("replycontent not like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentIn(List<String> values) {
            addCriterion("replycontent in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotIn(List<String> values) {
            addCriterion("replycontent not in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentBetween(String value1, String value2) {
            addCriterion("replycontent between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotBetween(String value1, String value2) {
            addCriterion("replycontent not between", value1, value2, "replycontent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 17 17:04:30 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
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