package com.woniu.model;

public class City {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    private Integer cityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityname
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    private String cityname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityid
     *
     * @return the value of city.cityid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cityid
     *
     * @param cityid the value for city.cityid
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityname
     *
     * @return the value of city.cityname
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cityname
     *
     * @param cityname the value for city.cityname
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
}