package com.woniu.mapper;

import com.woniu.model.Audit;
import com.woniu.model.AuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int countByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int deleteByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int deleteByPrimaryKey(String auditid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int insert(Audit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int insertSelective(Audit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    List<Audit> selectByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    Audit selectByPrimaryKey(String auditid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") Audit record, @Param("example") AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByExample(@Param("record") Audit record, @Param("example") AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByPrimaryKeySelective(Audit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByPrimaryKey(Audit record);
}