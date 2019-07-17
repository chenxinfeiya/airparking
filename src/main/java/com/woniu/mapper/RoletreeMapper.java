package com.woniu.mapper;

import com.woniu.model.RoletreeExample;
import com.woniu.model.RoletreeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoletreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roletree
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int countByExample(RoletreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roletree
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int deleteByExample(RoletreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roletree
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int deleteByPrimaryKey(RoletreeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roletree
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int insert(RoletreeKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roletree
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int insertSelective(RoletreeKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roletree
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    List<RoletreeKey> selectByExample(RoletreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roletree
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int updateByExampleSelective(@Param("record") RoletreeKey record, @Param("example") RoletreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roletree
     *
     * @mbggenerated Wed Jul 17 20:24:16 CST 2019
     */
    int updateByExample(@Param("record") RoletreeKey record, @Param("example") RoletreeExample example);
}