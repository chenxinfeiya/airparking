package com.woniu.mapper;

import com.woniu.model.Complain;
import com.woniu.model.ComplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int countByExample(ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int deleteByExample(ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int deleteByPrimaryKey(String complainid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int insert(Complain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int insertSelective(Complain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    List<Complain> selectByExample(ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    Complain selectByPrimaryKey(String complainid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") Complain record, @Param("example") ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int updateByExample(@Param("record") Complain record, @Param("example") ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int updateByPrimaryKeySelective(Complain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int updateByPrimaryKey(Complain record);
}