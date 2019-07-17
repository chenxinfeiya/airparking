package com.woniu.mapper;

import com.woniu.model.Porder;
import com.woniu.model.PorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PorderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int countByExample(PorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int deleteByExample(PorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int deleteByPrimaryKey(Integer orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int insert(Porder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int insertSelective(Porder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    List<Porder> selectByExample(PorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    Porder selectByPrimaryKey(Integer orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") Porder record, @Param("example") PorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int updateByExample(@Param("record") Porder record, @Param("example") PorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int updateByPrimaryKeySelective(Porder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table porder
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int updateByPrimaryKey(Porder record);
}