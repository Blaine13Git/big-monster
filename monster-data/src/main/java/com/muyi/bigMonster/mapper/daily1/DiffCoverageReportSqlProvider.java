package com.muyi.bigMonster.mapper.daily1;

import com.muyi.bigMonster.model.daily1.DiffCoverageReport;
import com.muyi.bigMonster.model.daily1.DiffCoverageReportExample.Criteria;
import com.muyi.bigMonster.model.daily1.DiffCoverageReportExample.Criterion;
import com.muyi.bigMonster.model.daily1.DiffCoverageReportExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DiffCoverageReportSqlProvider {
    public String countByExample(DiffCoverageReportExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("diff_coverage_report");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DiffCoverageReportExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("diff_coverage_report");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(DiffCoverageReport record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("diff_coverage_report");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getProjectname() != null) {
            sql.VALUES("projectName", "#{projectname,jdbcType=VARCHAR}");
        }
        
        if (record.getRepositoryurl() != null) {
            sql.VALUES("repositoryUrl", "#{repositoryurl,jdbcType=VARCHAR}");
        }
        
        if (record.getBasebranch() != null) {
            sql.VALUES("baseBranch", "#{basebranch,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffbranch() != null) {
            sql.VALUES("diffBranch", "#{diffbranch,jdbcType=VARCHAR}");
        }
        
        if (record.getBasecommitid() != null) {
            sql.VALUES("baseCommitId", "#{basecommitid,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffcommitid() != null) {
            sql.VALUES("diffCommitId", "#{diffcommitid,jdbcType=VARCHAR}");
        }
        
        if (record.getExecfilepath() != null) {
            sql.VALUES("execFilePath", "#{execfilepath,jdbcType=VARCHAR}");
        }
        
        if (record.getSessionid() != null) {
            sql.VALUES("sessionId", "#{sessionid,jdbcType=VARCHAR}");
        }
        
        if (record.getReporturl() != null) {
            sql.VALUES("reportUrl", "#{reporturl,jdbcType=VARCHAR}");
        }
        
        if (record.getClassfilenumber() != null) {
            sql.VALUES("classFileNumber", "#{classfilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getMethodfilenumber() != null) {
            sql.VALUES("methodFileNumber", "#{methodfilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getLinefilenumber() != null) {
            sql.VALUES("lineFileNumber", "#{linefilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getDiffclassfilenumber() != null) {
            sql.VALUES("diffClassFileNumber", "#{diffclassfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddfilenumber() != null) {
            sql.VALUES("addFileNumber", "#{addfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyfilenumber() != null) {
            sql.VALUES("modifyFileNumber", "#{modifyfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletefilenumber() != null) {
            sql.VALUES("deleteFileNumber", "#{deletefilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffmethodfilenumber() != null) {
            sql.VALUES("diffMethodFileNumber", "#{diffmethodfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddmethodnumber() != null) {
            sql.VALUES("addMethodNumber", "#{addmethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifymethodnumber() != null) {
            sql.VALUES("modifyMethodNumber", "#{modifymethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletemethodnumber() != null) {
            sql.VALUES("deleteMethodNumber", "#{deletemethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDifflinefilenumber() != null) {
            sql.VALUES("diffLineFileNumber", "#{difflinefilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddlinenumber() != null) {
            sql.VALUES("addLineNumber", "#{addlinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifylinenumber() != null) {
            sql.VALUES("modifyLineNumber", "#{modifylinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletelinenumber() != null) {
            sql.VALUES("deleteLineNumber", "#{deletelinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getClasscoveragepercent() != null) {
            sql.VALUES("classCoveragePercent", "#{classcoveragepercent,jdbcType=INTEGER}");
        }
        
        if (record.getMethodcoveragepercent() != null) {
            sql.VALUES("methodCoveragePercent", "#{methodcoveragepercent,jdbcType=INTEGER}");
        }
        
        if (record.getLinecoveragepercent() != null) {
            sql.VALUES("lineCoveragePercent", "#{linecoveragepercent,jdbcType=BIGINT}");
        }
        
        if (record.getTester() != null) {
            sql.VALUES("tester", "#{tester,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdelete() != null) {
            sql.VALUES("isDelete", "#{isdelete,jdbcType=BIT}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createTime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatetime() != null) {
            sql.VALUES("updateTime", "#{updatetime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(DiffCoverageReportExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("projectName");
        sql.SELECT("repositoryUrl");
        sql.SELECT("baseBranch");
        sql.SELECT("diffBranch");
        sql.SELECT("baseCommitId");
        sql.SELECT("diffCommitId");
        sql.SELECT("execFilePath");
        sql.SELECT("sessionId");
        sql.SELECT("reportUrl");
        sql.SELECT("classFileNumber");
        sql.SELECT("methodFileNumber");
        sql.SELECT("lineFileNumber");
        sql.SELECT("diffClassFileNumber");
        sql.SELECT("addFileNumber");
        sql.SELECT("modifyFileNumber");
        sql.SELECT("deleteFileNumber");
        sql.SELECT("diffMethodFileNumber");
        sql.SELECT("addMethodNumber");
        sql.SELECT("modifyMethodNumber");
        sql.SELECT("deleteMethodNumber");
        sql.SELECT("diffLineFileNumber");
        sql.SELECT("addLineNumber");
        sql.SELECT("modifyLineNumber");
        sql.SELECT("deleteLineNumber");
        sql.SELECT("classCoveragePercent");
        sql.SELECT("methodCoveragePercent");
        sql.SELECT("lineCoveragePercent");
        sql.SELECT("tester");
        sql.SELECT("isDelete");
        sql.SELECT("createTime");
        sql.SELECT("updateTime");
        sql.FROM("diff_coverage_report");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        DiffCoverageReport record = (DiffCoverageReport) parameter.get("record");
        DiffCoverageReportExample example = (DiffCoverageReportExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("diff_coverage_report");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getProjectname() != null) {
            sql.SET("projectName = #{record.projectname,jdbcType=VARCHAR}");
        }
        
        if (record.getRepositoryurl() != null) {
            sql.SET("repositoryUrl = #{record.repositoryurl,jdbcType=VARCHAR}");
        }
        
        if (record.getBasebranch() != null) {
            sql.SET("baseBranch = #{record.basebranch,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffbranch() != null) {
            sql.SET("diffBranch = #{record.diffbranch,jdbcType=VARCHAR}");
        }
        
        if (record.getBasecommitid() != null) {
            sql.SET("baseCommitId = #{record.basecommitid,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffcommitid() != null) {
            sql.SET("diffCommitId = #{record.diffcommitid,jdbcType=VARCHAR}");
        }
        
        if (record.getExecfilepath() != null) {
            sql.SET("execFilePath = #{record.execfilepath,jdbcType=VARCHAR}");
        }
        
        if (record.getSessionid() != null) {
            sql.SET("sessionId = #{record.sessionid,jdbcType=VARCHAR}");
        }
        
        if (record.getReporturl() != null) {
            sql.SET("reportUrl = #{record.reporturl,jdbcType=VARCHAR}");
        }
        
        if (record.getClassfilenumber() != null) {
            sql.SET("classFileNumber = #{record.classfilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getMethodfilenumber() != null) {
            sql.SET("methodFileNumber = #{record.methodfilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getLinefilenumber() != null) {
            sql.SET("lineFileNumber = #{record.linefilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getDiffclassfilenumber() != null) {
            sql.SET("diffClassFileNumber = #{record.diffclassfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddfilenumber() != null) {
            sql.SET("addFileNumber = #{record.addfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyfilenumber() != null) {
            sql.SET("modifyFileNumber = #{record.modifyfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletefilenumber() != null) {
            sql.SET("deleteFileNumber = #{record.deletefilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffmethodfilenumber() != null) {
            sql.SET("diffMethodFileNumber = #{record.diffmethodfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddmethodnumber() != null) {
            sql.SET("addMethodNumber = #{record.addmethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifymethodnumber() != null) {
            sql.SET("modifyMethodNumber = #{record.modifymethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletemethodnumber() != null) {
            sql.SET("deleteMethodNumber = #{record.deletemethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDifflinefilenumber() != null) {
            sql.SET("diffLineFileNumber = #{record.difflinefilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddlinenumber() != null) {
            sql.SET("addLineNumber = #{record.addlinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifylinenumber() != null) {
            sql.SET("modifyLineNumber = #{record.modifylinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletelinenumber() != null) {
            sql.SET("deleteLineNumber = #{record.deletelinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getClasscoveragepercent() != null) {
            sql.SET("classCoveragePercent = #{record.classcoveragepercent,jdbcType=INTEGER}");
        }
        
        if (record.getMethodcoveragepercent() != null) {
            sql.SET("methodCoveragePercent = #{record.methodcoveragepercent,jdbcType=INTEGER}");
        }
        
        if (record.getLinecoveragepercent() != null) {
            sql.SET("lineCoveragePercent = #{record.linecoveragepercent,jdbcType=BIGINT}");
        }
        
        if (record.getTester() != null) {
            sql.SET("tester = #{record.tester,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdelete() != null) {
            sql.SET("isDelete = #{record.isdelete,jdbcType=BIT}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{record.createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatetime() != null) {
            sql.SET("updateTime = #{record.updatetime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("diff_coverage_report");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("projectName = #{record.projectname,jdbcType=VARCHAR}");
        sql.SET("repositoryUrl = #{record.repositoryurl,jdbcType=VARCHAR}");
        sql.SET("baseBranch = #{record.basebranch,jdbcType=VARCHAR}");
        sql.SET("diffBranch = #{record.diffbranch,jdbcType=VARCHAR}");
        sql.SET("baseCommitId = #{record.basecommitid,jdbcType=VARCHAR}");
        sql.SET("diffCommitId = #{record.diffcommitid,jdbcType=VARCHAR}");
        sql.SET("execFilePath = #{record.execfilepath,jdbcType=VARCHAR}");
        sql.SET("sessionId = #{record.sessionid,jdbcType=VARCHAR}");
        sql.SET("reportUrl = #{record.reporturl,jdbcType=VARCHAR}");
        sql.SET("classFileNumber = #{record.classfilenumber,jdbcType=BIGINT}");
        sql.SET("methodFileNumber = #{record.methodfilenumber,jdbcType=BIGINT}");
        sql.SET("lineFileNumber = #{record.linefilenumber,jdbcType=BIGINT}");
        sql.SET("diffClassFileNumber = #{record.diffclassfilenumber,jdbcType=VARCHAR}");
        sql.SET("addFileNumber = #{record.addfilenumber,jdbcType=VARCHAR}");
        sql.SET("modifyFileNumber = #{record.modifyfilenumber,jdbcType=VARCHAR}");
        sql.SET("deleteFileNumber = #{record.deletefilenumber,jdbcType=VARCHAR}");
        sql.SET("diffMethodFileNumber = #{record.diffmethodfilenumber,jdbcType=VARCHAR}");
        sql.SET("addMethodNumber = #{record.addmethodnumber,jdbcType=VARCHAR}");
        sql.SET("modifyMethodNumber = #{record.modifymethodnumber,jdbcType=VARCHAR}");
        sql.SET("deleteMethodNumber = #{record.deletemethodnumber,jdbcType=VARCHAR}");
        sql.SET("diffLineFileNumber = #{record.difflinefilenumber,jdbcType=VARCHAR}");
        sql.SET("addLineNumber = #{record.addlinenumber,jdbcType=VARCHAR}");
        sql.SET("modifyLineNumber = #{record.modifylinenumber,jdbcType=VARCHAR}");
        sql.SET("deleteLineNumber = #{record.deletelinenumber,jdbcType=VARCHAR}");
        sql.SET("classCoveragePercent = #{record.classcoveragepercent,jdbcType=INTEGER}");
        sql.SET("methodCoveragePercent = #{record.methodcoveragepercent,jdbcType=INTEGER}");
        sql.SET("lineCoveragePercent = #{record.linecoveragepercent,jdbcType=BIGINT}");
        sql.SET("tester = #{record.tester,jdbcType=VARCHAR}");
        sql.SET("isDelete = #{record.isdelete,jdbcType=BIT}");
        sql.SET("createTime = #{record.createtime,jdbcType=TIMESTAMP}");
        sql.SET("updateTime = #{record.updatetime,jdbcType=TIMESTAMP}");
        
        DiffCoverageReportExample example = (DiffCoverageReportExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DiffCoverageReport record) {
        SQL sql = new SQL();
        sql.UPDATE("diff_coverage_report");
        
        if (record.getProjectname() != null) {
            sql.SET("projectName = #{projectname,jdbcType=VARCHAR}");
        }
        
        if (record.getRepositoryurl() != null) {
            sql.SET("repositoryUrl = #{repositoryurl,jdbcType=VARCHAR}");
        }
        
        if (record.getBasebranch() != null) {
            sql.SET("baseBranch = #{basebranch,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffbranch() != null) {
            sql.SET("diffBranch = #{diffbranch,jdbcType=VARCHAR}");
        }
        
        if (record.getBasecommitid() != null) {
            sql.SET("baseCommitId = #{basecommitid,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffcommitid() != null) {
            sql.SET("diffCommitId = #{diffcommitid,jdbcType=VARCHAR}");
        }
        
        if (record.getExecfilepath() != null) {
            sql.SET("execFilePath = #{execfilepath,jdbcType=VARCHAR}");
        }
        
        if (record.getSessionid() != null) {
            sql.SET("sessionId = #{sessionid,jdbcType=VARCHAR}");
        }
        
        if (record.getReporturl() != null) {
            sql.SET("reportUrl = #{reporturl,jdbcType=VARCHAR}");
        }
        
        if (record.getClassfilenumber() != null) {
            sql.SET("classFileNumber = #{classfilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getMethodfilenumber() != null) {
            sql.SET("methodFileNumber = #{methodfilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getLinefilenumber() != null) {
            sql.SET("lineFileNumber = #{linefilenumber,jdbcType=BIGINT}");
        }
        
        if (record.getDiffclassfilenumber() != null) {
            sql.SET("diffClassFileNumber = #{diffclassfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddfilenumber() != null) {
            sql.SET("addFileNumber = #{addfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyfilenumber() != null) {
            sql.SET("modifyFileNumber = #{modifyfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletefilenumber() != null) {
            sql.SET("deleteFileNumber = #{deletefilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDiffmethodfilenumber() != null) {
            sql.SET("diffMethodFileNumber = #{diffmethodfilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddmethodnumber() != null) {
            sql.SET("addMethodNumber = #{addmethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifymethodnumber() != null) {
            sql.SET("modifyMethodNumber = #{modifymethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletemethodnumber() != null) {
            sql.SET("deleteMethodNumber = #{deletemethodnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDifflinefilenumber() != null) {
            sql.SET("diffLineFileNumber = #{difflinefilenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAddlinenumber() != null) {
            sql.SET("addLineNumber = #{addlinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getModifylinenumber() != null) {
            sql.SET("modifyLineNumber = #{modifylinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletelinenumber() != null) {
            sql.SET("deleteLineNumber = #{deletelinenumber,jdbcType=VARCHAR}");
        }
        
        if (record.getClasscoveragepercent() != null) {
            sql.SET("classCoveragePercent = #{classcoveragepercent,jdbcType=INTEGER}");
        }
        
        if (record.getMethodcoveragepercent() != null) {
            sql.SET("methodCoveragePercent = #{methodcoveragepercent,jdbcType=INTEGER}");
        }
        
        if (record.getLinecoveragepercent() != null) {
            sql.SET("lineCoveragePercent = #{linecoveragepercent,jdbcType=BIGINT}");
        }
        
        if (record.getTester() != null) {
            sql.SET("tester = #{tester,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdelete() != null) {
            sql.SET("isDelete = #{isdelete,jdbcType=BIT}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatetime() != null) {
            sql.SET("updateTime = #{updatetime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DiffCoverageReportExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}