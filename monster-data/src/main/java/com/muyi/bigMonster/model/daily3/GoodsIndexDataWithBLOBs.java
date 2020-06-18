package com.muyi.bigMonster.model.daily3;

import java.io.Serializable;

public class GoodsIndexDataWithBLOBs extends GoodsIndexData implements Serializable {
    private String channelData;

    private String shopTags;

    private String activityTags;

    private String wholeSaleDiscounts;

    private String bigPromotionPriceInfo;

    private String advanceSaleInfo;

    private String embedding;

    private static final long serialVersionUID = 1L;

    public String getChannelData() {
        return channelData;
    }

    public GoodsIndexDataWithBLOBs withChannelData(String channelData) {
        this.setChannelData(channelData);
        return this;
    }

    public void setChannelData(String channelData) {
        this.channelData = channelData == null ? null : channelData.trim();
    }

    public String getShopTags() {
        return shopTags;
    }

    public GoodsIndexDataWithBLOBs withShopTags(String shopTags) {
        this.setShopTags(shopTags);
        return this;
    }

    public void setShopTags(String shopTags) {
        this.shopTags = shopTags == null ? null : shopTags.trim();
    }

    public String getActivityTags() {
        return activityTags;
    }

    public GoodsIndexDataWithBLOBs withActivityTags(String activityTags) {
        this.setActivityTags(activityTags);
        return this;
    }

    public void setActivityTags(String activityTags) {
        this.activityTags = activityTags == null ? null : activityTags.trim();
    }

    public String getWholeSaleDiscounts() {
        return wholeSaleDiscounts;
    }

    public GoodsIndexDataWithBLOBs withWholeSaleDiscounts(String wholeSaleDiscounts) {
        this.setWholeSaleDiscounts(wholeSaleDiscounts);
        return this;
    }

    public void setWholeSaleDiscounts(String wholeSaleDiscounts) {
        this.wholeSaleDiscounts = wholeSaleDiscounts == null ? null : wholeSaleDiscounts.trim();
    }

    public String getBigPromotionPriceInfo() {
        return bigPromotionPriceInfo;
    }

    public GoodsIndexDataWithBLOBs withBigPromotionPriceInfo(String bigPromotionPriceInfo) {
        this.setBigPromotionPriceInfo(bigPromotionPriceInfo);
        return this;
    }

    public void setBigPromotionPriceInfo(String bigPromotionPriceInfo) {
        this.bigPromotionPriceInfo = bigPromotionPriceInfo == null ? null : bigPromotionPriceInfo.trim();
    }

    public String getAdvanceSaleInfo() {
        return advanceSaleInfo;
    }

    public GoodsIndexDataWithBLOBs withAdvanceSaleInfo(String advanceSaleInfo) {
        this.setAdvanceSaleInfo(advanceSaleInfo);
        return this;
    }

    public void setAdvanceSaleInfo(String advanceSaleInfo) {
        this.advanceSaleInfo = advanceSaleInfo == null ? null : advanceSaleInfo.trim();
    }

    public String getEmbedding() {
        return embedding;
    }

    public GoodsIndexDataWithBLOBs withEmbedding(String embedding) {
        this.setEmbedding(embedding);
        return this;
    }

    public void setEmbedding(String embedding) {
        this.embedding = embedding == null ? null : embedding.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelData=").append(channelData);
        sb.append(", shopTags=").append(shopTags);
        sb.append(", activityTags=").append(activityTags);
        sb.append(", wholeSaleDiscounts=").append(wholeSaleDiscounts);
        sb.append(", bigPromotionPriceInfo=").append(bigPromotionPriceInfo);
        sb.append(", advanceSaleInfo=").append(advanceSaleInfo);
        sb.append(", embedding=").append(embedding);
        sb.append("]");
        return sb.toString();
    }
}