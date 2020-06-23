package com.muyi.bigMonster.model.daily2drds;

import java.io.Serializable;
import java.util.Date;

public class PBuyerResource implements Serializable {
    private Long id;

    private Long activityId;

    private Long accountId;

    private Long resourceId;

    private Byte resourceType;

    private Long shopId;

    private Date startTime;

    private Date endTime;

    private Byte sourceType;

    private Integer threshold;

    private Byte preferentialType;

    private Integer preferentialDetail;

    private Integer upperLimit;

    private String description;

    private Byte channel;

    private String feature;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public PBuyerResource withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public PBuyerResource withActivityId(Long activityId) {
        this.setActivityId(activityId);
        return this;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public PBuyerResource withAccountId(Long accountId) {
        this.setAccountId(accountId);
        return this;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public PBuyerResource withResourceId(Long resourceId) {
        this.setResourceId(resourceId);
        return this;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Byte getResourceType() {
        return resourceType;
    }

    public PBuyerResource withResourceType(Byte resourceType) {
        this.setResourceType(resourceType);
        return this;
    }

    public void setResourceType(Byte resourceType) {
        this.resourceType = resourceType;
    }

    public Long getShopId() {
        return shopId;
    }

    public PBuyerResource withShopId(Long shopId) {
        this.setShopId(shopId);
        return this;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public PBuyerResource withStartTime(Date startTime) {
        this.setStartTime(startTime);
        return this;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public PBuyerResource withEndTime(Date endTime) {
        this.setEndTime(endTime);
        return this;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getSourceType() {
        return sourceType;
    }

    public PBuyerResource withSourceType(Byte sourceType) {
        this.setSourceType(sourceType);
        return this;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public PBuyerResource withThreshold(Integer threshold) {
        this.setThreshold(threshold);
        return this;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public Byte getPreferentialType() {
        return preferentialType;
    }

    public PBuyerResource withPreferentialType(Byte preferentialType) {
        this.setPreferentialType(preferentialType);
        return this;
    }

    public void setPreferentialType(Byte preferentialType) {
        this.preferentialType = preferentialType;
    }

    public Integer getPreferentialDetail() {
        return preferentialDetail;
    }

    public PBuyerResource withPreferentialDetail(Integer preferentialDetail) {
        this.setPreferentialDetail(preferentialDetail);
        return this;
    }

    public void setPreferentialDetail(Integer preferentialDetail) {
        this.preferentialDetail = preferentialDetail;
    }

    public Integer getUpperLimit() {
        return upperLimit;
    }

    public PBuyerResource withUpperLimit(Integer upperLimit) {
        this.setUpperLimit(upperLimit);
        return this;
    }

    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getDescription() {
        return description;
    }

    public PBuyerResource withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getChannel() {
        return channel;
    }

    public PBuyerResource withChannel(Byte channel) {
        this.setChannel(channel);
        return this;
    }

    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    public String getFeature() {
        return feature;
    }

    public PBuyerResource withFeature(String feature) {
        this.setFeature(feature);
        return this;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public PBuyerResource withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PBuyerResource withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public PBuyerResource withUpdateTime(Date updateTime) {
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
        sb.append(", activityId=").append(activityId);
        sb.append(", accountId=").append(accountId);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", shopId=").append(shopId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", threshold=").append(threshold);
        sb.append(", preferentialType=").append(preferentialType);
        sb.append(", preferentialDetail=").append(preferentialDetail);
        sb.append(", upperLimit=").append(upperLimit);
        sb.append(", description=").append(description);
        sb.append(", channel=").append(channel);
        sb.append(", feature=").append(feature);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}