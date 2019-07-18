package com.woniu.mapper;

import com.woniu.model.Property;
import com.woniu.model.PropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int countByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int deleteByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int deleteByPrimaryKey(String propertyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int insert(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int insertSelective(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    List<Property> selectByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    Property selectByPrimaryKey(String propertyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") Property record, @Param("example") PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int updateByExample(@Param("record") Property record, @Param("example") PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int updateByPrimaryKeySelective(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbggenerated Thu Jul 18 16:02:22 CST 2019
     */
    int updateByPrimaryKey(Property record);
}