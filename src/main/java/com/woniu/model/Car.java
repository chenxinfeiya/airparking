package com.woniu.model;

import java.io.Serializable;

public class Car implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.carid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private String carid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.userid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.carnum
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private String carnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.carcolor
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private String carcolor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.carbrand
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private String carbrand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.carinfo
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private String carinfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.isdelete
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private Boolean isdelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.carid
     *
     * @return the value of car.carid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public String getCarid() {
        return carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.carid
     *
     * @param carid the value for car.carid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setCarid(String carid) {
        this.carid = carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.userid
     *
     * @return the value of car.userid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.userid
     *
     * @param userid the value for car.userid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.carnum
     *
     * @return the value of car.carnum
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public String getCarnum() {
        return carnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.carnum
     *
     * @param carnum the value for car.carnum
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.carcolor
     *
     * @return the value of car.carcolor
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public String getCarcolor() {
        return carcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.carcolor
     *
     * @param carcolor the value for car.carcolor
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.carbrand
     *
     * @return the value of car.carbrand
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public String getCarbrand() {
        return carbrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.carbrand
     *
     * @param carbrand the value for car.carbrand
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.carinfo
     *
     * @return the value of car.carinfo
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public String getCarinfo() {
        return carinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.carinfo
     *
     * @param carinfo the value for car.carinfo
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setCarinfo(String carinfo) {
        this.carinfo = carinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.isdelete
     *
     * @return the value of car.isdelete
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.isdelete
     *
     * @param isdelete the value for car.isdelete
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}