package com.woniu.mapper;

import com.woniu.model.Rent;
import com.woniu.model.RentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int countByExample(RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int deleteByExample(RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int deleteByPrimaryKey(String rentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int insert(Rent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int insertSelective(Rent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    List<Rent> selectByExample(RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    Rent selectByPrimaryKey(String rentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") Rent record, @Param("example") RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByExample(@Param("record") Rent record, @Param("example") RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByPrimaryKeySelective(Rent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByPrimaryKey(Rent record);
}