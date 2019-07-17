package com.woniu.mapper;

import com.woniu.model.City;
import com.woniu.model.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int countByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int deleteByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int deleteByPrimaryKey(Integer cityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int insert(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int insertSelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    List<City> selectByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    City selectByPrimaryKey(Integer cityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int updateByPrimaryKeySelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int updateByPrimaryKey(City record);
}