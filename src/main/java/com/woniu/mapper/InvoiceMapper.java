package com.woniu.mapper;

import com.woniu.model.Invoice;
import com.woniu.model.InvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int countByExample(InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int deleteByExample(InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int deleteByPrimaryKey(String invioceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int insert(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int insertSelective(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    List<Invoice> selectByExample(InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    Invoice selectByPrimaryKey(String invioceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByExample(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByPrimaryKeySelective(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbggenerated Mon Jul 22 16:47:55 CST 2019
     */
    int updateByPrimaryKey(Invoice record);
}