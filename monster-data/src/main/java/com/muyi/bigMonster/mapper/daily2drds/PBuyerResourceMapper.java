package com.muyi.bigMonster.mapper.daily2drds;

import com.muyi.bigMonster.model.daily2drds.PBuyerResource;
import com.muyi.bigMonster.model.daily2drds.PBuyerResourceExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface PBuyerResourceMapper {
    @SelectProvider(type = PBuyerResourceSqlProvider.class, method = "countByExample")
    long countByExample(PBuyerResourceExample example);

    @DeleteProvider(type = PBuyerResourceSqlProvider.class, method = "deleteByExample")
    int deleteByExample(PBuyerResourceExample example);

    @Delete({
            "delete from p_buyer_resource",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

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

    @InsertProvider(type = PBuyerResourceSqlProvider.class, method = "insertSelective")
    int insertSelective(PBuyerResource record);

    @SelectProvider(type = PBuyerResourceSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "activity_id", property = "activityId", jdbcType = JdbcType.BIGINT),
            @Result(column = "account_id", property = "accountId", jdbcType = JdbcType.BIGINT),
            @Result(column = "resource_id", property = "resourceId", jdbcType = JdbcType.BIGINT),
            @Result(column = "resource_type", property = "resourceType", jdbcType = JdbcType.TINYINT),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.BIGINT),
            @Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "source_type", property = "sourceType", jdbcType = JdbcType.TINYINT),
            @Result(column = "threshold", property = "threshold", jdbcType = JdbcType.INTEGER),
            @Result(column = "preferential_type", property = "preferentialType", jdbcType = JdbcType.TINYINT),
            @Result(column = "preferential_detail", property = "preferentialDetail", jdbcType = JdbcType.INTEGER),
            @Result(column = "upper_limit", property = "upperLimit", jdbcType = JdbcType.INTEGER),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel", property = "channel", jdbcType = JdbcType.TINYINT),
            @Result(column = "feature", property = "feature", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.TINYINT),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<PBuyerResource> selectByExampleWithRowbounds(PBuyerResourceExample example, RowBounds rowBounds);

    @SelectProvider(type = PBuyerResourceSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "activity_id", property = "activityId", jdbcType = JdbcType.BIGINT),
            @Result(column = "account_id", property = "accountId", jdbcType = JdbcType.BIGINT),
            @Result(column = "resource_id", property = "resourceId", jdbcType = JdbcType.BIGINT),
            @Result(column = "resource_type", property = "resourceType", jdbcType = JdbcType.TINYINT),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.BIGINT),
            @Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "source_type", property = "sourceType", jdbcType = JdbcType.TINYINT),
            @Result(column = "threshold", property = "threshold", jdbcType = JdbcType.INTEGER),
            @Result(column = "preferential_type", property = "preferentialType", jdbcType = JdbcType.TINYINT),
            @Result(column = "preferential_detail", property = "preferentialDetail", jdbcType = JdbcType.INTEGER),
            @Result(column = "upper_limit", property = "upperLimit", jdbcType = JdbcType.INTEGER),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel", property = "channel", jdbcType = JdbcType.TINYINT),
            @Result(column = "feature", property = "feature", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.TINYINT),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<PBuyerResource> selectByExample(PBuyerResourceExample example);

    @Select({
            "select",
            "id, activity_id, account_id, resource_id, resource_type, shop_id, start_time, ",
            "end_time, source_type, threshold, preferential_type, preferential_detail, upper_limit, ",
            "description, channel, feature, status, create_time, update_time",
            "from p_buyer_resource",
            "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "activity_id", property = "activityId", jdbcType = JdbcType.BIGINT),
            @Result(column = "account_id", property = "accountId", jdbcType = JdbcType.BIGINT),
            @Result(column = "resource_id", property = "resourceId", jdbcType = JdbcType.BIGINT),
            @Result(column = "resource_type", property = "resourceType", jdbcType = JdbcType.TINYINT),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.BIGINT),
            @Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "source_type", property = "sourceType", jdbcType = JdbcType.TINYINT),
            @Result(column = "threshold", property = "threshold", jdbcType = JdbcType.INTEGER),
            @Result(column = "preferential_type", property = "preferentialType", jdbcType = JdbcType.TINYINT),
            @Result(column = "preferential_detail", property = "preferentialDetail", jdbcType = JdbcType.INTEGER),
            @Result(column = "upper_limit", property = "upperLimit", jdbcType = JdbcType.INTEGER),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "channel", property = "channel", jdbcType = JdbcType.TINYINT),
            @Result(column = "feature", property = "feature", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.TINYINT),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    PBuyerResource selectByPrimaryKey(Long id);

    @UpdateProvider(type = PBuyerResourceSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PBuyerResource record, @Param("example") PBuyerResourceExample example);

    @UpdateProvider(type = PBuyerResourceSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") PBuyerResource record, @Param("example") PBuyerResourceExample example);

    @UpdateProvider(type = PBuyerResourceSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PBuyerResource record);

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

    //
    @Update({"update p_buyer_resource set end_time = #{endTime} where id = #{id}"})
    int updateById(Integer id, String endTime);


}
