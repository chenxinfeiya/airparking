package com.woniu.model;

import java.util.Date;

public class Audit {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column audit.auditid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    private Integer auditid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column audit.parklicence
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    private String parklicence;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column audit.parkid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    private Integer parkid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column audit.aplytime
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    private Date aplytime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column audit.auditid
     *
     * @return the value of audit.auditid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public Integer getAuditid() {
        return auditid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column audit.auditid
     *
     * @param auditid the value for audit.auditid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void setAuditid(Integer auditid) {
        this.auditid = auditid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column audit.parklicence
     *
     * @return the value of audit.parklicence
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public String getParklicence() {
        return parklicence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column audit.parklicence
     *
     * @param parklicence the value for audit.parklicence
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void setParklicence(String parklicence) {
        this.parklicence = parklicence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column audit.parkid
     *
     * @return the value of audit.parkid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public Integer getParkid() {
        return parkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column audit.parkid
     *
     * @param parkid the value for audit.parkid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void setParkid(Integer parkid) {
        this.parkid = parkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column audit.aplytime
     *
     * @return the value of audit.aplytime
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public Date getAplytime() {
        return aplytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column audit.aplytime
     *
     * @param aplytime the value for audit.aplytime
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void setAplytime(Date aplytime) {
        this.aplytime = aplytime;
    }
}