package com.woniu.model;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.roleid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private Integer roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rolename
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    private String rolename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.roleid
     *
     * @return the value of role.roleid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.roleid
     *
     * @param roleid the value for role.roleid
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rolename
     *
     * @return the value of role.rolename
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rolename
     *
     * @param rolename the value for role.rolename
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}