package com.muyi.bigMonster.mapper.daily1;

import com.muyi.bigMonster.model.daily1.LiveVideoAttribute;
import com.muyi.bigMonster.model.daily1.LiveVideoAttributeExample;
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

public interface LiveVideoAttributeMapper {
    @SelectProvider(type=LiveVideoAttributeSqlProvider.class, method="countByExample")
    long countByExample(LiveVideoAttributeExample example);

    @DeleteProvider(type=LiveVideoAttributeSqlProvider.class, method="deleteByExample")
    int deleteByExample(LiveVideoAttributeExample example);

    @Delete({
        "delete from live_video_attribute",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into live_video_attribute (id, account_id, ",
        "fps, bitrate, gop, ",
        "quality, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{accountId,jdbcType=INTEGER}, ",
        "#{fps,jdbcType=INTEGER}, #{bitrate,jdbcType=INTEGER}, #{gop,jdbcType=INTEGER}, ",
        "#{quality,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(LiveVideoAttribute record);

    @InsertProvider(type=LiveVideoAttributeSqlProvider.class, method="insertSelective")
    int insertSelective(LiveVideoAttribute record);

    @SelectProvider(type=LiveVideoAttributeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="fps", property="fps", jdbcType=JdbcType.INTEGER),
        @Result(column="bitrate", property="bitrate", jdbcType=JdbcType.INTEGER),
        @Result(column="gop", property="gop", jdbcType=JdbcType.INTEGER),
        @Result(column="quality", property="quality", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<LiveVideoAttribute> selectByExampleWithRowbounds(LiveVideoAttributeExample example, RowBounds rowBounds);

    @SelectProvider(type=LiveVideoAttributeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="fps", property="fps", jdbcType=JdbcType.INTEGER),
        @Result(column="bitrate", property="bitrate", jdbcType=JdbcType.INTEGER),
        @Result(column="gop", property="gop", jdbcType=JdbcType.INTEGER),
        @Result(column="quality", property="quality", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<LiveVideoAttribute> selectByExample(LiveVideoAttributeExample example);

    @Select({
        "select",
        "id, account_id, fps, bitrate, gop, quality, create_time, update_time",
        "from live_video_attribute",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="fps", property="fps", jdbcType=JdbcType.INTEGER),
        @Result(column="bitrate", property="bitrate", jdbcType=JdbcType.INTEGER),
        @Result(column="gop", property="gop", jdbcType=JdbcType.INTEGER),
        @Result(column="quality", property="quality", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    LiveVideoAttribute selectByPrimaryKey(Integer id);

    @UpdateProvider(type=LiveVideoAttributeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LiveVideoAttribute record, @Param("example") LiveVideoAttributeExample example);

    @UpdateProvider(type=LiveVideoAttributeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LiveVideoAttribute record, @Param("example") LiveVideoAttributeExample example);

    @UpdateProvider(type=LiveVideoAttributeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LiveVideoAttribute record);

    @Update({
        "update live_video_attribute",
        "set account_id = #{accountId,jdbcType=INTEGER},",
          "fps = #{fps,jdbcType=INTEGER},",
          "bitrate = #{bitrate,jdbcType=INTEGER},",
          "gop = #{gop,jdbcType=INTEGER},",
          "quality = #{quality,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LiveVideoAttribute record);
}