package com.muyi.bigMonster.mapper;

import com.muyi.bigMonster.model.PBuyerResource;
import com.muyi.bigMonster.model.PBuyerResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface PBuyerResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    long countByExample(PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    int deleteByExample(PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    @Delete({
        "delete from p_buyer_resource",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    @Insert({
        "insert into p_buyer_resource (id, activity_id, ",
        "account_id, resource_id, ",
        "resource_type, shop_id, ",
        "start_time, end_time, ",
        "source_type, threshold, ",
        "preferential_type, preferential_detail, ",
        "upper_limit, description, ",
        "channel, feature, ",
        "status, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=BIGINT}, #{activityId,jdbcType=BIGINT}, ",
        "#{accountId,jdbcType=BIGINT}, #{resourceId,jdbcType=BIGINT}, ",
        "#{resourceType,jdbcType=TINYINT}, #{shopId,jdbcType=BIGINT}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{sourceType,jdbcType=TINYINT}, #{threshold,jdbcType=INTEGER}, ",
        "#{preferentialType,jdbcType=TINYINT}, #{preferentialDetail,jdbcType=INTEGER}, ",
        "#{upperLimit,jdbcType=INTEGER}, #{description,jdbcType=VARCHAR}, ",
        "#{channel,jdbcType=TINYINT}, #{feature,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(PBuyerResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    int insertSelective(PBuyerResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    List<PBuyerResource> selectByExampleWithRowbounds(PBuyerResourceExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    List<PBuyerResource> selectByExample(PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    @Select({
        "select",
        "id, activity_id, account_id, resource_id, resource_type, shop_id, start_time, ",
        "end_time, source_type, threshold, preferential_type, preferential_detail, upper_limit, ",
        "description, channel, feature, status, create_time, update_time",
        "from p_buyer_resource",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.muyi.bigMonster.mapper.PBuyerResourceMapper.BaseResultMap")
    PBuyerResource selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    int updateByExampleSelective(@Param("record") PBuyerResource record, @Param("example") PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    int updateByExample(@Param("record") PBuyerResource record, @Param("example") PBuyerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    int updateByPrimaryKeySelective(PBuyerResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 20:59:53 CST 2020
     */
    @Update({
        "update p_buyer_resource",
        "set activity_id = #{activityId,jdbcType=BIGINT},",
          "account_id = #{accountId,jdbcType=BIGINT},",
          "resource_id = #{resourceId,jdbcType=BIGINT},",
          "resource_type = #{resourceType,jdbcType=TINYINT},",
          "shop_id = #{shopId,jdbcType=BIGINT},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "source_type = #{sourceType,jdbcType=TINYINT},",
          "threshold = #{threshold,jdbcType=INTEGER},",
          "preferential_type = #{preferentialType,jdbcType=TINYINT},",
          "preferential_detail = #{preferentialDetail,jdbcType=INTEGER},",
          "upper_limit = #{upperLimit,jdbcType=INTEGER},",
          "description = #{description,jdbcType=VARCHAR},",
          "channel = #{channel,jdbcType=TINYINT},",
          "feature = #{feature,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PBuyerResource record);
}
