package com.woniu.mapper;

import com.woniu.model.Zone;
import com.woniu.model.ZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int countByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int deleteByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int deleteByPrimaryKey(String zoneid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int insert(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int insertSelective(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    List<Zone> selectByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    Zone selectByPrimaryKey(String zoneid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") Zone record, @Param("example") ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int updateByExample(@Param("record") Zone record, @Param("example") ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int updateByPrimaryKeySelective(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated Fri Jul 19 16:14:05 CST 2019
     */
    int updateByPrimaryKey(Zone record);
}