package com.woniu.model;

import java.util.Date;

public class Comment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.commentid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    private String commentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.parkid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    private String parkid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.userid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.commenttime
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    private Date commenttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.commentcontent
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    private String commentcontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.isdelete
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    private Boolean isdelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.commentid
     *
     * @return the value of comment.commentid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public String getCommentid() {
        return commentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.commentid
     *
     * @param commentid the value for comment.commentid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.parkid
     *
     * @return the value of comment.parkid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public String getParkid() {
        return parkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.parkid
     *
     * @param parkid the value for comment.parkid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.userid
     *
     * @return the value of comment.userid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.userid
     *
     * @param userid the value for comment.userid
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.commenttime
     *
     * @return the value of comment.commenttime
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public Date getCommenttime() {
        return commenttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.commenttime
     *
     * @param commenttime the value for comment.commenttime
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.commentcontent
     *
     * @return the value of comment.commentcontent
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public String getCommentcontent() {
        return commentcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.commentcontent
     *
     * @param commentcontent the value for comment.commentcontent
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.isdelete
     *
     * @return the value of comment.isdelete
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.isdelete
     *
     * @param isdelete the value for comment.isdelete
     *
     * @mbggenerated Mon Jul 22 16:38:43 CST 2019
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}