package com.muyi.bigMonster.mapper.daily1;

import com.muyi.bigMonster.model.daily1.DiffCoverageReport;
import com.muyi.bigMonster.model.daily1.DiffCoverageReportExample;
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

public interface DiffCoverageReportMapper {
    @SelectProvider(type=DiffCoverageReportSqlProvider.class, method="countByExample")
    long countByExample(DiffCoverageReportExample example);

    @DeleteProvider(type=DiffCoverageReportSqlProvider.class, method="deleteByExample")
    int deleteByExample(DiffCoverageReportExample example);

    @Delete({
        "delete from diff_coverage_report",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into diff_coverage_report (id, projectName, ",
        "repositoryUrl, baseBranch, ",
        "diffBranch, baseCommitId, ",
        "diffCommitId, execFilePath, ",
        "sessionId, reportUrl, ",
        "classFileNumber, methodFileNumber, ",
        "lineFileNumber, diffClassFileNumber, ",
        "addFileNumber, modifyFileNumber, ",
        "deleteFileNumber, diffMethodFileNumber, ",
        "addMethodNumber, modifyMethodNumber, ",
        "deleteMethodNumber, diffLineFileNumber, ",
        "addLineNumber, modifyLineNumber, ",
        "deleteLineNumber, classCoveragePercent, ",
        "methodCoveragePercent, lineCoveragePercent, ",
        "tester, isDelete, createTime, ",
        "updateTime)",
        "values (#{id,jdbcType=INTEGER}, #{projectname,jdbcType=VARCHAR}, ",
        "#{repositoryurl,jdbcType=VARCHAR}, #{basebranch,jdbcType=VARCHAR}, ",
        "#{diffbranch,jdbcType=VARCHAR}, #{basecommitid,jdbcType=VARCHAR}, ",
        "#{diffcommitid,jdbcType=VARCHAR}, #{execfilepath,jdbcType=VARCHAR}, ",
        "#{sessionid,jdbcType=VARCHAR}, #{reporturl,jdbcType=VARCHAR}, ",
        "#{classfilenumber,jdbcType=BIGINT}, #{methodfilenumber,jdbcType=BIGINT}, ",
        "#{linefilenumber,jdbcType=BIGINT}, #{diffclassfilenumber,jdbcType=VARCHAR}, ",
        "#{addfilenumber,jdbcType=VARCHAR}, #{modifyfilenumber,jdbcType=VARCHAR}, ",
        "#{deletefilenumber,jdbcType=VARCHAR}, #{diffmethodfilenumber,jdbcType=VARCHAR}, ",
        "#{addmethodnumber,jdbcType=VARCHAR}, #{modifymethodnumber,jdbcType=VARCHAR}, ",
        "#{deletemethodnumber,jdbcType=VARCHAR}, #{difflinefilenumber,jdbcType=VARCHAR}, ",
        "#{addlinenumber,jdbcType=VARCHAR}, #{modifylinenumber,jdbcType=VARCHAR}, ",
        "#{deletelinenumber,jdbcType=VARCHAR}, #{classcoveragepercent,jdbcType=INTEGER}, ",
        "#{methodcoveragepercent,jdbcType=INTEGER}, #{linecoveragepercent,jdbcType=BIGINT}, ",
        "#{tester,jdbcType=VARCHAR}, #{isdelete,jdbcType=BIT}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{updatetime,jdbcType=TIMESTAMP})"
    })
    int insert(DiffCoverageReport record);

    @InsertProvider(type=DiffCoverageReportSqlProvider.class, method="insertSelective")
    int insertSelective(DiffCoverageReport record);

    @SelectProvider(type=DiffCoverageReportSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="projectName", property="projectname", jdbcType=JdbcType.VARCHAR),
        @Result(column="repositoryUrl", property="repositoryurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="baseBranch", property="basebranch", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffBranch", property="diffbranch", jdbcType=JdbcType.VARCHAR),
        @Result(column="baseCommitId", property="basecommitid", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffCommitId", property="diffcommitid", jdbcType=JdbcType.VARCHAR),
        @Result(column="execFilePath", property="execfilepath", jdbcType=JdbcType.VARCHAR),
        @Result(column="sessionId", property="sessionid", jdbcType=JdbcType.VARCHAR),
        @Result(column="reportUrl", property="reporturl", jdbcType=JdbcType.VARCHAR),
        @Result(column="classFileNumber", property="classfilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="methodFileNumber", property="methodfilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="lineFileNumber", property="linefilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="diffClassFileNumber", property="diffclassfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addFileNumber", property="addfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyFileNumber", property="modifyfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteFileNumber", property="deletefilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffMethodFileNumber", property="diffmethodfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addMethodNumber", property="addmethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyMethodNumber", property="modifymethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteMethodNumber", property="deletemethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffLineFileNumber", property="difflinefilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addLineNumber", property="addlinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyLineNumber", property="modifylinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteLineNumber", property="deletelinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="classCoveragePercent", property="classcoveragepercent", jdbcType=JdbcType.INTEGER),
        @Result(column="methodCoveragePercent", property="methodcoveragepercent", jdbcType=JdbcType.INTEGER),
        @Result(column="lineCoveragePercent", property="linecoveragepercent", jdbcType=JdbcType.BIGINT),
        @Result(column="tester", property="tester", jdbcType=JdbcType.VARCHAR),
        @Result(column="isDelete", property="isdelete", jdbcType=JdbcType.BIT),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DiffCoverageReport> selectByExampleWithRowbounds(DiffCoverageReportExample example, RowBounds rowBounds);

    @SelectProvider(type=DiffCoverageReportSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="projectName", property="projectname", jdbcType=JdbcType.VARCHAR),
        @Result(column="repositoryUrl", property="repositoryurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="baseBranch", property="basebranch", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffBranch", property="diffbranch", jdbcType=JdbcType.VARCHAR),
        @Result(column="baseCommitId", property="basecommitid", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffCommitId", property="diffcommitid", jdbcType=JdbcType.VARCHAR),
        @Result(column="execFilePath", property="execfilepath", jdbcType=JdbcType.VARCHAR),
        @Result(column="sessionId", property="sessionid", jdbcType=JdbcType.VARCHAR),
        @Result(column="reportUrl", property="reporturl", jdbcType=JdbcType.VARCHAR),
        @Result(column="classFileNumber", property="classfilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="methodFileNumber", property="methodfilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="lineFileNumber", property="linefilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="diffClassFileNumber", property="diffclassfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addFileNumber", property="addfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyFileNumber", property="modifyfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteFileNumber", property="deletefilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffMethodFileNumber", property="diffmethodfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addMethodNumber", property="addmethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyMethodNumber", property="modifymethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteMethodNumber", property="deletemethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffLineFileNumber", property="difflinefilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addLineNumber", property="addlinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyLineNumber", property="modifylinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteLineNumber", property="deletelinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="classCoveragePercent", property="classcoveragepercent", jdbcType=JdbcType.INTEGER),
        @Result(column="methodCoveragePercent", property="methodcoveragepercent", jdbcType=JdbcType.INTEGER),
        @Result(column="lineCoveragePercent", property="linecoveragepercent", jdbcType=JdbcType.BIGINT),
        @Result(column="tester", property="tester", jdbcType=JdbcType.VARCHAR),
        @Result(column="isDelete", property="isdelete", jdbcType=JdbcType.BIT),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DiffCoverageReport> selectByExample(DiffCoverageReportExample example);

    @Select({
        "select",
        "id, projectName, repositoryUrl, baseBranch, diffBranch, baseCommitId, diffCommitId, ",
        "execFilePath, sessionId, reportUrl, classFileNumber, methodFileNumber, lineFileNumber, ",
        "diffClassFileNumber, addFileNumber, modifyFileNumber, deleteFileNumber, diffMethodFileNumber, ",
        "addMethodNumber, modifyMethodNumber, deleteMethodNumber, diffLineFileNumber, ",
        "addLineNumber, modifyLineNumber, deleteLineNumber, classCoveragePercent, methodCoveragePercent, ",
        "lineCoveragePercent, tester, isDelete, createTime, updateTime",
        "from diff_coverage_report",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="projectName", property="projectname", jdbcType=JdbcType.VARCHAR),
        @Result(column="repositoryUrl", property="repositoryurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="baseBranch", property="basebranch", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffBranch", property="diffbranch", jdbcType=JdbcType.VARCHAR),
        @Result(column="baseCommitId", property="basecommitid", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffCommitId", property="diffcommitid", jdbcType=JdbcType.VARCHAR),
        @Result(column="execFilePath", property="execfilepath", jdbcType=JdbcType.VARCHAR),
        @Result(column="sessionId", property="sessionid", jdbcType=JdbcType.VARCHAR),
        @Result(column="reportUrl", property="reporturl", jdbcType=JdbcType.VARCHAR),
        @Result(column="classFileNumber", property="classfilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="methodFileNumber", property="methodfilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="lineFileNumber", property="linefilenumber", jdbcType=JdbcType.BIGINT),
        @Result(column="diffClassFileNumber", property="diffclassfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addFileNumber", property="addfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyFileNumber", property="modifyfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteFileNumber", property="deletefilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffMethodFileNumber", property="diffmethodfilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addMethodNumber", property="addmethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyMethodNumber", property="modifymethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteMethodNumber", property="deletemethodnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="diffLineFileNumber", property="difflinefilenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="addLineNumber", property="addlinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifyLineNumber", property="modifylinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteLineNumber", property="deletelinenumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="classCoveragePercent", property="classcoveragepercent", jdbcType=JdbcType.INTEGER),
        @Result(column="methodCoveragePercent", property="methodcoveragepercent", jdbcType=JdbcType.INTEGER),
        @Result(column="lineCoveragePercent", property="linecoveragepercent", jdbcType=JdbcType.BIGINT),
        @Result(column="tester", property="tester", jdbcType=JdbcType.VARCHAR),
        @Result(column="isDelete", property="isdelete", jdbcType=JdbcType.BIT),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.TIMESTAMP)
    })
    DiffCoverageReport selectByPrimaryKey(Integer id);

    @UpdateProvider(type=DiffCoverageReportSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DiffCoverageReport record, @Param("example") DiffCoverageReportExample example);

    @UpdateProvider(type=DiffCoverageReportSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DiffCoverageReport record, @Param("example") DiffCoverageReportExample example);

    @UpdateProvider(type=DiffCoverageReportSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DiffCoverageReport record);

    @Update({
        "update diff_coverage_report",
        "set projectName = #{projectname,jdbcType=VARCHAR},",
          "repositoryUrl = #{repositoryurl,jdbcType=VARCHAR},",
          "baseBranch = #{basebranch,jdbcType=VARCHAR},",
          "diffBranch = #{diffbranch,jdbcType=VARCHAR},",
          "baseCommitId = #{basecommitid,jdbcType=VARCHAR},",
          "diffCommitId = #{diffcommitid,jdbcType=VARCHAR},",
          "execFilePath = #{execfilepath,jdbcType=VARCHAR},",
          "sessionId = #{sessionid,jdbcType=VARCHAR},",
          "reportUrl = #{reporturl,jdbcType=VARCHAR},",
          "classFileNumber = #{classfilenumber,jdbcType=BIGINT},",
          "methodFileNumber = #{methodfilenumber,jdbcType=BIGINT},",
          "lineFileNumber = #{linefilenumber,jdbcType=BIGINT},",
          "diffClassFileNumber = #{diffclassfilenumber,jdbcType=VARCHAR},",
          "addFileNumber = #{addfilenumber,jdbcType=VARCHAR},",
          "modifyFileNumber = #{modifyfilenumber,jdbcType=VARCHAR},",
          "deleteFileNumber = #{deletefilenumber,jdbcType=VARCHAR},",
          "diffMethodFileNumber = #{diffmethodfilenumber,jdbcType=VARCHAR},",
          "addMethodNumber = #{addmethodnumber,jdbcType=VARCHAR},",
          "modifyMethodNumber = #{modifymethodnumber,jdbcType=VARCHAR},",
          "deleteMethodNumber = #{deletemethodnumber,jdbcType=VARCHAR},",
          "diffLineFileNumber = #{difflinefilenumber,jdbcType=VARCHAR},",
          "addLineNumber = #{addlinenumber,jdbcType=VARCHAR},",
          "modifyLineNumber = #{modifylinenumber,jdbcType=VARCHAR},",
          "deleteLineNumber = #{deletelinenumber,jdbcType=VARCHAR},",
          "classCoveragePercent = #{classcoveragepercent,jdbcType=INTEGER},",
          "methodCoveragePercent = #{methodcoveragepercent,jdbcType=INTEGER},",
          "lineCoveragePercent = #{linecoveragepercent,jdbcType=BIGINT},",
          "tester = #{tester,jdbcType=VARCHAR},",
          "isDelete = #{isdelete,jdbcType=BIT},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "updateTime = #{updatetime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DiffCoverageReport record);
}