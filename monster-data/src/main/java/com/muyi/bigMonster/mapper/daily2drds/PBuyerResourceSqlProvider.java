package com.muyi.bigMonster.mapper.daily2drds;

import com.muyi.bigMonster.model.daily2drds.PBuyerResource;
import com.muyi.bigMonster.model.daily2drds.PBuyerResourceExample.Criteria;
import com.muyi.bigMonster.model.daily2drds.PBuyerResourceExample.Criterion;
import com.muyi.bigMonster.model.daily2drds.PBuyerResourceExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PBuyerResourceSqlProvider {
    public String countByExample(PBuyerResourceExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("p_buyer_resource");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PBuyerResourceExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("p_buyer_resource");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PBuyerResource record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("p_buyer_resource");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getActivityId() != null) {
            sql.VALUES("activity_id", "#{activityId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            sql.VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getResourceId() != null) {
            sql.VALUES("resource_id", "#{resourceId,jdbcType=BIGINT}");
        }
        
        if (record.getResourceType() != null) {
            sql.VALUES("resource_type", "#{resourceType,jdbcType=TINYINT}");
        }
        
        if (record.getShopId() != null) {
            sql.VALUES("shop_id", "#{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getStartTime() != null) {
            sql.VALUES("start_time", "#{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            sql.VALUES("end_time", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSourceType() != null) {
            sql.VALUES("source_type", "#{sourceType,jdbcType=TINYINT}");
        }
        
        if (record.getThreshold() != null) {
            sql.VALUES("threshold", "#{threshold,jdbcType=INTEGER}");
        }
        
        if (record.getPreferentialType() != null) {
            sql.VALUES("preferential_type", "#{preferentialType,jdbcType=TINYINT}");
        }
        
        if (record.getPreferentialDetail() != null) {
            sql.VALUES("preferential_detail", "#{preferentialDetail,jdbcType=INTEGER}");
        }
        
        if (record.getUpperLimit() != null) {
            sql.VALUES("upper_limit", "#{upperLimit,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getChannel() != null) {
            sql.VALUES("channel", "#{channel,jdbcType=TINYINT}");
        }
        
        if (record.getFeature() != null) {
            sql.VALUES("feature", "#{feature,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PBuyerResourceExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("activity_id");
        sql.SELECT("account_id");
        sql.SELECT("resource_id");
        sql.SELECT("resource_type");
        sql.SELECT("shop_id");
        sql.SELECT("start_time");
        sql.SELECT("end_time");
        sql.SELECT("source_type");
        sql.SELECT("threshold");
        sql.SELECT("preferential_type");
        sql.SELECT("preferential_detail");
        sql.SELECT("upper_limit");
        sql.SELECT("description");
        sql.SELECT("channel");
        sql.SELECT("feature");
        sql.SELECT("status");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("p_buyer_resource");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PBuyerResource record = (PBuyerResource) parameter.get("record");
        PBuyerResourceExample example = (PBuyerResourceExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("p_buyer_resource");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getActivityId() != null) {
            sql.SET("activity_id = #{record.activityId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{record.accountId,jdbcType=BIGINT}");
        }
        
        if (record.getResourceId() != null) {
            sql.SET("resource_id = #{record.resourceId,jdbcType=BIGINT}");
        }
        
        if (record.getResourceType() != null) {
            sql.SET("resource_type = #{record.resourceType,jdbcType=TINYINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{record.shopId,jdbcType=BIGINT}");
        }
        
        if (record.getStartTime() != null) {
            sql.SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSourceType() != null) {
            sql.SET("source_type = #{record.sourceType,jdbcType=TINYINT}");
        }
        
        if (record.getThreshold() != null) {
            sql.SET("threshold = #{record.threshold,jdbcType=INTEGER}");
        }
        
        if (record.getPreferentialType() != null) {
            sql.SET("preferential_type = #{record.preferentialType,jdbcType=TINYINT}");
        }
        
        if (record.getPreferentialDetail() != null) {
            sql.SET("preferential_detail = #{record.preferentialDetail,jdbcType=INTEGER}");
        }
        
        if (record.getUpperLimit() != null) {
            sql.SET("upper_limit = #{record.upperLimit,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{record.channel,jdbcType=TINYINT}");
        }
        
        if (record.getFeature() != null) {
            sql.SET("feature = #{record.feature,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("p_buyer_resource");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("activity_id = #{record.activityId,jdbcType=BIGINT}");
        sql.SET("account_id = #{record.accountId,jdbcType=BIGINT}");
        sql.SET("resource_id = #{record.resourceId,jdbcType=BIGINT}");
        sql.SET("resource_type = #{record.resourceType,jdbcType=TINYINT}");
        sql.SET("shop_id = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        sql.SET("source_type = #{record.sourceType,jdbcType=TINYINT}");
        sql.SET("threshold = #{record.threshold,jdbcType=INTEGER}");
        sql.SET("preferential_type = #{record.preferentialType,jdbcType=TINYINT}");
        sql.SET("preferential_detail = #{record.preferentialDetail,jdbcType=INTEGER}");
        sql.SET("upper_limit = #{record.upperLimit,jdbcType=INTEGER}");
        sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        sql.SET("channel = #{record.channel,jdbcType=TINYINT}");
        sql.SET("feature = #{record.feature,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        PBuyerResourceExample example = (PBuyerResourceExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PBuyerResource record) {
        SQL sql = new SQL();
        sql.UPDATE("p_buyer_resource");
        
        if (record.getActivityId() != null) {
            sql.SET("activity_id = #{activityId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getResourceId() != null) {
            sql.SET("resource_id = #{resourceId,jdbcType=BIGINT}");
        }
        
        if (record.getResourceType() != null) {
            sql.SET("resource_type = #{resourceType,jdbcType=TINYINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getStartTime() != null) {
            sql.SET("start_time = #{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("end_time = #{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSourceType() != null) {
            sql.SET("source_type = #{sourceType,jdbcType=TINYINT}");
        }
        
        if (record.getThreshold() != null) {
            sql.SET("threshold = #{threshold,jdbcType=INTEGER}");
        }
        
        if (record.getPreferentialType() != null) {
            sql.SET("preferential_type = #{preferentialType,jdbcType=TINYINT}");
        }
        
        if (record.getPreferentialDetail() != null) {
            sql.SET("preferential_detail = #{preferentialDetail,jdbcType=INTEGER}");
        }
        
        if (record.getUpperLimit() != null) {
            sql.SET("upper_limit = #{upperLimit,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{channel,jdbcType=TINYINT}");
        }
        
        if (record.getFeature() != null) {
            sql.SET("feature = #{feature,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PBuyerResourceExample example, boolean includeExamplePhrase) {
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