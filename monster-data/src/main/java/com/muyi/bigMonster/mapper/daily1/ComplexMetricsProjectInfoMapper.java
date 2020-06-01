package com.muyi.bigMonster.mapper.daily1;

import com.muyi.bigMonster.model.daily1.ComplexMetricsProjectInfo;
import com.muyi.bigMonster.model.daily1.ComplexMetricsProjectInfoExample;

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

public interface ComplexMetricsProjectInfoMapper {
    @SelectProvider(type = ComplexMetricsProjectInfoSqlProvider.class, method = "countByExample")
    long countByExample(ComplexMetricsProjectInfoExample example);

    @DeleteProvider(type = ComplexMetricsProjectInfoSqlProvider.class, method = "deleteByExample")
    int deleteByExample(ComplexMetricsProjectInfoExample example);

    @Delete({
            "delete from complex_metrics_project_info",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into complex_metrics_project_info (id, project_name, ",
            "department_id, url, ",
            "create_time, update_time)",
            "values (#{id,jdbcType=INTEGER}, #{projectName,jdbcType=VARCHAR}, ",
            "#{departmentId,jdbcType=INTEGER}, #{url,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ComplexMetricsProjectInfo record);

    @InsertProvider(type = ComplexMetricsProjectInfoSqlProvider.class, method = "insertSelective")
    int insertSelective(ComplexMetricsProjectInfo record);

    @SelectProvider(type = ComplexMetricsProjectInfoSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "project_name", property = "projectName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_id", property = "departmentId", jdbcType = JdbcType.INTEGER),
            @Result(column = "url", property = "url", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<ComplexMetricsProjectInfo> selectByExampleWithRowbounds(ComplexMetricsProjectInfoExample example, RowBounds rowBounds);

    @SelectProvider(type = ComplexMetricsProjectInfoSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "project_name", property = "projectName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_id", property = "departmentId", jdbcType = JdbcType.INTEGER),
            @Result(column = "url", property = "url", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<ComplexMetricsProjectInfo> selectByExample(ComplexMetricsProjectInfoExample example);

    @Select({
            "select",
            "id, project_name, department_id, url, create_time, update_time",
            "from complex_metrics_project_info",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "project_name", property = "projectName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_id", property = "departmentId", jdbcType = JdbcType.INTEGER),
            @Result(column = "url", property = "url", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    ComplexMetricsProjectInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type = ComplexMetricsProjectInfoSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ComplexMetricsProjectInfo record, @Param("example") ComplexMetricsProjectInfoExample example);

    @UpdateProvider(type = ComplexMetricsProjectInfoSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") ComplexMetricsProjectInfo record, @Param("example") ComplexMetricsProjectInfoExample example);

    @UpdateProvider(type = ComplexMetricsProjectInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ComplexMetricsProjectInfo record);

    @Update({
            "update complex_metrics_project_info",
            "set project_name = #{projectName,jdbcType=VARCHAR},",
            "department_id = #{departmentId,jdbcType=INTEGER},",
            "url = #{url,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ComplexMetricsProjectInfo record);

    @Select("select * from complex_metrics_project_info where project_name = #{projectName}")
    List<ComplexMetricsProjectInfo> selectByProjectName(String projectName);

    @Select("select * from complex_metrics_project_info order by create_time desc")
    List<ComplexMetricsProjectInfo> selectAll();
}
