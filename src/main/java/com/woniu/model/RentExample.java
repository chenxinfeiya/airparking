package com.woniu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public RentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
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
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
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

        public Criteria andRentidIsNull() {
            addCriterion("rentid is null");
            return (Criteria) this;
        }

        public Criteria andRentidIsNotNull() {
            addCriterion("rentid is not null");
            return (Criteria) this;
        }

        public Criteria andRentidEqualTo(Integer value) {
            addCriterion("rentid =", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidNotEqualTo(Integer value) {
            addCriterion("rentid <>", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidGreaterThan(Integer value) {
            addCriterion("rentid >", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rentid >=", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidLessThan(Integer value) {
            addCriterion("rentid <", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidLessThanOrEqualTo(Integer value) {
            addCriterion("rentid <=", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidIn(List<Integer> values) {
            addCriterion("rentid in", values, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidNotIn(List<Integer> values) {
            addCriterion("rentid not in", values, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidBetween(Integer value1, Integer value2) {
            addCriterion("rentid between", value1, value2, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidNotBetween(Integer value1, Integer value2) {
            addCriterion("rentid not between", value1, value2, "rentid");
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

        public Criteria andParkidEqualTo(Integer value) {
            addCriterion("parkid =", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotEqualTo(Integer value) {
            addCriterion("parkid <>", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidGreaterThan(Integer value) {
            addCriterion("parkid >", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parkid >=", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLessThan(Integer value) {
            addCriterion("parkid <", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLessThanOrEqualTo(Integer value) {
            addCriterion("parkid <=", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidIn(List<Integer> values) {
            addCriterion("parkid in", values, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotIn(List<Integer> values) {
            addCriterion("parkid not in", values, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidBetween(Integer value1, Integer value2) {
            addCriterion("parkid between", value1, value2, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotBetween(Integer value1, Integer value2) {
            addCriterion("parkid not between", value1, value2, "parkid");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeIsNull() {
            addCriterion("rentstarttime is null");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeIsNotNull() {
            addCriterion("rentstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeEqualTo(Date value) {
            addCriterion("rentstarttime =", value, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeNotEqualTo(Date value) {
            addCriterion("rentstarttime <>", value, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeGreaterThan(Date value) {
            addCriterion("rentstarttime >", value, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rentstarttime >=", value, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeLessThan(Date value) {
            addCriterion("rentstarttime <", value, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("rentstarttime <=", value, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeIn(List<Date> values) {
            addCriterion("rentstarttime in", values, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeNotIn(List<Date> values) {
            addCriterion("rentstarttime not in", values, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeBetween(Date value1, Date value2) {
            addCriterion("rentstarttime between", value1, value2, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("rentstarttime not between", value1, value2, "rentstarttime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeIsNull() {
            addCriterion("rentendtime is null");
            return (Criteria) this;
        }

        public Criteria andRentendtimeIsNotNull() {
            addCriterion("rentendtime is not null");
            return (Criteria) this;
        }

        public Criteria andRentendtimeEqualTo(Date value) {
            addCriterion("rentendtime =", value, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeNotEqualTo(Date value) {
            addCriterion("rentendtime <>", value, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeGreaterThan(Date value) {
            addCriterion("rentendtime >", value, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rentendtime >=", value, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeLessThan(Date value) {
            addCriterion("rentendtime <", value, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeLessThanOrEqualTo(Date value) {
            addCriterion("rentendtime <=", value, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeIn(List<Date> values) {
            addCriterion("rentendtime in", values, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeNotIn(List<Date> values) {
            addCriterion("rentendtime not in", values, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeBetween(Date value1, Date value2) {
            addCriterion("rentendtime between", value1, value2, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andRentendtimeNotBetween(Date value1, Date value2) {
            addCriterion("rentendtime not between", value1, value2, "rentendtime");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(String value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(String value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(String value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(String value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(String value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(String value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLike(String value) {
            addCriterion("week like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotLike(String value) {
            addCriterion("week not like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<String> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<String> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(String value1, String value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(String value1, String value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1IsNull() {
            addCriterion("rentstarttime1 is null");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1IsNotNull() {
            addCriterion("rentstarttime1 is not null");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1EqualTo(Date value) {
            addCriterion("rentstarttime1 =", value, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1NotEqualTo(Date value) {
            addCriterion("rentstarttime1 <>", value, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1GreaterThan(Date value) {
            addCriterion("rentstarttime1 >", value, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1GreaterThanOrEqualTo(Date value) {
            addCriterion("rentstarttime1 >=", value, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1LessThan(Date value) {
            addCriterion("rentstarttime1 <", value, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1LessThanOrEqualTo(Date value) {
            addCriterion("rentstarttime1 <=", value, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1In(List<Date> values) {
            addCriterion("rentstarttime1 in", values, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1NotIn(List<Date> values) {
            addCriterion("rentstarttime1 not in", values, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1Between(Date value1, Date value2) {
            addCriterion("rentstarttime1 between", value1, value2, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime1NotBetween(Date value1, Date value2) {
            addCriterion("rentstarttime1 not between", value1, value2, "rentstarttime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1IsNull() {
            addCriterion("rentendtime1 is null");
            return (Criteria) this;
        }

        public Criteria andRentendtime1IsNotNull() {
            addCriterion("rentendtime1 is not null");
            return (Criteria) this;
        }

        public Criteria andRentendtime1EqualTo(Date value) {
            addCriterion("rentendtime1 =", value, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1NotEqualTo(Date value) {
            addCriterion("rentendtime1 <>", value, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1GreaterThan(Date value) {
            addCriterion("rentendtime1 >", value, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1GreaterThanOrEqualTo(Date value) {
            addCriterion("rentendtime1 >=", value, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1LessThan(Date value) {
            addCriterion("rentendtime1 <", value, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1LessThanOrEqualTo(Date value) {
            addCriterion("rentendtime1 <=", value, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1In(List<Date> values) {
            addCriterion("rentendtime1 in", values, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1NotIn(List<Date> values) {
            addCriterion("rentendtime1 not in", values, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1Between(Date value1, Date value2) {
            addCriterion("rentendtime1 between", value1, value2, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentendtime1NotBetween(Date value1, Date value2) {
            addCriterion("rentendtime1 not between", value1, value2, "rentendtime1");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2IsNull() {
            addCriterion("rentstarttime2 is null");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2IsNotNull() {
            addCriterion("rentstarttime2 is not null");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2EqualTo(Date value) {
            addCriterion("rentstarttime2 =", value, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2NotEqualTo(Date value) {
            addCriterion("rentstarttime2 <>", value, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2GreaterThan(Date value) {
            addCriterion("rentstarttime2 >", value, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2GreaterThanOrEqualTo(Date value) {
            addCriterion("rentstarttime2 >=", value, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2LessThan(Date value) {
            addCriterion("rentstarttime2 <", value, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2LessThanOrEqualTo(Date value) {
            addCriterion("rentstarttime2 <=", value, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2In(List<Date> values) {
            addCriterion("rentstarttime2 in", values, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2NotIn(List<Date> values) {
            addCriterion("rentstarttime2 not in", values, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2Between(Date value1, Date value2) {
            addCriterion("rentstarttime2 between", value1, value2, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentstarttime2NotBetween(Date value1, Date value2) {
            addCriterion("rentstarttime2 not between", value1, value2, "rentstarttime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2IsNull() {
            addCriterion("rentendtime2 is null");
            return (Criteria) this;
        }

        public Criteria andRentendtime2IsNotNull() {
            addCriterion("rentendtime2 is not null");
            return (Criteria) this;
        }

        public Criteria andRentendtime2EqualTo(Date value) {
            addCriterion("rentendtime2 =", value, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2NotEqualTo(Date value) {
            addCriterion("rentendtime2 <>", value, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2GreaterThan(Date value) {
            addCriterion("rentendtime2 >", value, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2GreaterThanOrEqualTo(Date value) {
            addCriterion("rentendtime2 >=", value, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2LessThan(Date value) {
            addCriterion("rentendtime2 <", value, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2LessThanOrEqualTo(Date value) {
            addCriterion("rentendtime2 <=", value, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2In(List<Date> values) {
            addCriterion("rentendtime2 in", values, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2NotIn(List<Date> values) {
            addCriterion("rentendtime2 not in", values, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2Between(Date value1, Date value2) {
            addCriterion("rentendtime2 between", value1, value2, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andRentendtime2NotBetween(Date value1, Date value2) {
            addCriterion("rentendtime2 not between", value1, value2, "rentendtime2");
            return (Criteria) this;
        }

        public Criteria andIsputawayIsNull() {
            addCriterion("isputaway is null");
            return (Criteria) this;
        }

        public Criteria andIsputawayIsNotNull() {
            addCriterion("isputaway is not null");
            return (Criteria) this;
        }

        public Criteria andIsputawayEqualTo(Boolean value) {
            addCriterion("isputaway =", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotEqualTo(Boolean value) {
            addCriterion("isputaway <>", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayGreaterThan(Boolean value) {
            addCriterion("isputaway >", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isputaway >=", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayLessThan(Boolean value) {
            addCriterion("isputaway <", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayLessThanOrEqualTo(Boolean value) {
            addCriterion("isputaway <=", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayIn(List<Boolean> values) {
            addCriterion("isputaway in", values, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotIn(List<Boolean> values) {
            addCriterion("isputaway not in", values, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayBetween(Boolean value1, Boolean value2) {
            addCriterion("isputaway between", value1, value2, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isputaway not between", value1, value2, "isputaway");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rent
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 17 20:24:16 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rent
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
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