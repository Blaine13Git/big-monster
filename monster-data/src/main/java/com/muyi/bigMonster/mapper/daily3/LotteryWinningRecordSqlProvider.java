package com.muyi.bigMonster.mapper.daily3;

import com.muyi.bigMonster.model.daily3.LotteryWinningRecord;
import com.muyi.bigMonster.model.daily3.LotteryWinningRecordExample.Criteria;
import com.muyi.bigMonster.model.daily3.LotteryWinningRecordExample.Criterion;
import com.muyi.bigMonster.model.daily3.LotteryWinningRecordExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LotteryWinningRecordSqlProvider {
    public String countByExample(LotteryWinningRecordExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("lottery_winning_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LotteryWinningRecordExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("lottery_winning_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LotteryWinningRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lottery_winning_record");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getLotteryId() != null) {
            sql.VALUES("lottery_id", "#{lotteryId,jdbcType=BIGINT}");
        }
        
        if (record.getStrategyId() != null) {
            sql.VALUES("strategy_id", "#{strategyId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            sql.VALUES("account_id", "#{accountId,jdbcType=INTEGER}");
        }
        
        if (record.getLotteryPrizeId() != null) {
            sql.VALUES("lottery_prize_id", "#{lotteryPrizeId,jdbcType=BIGINT}");
        }
        
        if (record.getPrizeId() != null) {
            sql.VALUES("prize_id", "#{prizeId,jdbcType=BIGINT}");
        }
        
        if (record.getPrizeType() != null) {
            sql.VALUES("prize_type", "#{prizeType,jdbcType=TINYINT}");
        }
        
        if (record.getUniqueId() != null) {
            sql.VALUES("unique_id", "#{uniqueId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getExtContent() != null) {
            sql.VALUES("ext_content", "#{extContent,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LotteryWinningRecordExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("lottery_id");
        sql.SELECT("strategy_id");
        sql.SELECT("account_id");
        sql.SELECT("lottery_prize_id");
        sql.SELECT("prize_id");
        sql.SELECT("prize_type");
        sql.SELECT("unique_id");
        sql.SELECT("status");
        sql.SELECT("ext_content");
        sql.SELECT("is_deleted");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("lottery_winning_record");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LotteryWinningRecord record = (LotteryWinningRecord) parameter.get("record");
        LotteryWinningRecordExample example = (LotteryWinningRecordExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("lottery_winning_record");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getLotteryId() != null) {
            sql.SET("lottery_id = #{record.lotteryId,jdbcType=BIGINT}");
        }
        
        if (record.getStrategyId() != null) {
            sql.SET("strategy_id = #{record.strategyId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{record.accountId,jdbcType=INTEGER}");
        }
        
        if (record.getLotteryPrizeId() != null) {
            sql.SET("lottery_prize_id = #{record.lotteryPrizeId,jdbcType=BIGINT}");
        }
        
        if (record.getPrizeId() != null) {
            sql.SET("prize_id = #{record.prizeId,jdbcType=BIGINT}");
        }
        
        if (record.getPrizeType() != null) {
            sql.SET("prize_type = #{record.prizeType,jdbcType=TINYINT}");
        }
        
        if (record.getUniqueId() != null) {
            sql.SET("unique_id = #{record.uniqueId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getExtContent() != null) {
            sql.SET("ext_content = #{record.extContent,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=TINYINT}");
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
        sql.UPDATE("lottery_winning_record");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("lottery_id = #{record.lotteryId,jdbcType=BIGINT}");
        sql.SET("strategy_id = #{record.strategyId,jdbcType=BIGINT}");
        sql.SET("account_id = #{record.accountId,jdbcType=INTEGER}");
        sql.SET("lottery_prize_id = #{record.lotteryPrizeId,jdbcType=BIGINT}");
        sql.SET("prize_id = #{record.prizeId,jdbcType=BIGINT}");
        sql.SET("prize_type = #{record.prizeType,jdbcType=TINYINT}");
        sql.SET("unique_id = #{record.uniqueId,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("ext_content = #{record.extContent,jdbcType=VARCHAR}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=TINYINT}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        LotteryWinningRecordExample example = (LotteryWinningRecordExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LotteryWinningRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("lottery_winning_record");
        
        if (record.getLotteryId() != null) {
            sql.SET("lottery_id = #{lotteryId,jdbcType=BIGINT}");
        }
        
        if (record.getStrategyId() != null) {
            sql.SET("strategy_id = #{strategyId,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{accountId,jdbcType=INTEGER}");
        }
        
        if (record.getLotteryPrizeId() != null) {
            sql.SET("lottery_prize_id = #{lotteryPrizeId,jdbcType=BIGINT}");
        }
        
        if (record.getPrizeId() != null) {
            sql.SET("prize_id = #{prizeId,jdbcType=BIGINT}");
        }
        
        if (record.getPrizeType() != null) {
            sql.SET("prize_type = #{prizeType,jdbcType=TINYINT}");
        }
        
        if (record.getUniqueId() != null) {
            sql.SET("unique_id = #{uniqueId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getExtContent() != null) {
            sql.SET("ext_content = #{extContent,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=TINYINT}");
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

    protected void applyWhere(SQL sql, LotteryWinningRecordExample example, boolean includeExamplePhrase) {
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