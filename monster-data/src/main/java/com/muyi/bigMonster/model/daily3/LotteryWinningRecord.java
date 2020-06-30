package com.muyi.bigMonster.model.daily3;

import java.io.Serializable;
import java.util.Date;

public class LotteryWinningRecord implements Serializable {
    private Long id;

    private Long lotteryId;

    private Long strategyId;

    private Integer accountId;

    private Long lotteryPrizeId;

    private Long prizeId;

    private Byte prizeType;

    private String uniqueId;

    private Byte status;

    private String extContent;

    private Byte isDeleted;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public LotteryWinningRecord withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLotteryId() {
        return lotteryId;
    }

    public LotteryWinningRecord withLotteryId(Long lotteryId) {
        this.setLotteryId(lotteryId);
        return this;
    }

    public void setLotteryId(Long lotteryId) {
        this.lotteryId = lotteryId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public LotteryWinningRecord withStrategyId(Long strategyId) {
        this.setStrategyId(strategyId);
        return this;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public LotteryWinningRecord withAccountId(Integer accountId) {
        this.setAccountId(accountId);
        return this;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Long getLotteryPrizeId() {
        return lotteryPrizeId;
    }

    public LotteryWinningRecord withLotteryPrizeId(Long lotteryPrizeId) {
        this.setLotteryPrizeId(lotteryPrizeId);
        return this;
    }

    public void setLotteryPrizeId(Long lotteryPrizeId) {
        this.lotteryPrizeId = lotteryPrizeId;
    }

    public Long getPrizeId() {
        return prizeId;
    }

    public LotteryWinningRecord withPrizeId(Long prizeId) {
        this.setPrizeId(prizeId);
        return this;
    }

    public void setPrizeId(Long prizeId) {
        this.prizeId = prizeId;
    }

    public Byte getPrizeType() {
        return prizeType;
    }

    public LotteryWinningRecord withPrizeType(Byte prizeType) {
        this.setPrizeType(prizeType);
        return this;
    }

    public void setPrizeType(Byte prizeType) {
        this.prizeType = prizeType;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public LotteryWinningRecord withUniqueId(String uniqueId) {
        this.setUniqueId(uniqueId);
        return this;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public LotteryWinningRecord withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getExtContent() {
        return extContent;
    }

    public LotteryWinningRecord withExtContent(String extContent) {
        this.setExtContent(extContent);
        return this;
    }

    public void setExtContent(String extContent) {
        this.extContent = extContent == null ? null : extContent.trim();
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public LotteryWinningRecord withIsDeleted(Byte isDeleted) {
        this.setIsDeleted(isDeleted);
        return this;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public LotteryWinningRecord withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public LotteryWinningRecord withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lotteryId=").append(lotteryId);
        sb.append(", strategyId=").append(strategyId);
        sb.append(", accountId=").append(accountId);
        sb.append(", lotteryPrizeId=").append(lotteryPrizeId);
        sb.append(", prizeId=").append(prizeId);
        sb.append(", prizeType=").append(prizeType);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", status=").append(status);
        sb.append(", extContent=").append(extContent);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}