package com.muyi.bigMonster.mapper.daily3;

import com.muyi.bigMonster.model.daily3.LotteryWinningRecord;
import com.muyi.bigMonster.model.daily3.LotteryWinningRecordExample;
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

public interface LotteryWinningRecordMapper {
    @SelectProvider(type=LotteryWinningRecordSqlProvider.class, method="countByExample")
    long countByExample(LotteryWinningRecordExample example);

    @DeleteProvider(type=LotteryWinningRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(LotteryWinningRecordExample example);

    @Delete({
        "delete from lottery_winning_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into lottery_winning_record (id, lottery_id, ",
        "strategy_id, account_id, ",
        "lottery_prize_id, prize_id, ",
        "prize_type, unique_id, ",
        "status, ext_content, ",
        "is_deleted, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=BIGINT}, #{lotteryId,jdbcType=BIGINT}, ",
        "#{strategyId,jdbcType=BIGINT}, #{accountId,jdbcType=INTEGER}, ",
        "#{lotteryPrizeId,jdbcType=BIGINT}, #{prizeId,jdbcType=BIGINT}, ",
        "#{prizeType,jdbcType=TINYINT}, #{uniqueId,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{extContent,jdbcType=VARCHAR}, ",
        "#{isDeleted,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(LotteryWinningRecord record);

    @InsertProvider(type=LotteryWinningRecordSqlProvider.class, method="insertSelective")
    int insertSelective(LotteryWinningRecord record);

    @SelectProvider(type=LotteryWinningRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="lottery_id", property="lotteryId", jdbcType=JdbcType.BIGINT),
        @Result(column="strategy_id", property="strategyId", jdbcType=JdbcType.BIGINT),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="lottery_prize_id", property="lotteryPrizeId", jdbcType=JdbcType.BIGINT),
        @Result(column="prize_id", property="prizeId", jdbcType=JdbcType.BIGINT),
        @Result(column="prize_type", property="prizeType", jdbcType=JdbcType.TINYINT),
        @Result(column="unique_id", property="uniqueId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="ext_content", property="extContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<LotteryWinningRecord> selectByExampleWithRowbounds(LotteryWinningRecordExample example, RowBounds rowBounds);

    @SelectProvider(type=LotteryWinningRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="lottery_id", property="lotteryId", jdbcType=JdbcType.BIGINT),
        @Result(column="strategy_id", property="strategyId", jdbcType=JdbcType.BIGINT),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="lottery_prize_id", property="lotteryPrizeId", jdbcType=JdbcType.BIGINT),
        @Result(column="prize_id", property="prizeId", jdbcType=JdbcType.BIGINT),
        @Result(column="prize_type", property="prizeType", jdbcType=JdbcType.TINYINT),
        @Result(column="unique_id", property="uniqueId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="ext_content", property="extContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<LotteryWinningRecord> selectByExample(LotteryWinningRecordExample example);

    @Select({
        "select",
        "id, lottery_id, strategy_id, account_id, lottery_prize_id, prize_id, prize_type, ",
        "unique_id, status, ext_content, is_deleted, create_time, update_time",
        "from lottery_winning_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="lottery_id", property="lotteryId", jdbcType=JdbcType.BIGINT),
        @Result(column="strategy_id", property="strategyId", jdbcType=JdbcType.BIGINT),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="lottery_prize_id", property="lotteryPrizeId", jdbcType=JdbcType.BIGINT),
        @Result(column="prize_id", property="prizeId", jdbcType=JdbcType.BIGINT),
        @Result(column="prize_type", property="prizeType", jdbcType=JdbcType.TINYINT),
        @Result(column="unique_id", property="uniqueId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="ext_content", property="extContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    LotteryWinningRecord selectByPrimaryKey(Long id);

    @UpdateProvider(type=LotteryWinningRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LotteryWinningRecord record, @Param("example") LotteryWinningRecordExample example);

    @UpdateProvider(type=LotteryWinningRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LotteryWinningRecord record, @Param("example") LotteryWinningRecordExample example);

    @UpdateProvider(type=LotteryWinningRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LotteryWinningRecord record);

    @Update({
        "update lottery_winning_record",
        "set lottery_id = #{lotteryId,jdbcType=BIGINT},",
          "strategy_id = #{strategyId,jdbcType=BIGINT},",
          "account_id = #{accountId,jdbcType=INTEGER},",
          "lottery_prize_id = #{lotteryPrizeId,jdbcType=BIGINT},",
          "prize_id = #{prizeId,jdbcType=BIGINT},",
          "prize_type = #{prizeType,jdbcType=TINYINT},",
          "unique_id = #{uniqueId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "ext_content = #{extContent,jdbcType=VARCHAR},",
          "is_deleted = #{isDeleted,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LotteryWinningRecord record);
}