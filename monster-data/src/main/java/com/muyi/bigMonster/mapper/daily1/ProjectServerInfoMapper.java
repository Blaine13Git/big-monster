package com.muyi.bigMonster.mapper.daily1;

import com.muyi.bigMonster.model.daily1.ProjectServerInfo;
import com.muyi.bigMonster.model.daily1.ProjectServerInfoExample;
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

public interface ProjectServerInfoMapper {
    @SelectProvider(type=ProjectServerInfoSqlProvider.class, method="countByExample")
    long countByExample(ProjectServerInfoExample example);

    @DeleteProvider(type=ProjectServerInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProjectServerInfoExample example);

    @Delete({
        "delete from project_server_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into project_server_info (id, project_name, ",
        "ip, port, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{projectName,jdbcType=VARCHAR}, ",
        "#{ip,jdbcType=VARCHAR}, #{port,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ProjectServerInfo record);

    @InsertProvider(type=ProjectServerInfoSqlProvider.class, method="insertSelective")
    int insertSelective(ProjectServerInfo record);

    @SelectProvider(type=ProjectServerInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ProjectServerInfo> selectByExampleWithRowbounds(ProjectServerInfoExample example, RowBounds rowBounds);

    @SelectProvider(type=ProjectServerInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ProjectServerInfo> selectByExample(ProjectServerInfoExample example);

    @Select({
        "select",
        "id, project_name, ip, port, create_time, update_time",
        "from project_server_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    ProjectServerInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ProjectServerInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ProjectServerInfo record, @Param("example") ProjectServerInfoExample example);

    @UpdateProvider(type=ProjectServerInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ProjectServerInfo record, @Param("example") ProjectServerInfoExample example);

    @UpdateProvider(type=ProjectServerInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProjectServerInfo record);

    @Update({
        "update project_server_info",
        "set project_name = #{projectName,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "port = #{port,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProjectServerInfo record);
}