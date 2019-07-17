package com.woniu.mapper;

import com.woniu.model.Province;
import com.woniu.model.ProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int countByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int deleteByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int deleteByPrimaryKey(Integer provinceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int insert(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int insertSelective(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    List<Province> selectByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    Province selectByPrimaryKey(Integer provinceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int updateByPrimaryKeySelective(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Wed Jul 17 17:04:30 CST 2019
     */
    int updateByPrimaryKey(Province record);
}