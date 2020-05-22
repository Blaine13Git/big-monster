package com.muyi.bigMonster.mapper.promotion_platform;

import com.muyi.bigMonster.model.promotion_platform.PBuyerResource;
import com.muyi.bigMonster.model.promotion_platform.PBuyerResourceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Mapper
public interface PBuyerResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    long countByExample(PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    int deleteByExample(PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    int insert(PBuyerResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    int insertSelective(PBuyerResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    List<PBuyerResource> selectByExampleWithRowbounds(PBuyerResourceExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    List<PBuyerResource> selectByExample(PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    PBuyerResource selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    int updateByExampleSelective(@Param("record") PBuyerResource record, @Param("example") PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    int updateByExample(@Param("record") PBuyerResource record, @Param("example") PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    int updateByPrimaryKeySelective(PBuyerResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    int updateByPrimaryKey(PBuyerResource record);
}