package com.muyi.bigMonster.model.promotion_platform;

import java.io.Serializable;
import java.util.Date;

public class PBuyerResource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.activity_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Long activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.account_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.resource_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Long resourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.resource_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Byte resourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.shop_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Long shopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.start_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.end_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.source_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Byte sourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.threshold
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Integer threshold;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.preferential_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Byte preferentialType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.preferential_detail
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Integer preferentialDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.upper_limit
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Integer upperLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.description
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.channel
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Byte channel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.feature
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private String feature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.status
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.create_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p_buyer_resource.update_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.id
     *
     * @return the value of p_buyer_resource.id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.id
     *
     * @param id the value for p_buyer_resource.id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.activity_id
     *
     * @return the value of p_buyer_resource.activity_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withActivityId(Long activityId) {
        this.setActivityId(activityId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.activity_id
     *
     * @param activityId the value for p_buyer_resource.activity_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.account_id
     *
     * @return the value of p_buyer_resource.account_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withAccountId(Long accountId) {
        this.setAccountId(accountId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.account_id
     *
     * @param accountId the value for p_buyer_resource.account_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.resource_id
     *
     * @return the value of p_buyer_resource.resource_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withResourceId(Long resourceId) {
        this.setResourceId(resourceId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.resource_id
     *
     * @param resourceId the value for p_buyer_resource.resource_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.resource_type
     *
     * @return the value of p_buyer_resource.resource_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Byte getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withResourceType(Byte resourceType) {
        this.setResourceType(resourceType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.resource_type
     *
     * @param resourceType the value for p_buyer_resource.resource_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setResourceType(Byte resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.shop_id
     *
     * @return the value of p_buyer_resource.shop_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withShopId(Long shopId) {
        this.setShopId(shopId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.shop_id
     *
     * @param shopId the value for p_buyer_resource.shop_id
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.start_time
     *
     * @return the value of p_buyer_resource.start_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withStartTime(Date startTime) {
        this.setStartTime(startTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.start_time
     *
     * @param startTime the value for p_buyer_resource.start_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.end_time
     *
     * @return the value of p_buyer_resource.end_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withEndTime(Date endTime) {
        this.setEndTime(endTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.end_time
     *
     * @param endTime the value for p_buyer_resource.end_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.source_type
     *
     * @return the value of p_buyer_resource.source_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Byte getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withSourceType(Byte sourceType) {
        this.setSourceType(sourceType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.source_type
     *
     * @param sourceType the value for p_buyer_resource.source_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.threshold
     *
     * @return the value of p_buyer_resource.threshold
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withThreshold(Integer threshold) {
        this.setThreshold(threshold);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.threshold
     *
     * @param threshold the value for p_buyer_resource.threshold
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.preferential_type
     *
     * @return the value of p_buyer_resource.preferential_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Byte getPreferentialType() {
        return preferentialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withPreferentialType(Byte preferentialType) {
        this.setPreferentialType(preferentialType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.preferential_type
     *
     * @param preferentialType the value for p_buyer_resource.preferential_type
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setPreferentialType(Byte preferentialType) {
        this.preferentialType = preferentialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.preferential_detail
     *
     * @return the value of p_buyer_resource.preferential_detail
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Integer getPreferentialDetail() {
        return preferentialDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withPreferentialDetail(Integer preferentialDetail) {
        this.setPreferentialDetail(preferentialDetail);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.preferential_detail
     *
     * @param preferentialDetail the value for p_buyer_resource.preferential_detail
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setPreferentialDetail(Integer preferentialDetail) {
        this.preferentialDetail = preferentialDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.upper_limit
     *
     * @return the value of p_buyer_resource.upper_limit
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Integer getUpperLimit() {
        return upperLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withUpperLimit(Integer upperLimit) {
        this.setUpperLimit(upperLimit);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.upper_limit
     *
     * @param upperLimit the value for p_buyer_resource.upper_limit
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.description
     *
     * @return the value of p_buyer_resource.description
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.description
     *
     * @param description the value for p_buyer_resource.description
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.channel
     *
     * @return the value of p_buyer_resource.channel
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Byte getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withChannel(Byte channel) {
        this.setChannel(channel);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.channel
     *
     * @param channel the value for p_buyer_resource.channel
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.feature
     *
     * @return the value of p_buyer_resource.feature
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public String getFeature() {
        return feature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withFeature(String feature) {
        this.setFeature(feature);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.feature
     *
     * @param feature the value for p_buyer_resource.feature
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.status
     *
     * @return the value of p_buyer_resource.status
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.status
     *
     * @param status the value for p_buyer_resource.status
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.create_time
     *
     * @return the value of p_buyer_resource.create_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.create_time
     *
     * @param createTime the value for p_buyer_resource.create_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p_buyer_resource.update_time
     *
     * @return the value of p_buyer_resource.update_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public PBuyerResource withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p_buyer_resource.update_time
     *
     * @param updateTime the value for p_buyer_resource.update_time
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_buyer_resource
     *
     * @mbg.generated Fri May 22 18:06:40 CST 2020
     */
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