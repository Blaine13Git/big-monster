package com.muyi.bigMonster.model.daily3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoodsIndexData implements Serializable {
    private Long id;

    private Long itemId;

    private String longTitle;

    private String shortTitle;

    private Byte channel;

    private Byte originalChannel;

    private Byte shelf;

    private Byte status;

    private Byte itemType;

    private Byte itemSubType;

    private Long firstShelfTime;

    private Date itemCreateTime;

    private Boolean itemDeliverAreaType;

    private String whiteImageUrl;

    private Integer whiteImageWidth;

    private Integer whiteImageHeight;

    private String majorImageUrl;

    private Integer majorImageWidth;

    private Integer majorImageHeight;

    private Integer brandId;

    private String brandCnName;

    private String brandEnName;

    private Integer brandStateId;

    private String brandStateName;

    private String brandCountryFlagUrl;

    private Integer categoryId;

    private String categoryIdPath;

    private String categoryName;

    private String categoryPathName;

    private String searchTags;

    private String goodsTags;

    private String goodsProperties;

    private Long shopId;

    private String shopName;

    private String shopClassId;

    private Boolean shopType;

    private Boolean registrationAddressType;

    private Boolean shopLevel;

    private String shopMajorCategoryIds;

    private BigDecimal shopGmv30;

    private BigDecimal shopGmv90;

    private BigDecimal shopAftersaleRate30;

    private Integer shopOpenDays;

    private BigDecimal shopDsr;

    private Long shop30DaysSalesVolume;

    private String activityIds;

    private String activityBlacklist;

    private String shopActivityInfo;

    private String shopWarmActivityInfo;

    private String shopPartActivityIds;

    private String shopInvestPartActivityIds;

    private String shopInvestActivityIds;

    private String crossShopActivityIds;

    private String crossShopActivityInfo;

    private String allowanceActivityIds;

    private Long originalPrice;

    private Long price;

    private Long bigPromotionPrice;

    private Long dailyPrice;

    private Long vipPrice;

    private Long bigPromotionVipPrice;

    private Long dailyVipPrice;

    private Integer marketPrice;

    private Long commissionTotal;

    private Long commission;

    private BigDecimal brokerage;

    private Long lowestPriceLast7Days;

    private Long lowestPriceLast15Days;

    private Long lowestPriceLast30Days;

    private Byte inBigPromotion;

    private Long goods7DaysSalesVolume;

    private Long goods30DaysSalesVolume;

    private Long goods60DaysSalesVolume;

    private BigDecimal goodsGmv7;

    private BigDecimal goodsGmv30;

    private BigDecimal goodsGmv60;

    private BigDecimal goodsDsr;

    private BigDecimal clickConverRate30;

    private BigDecimal purchaseConverRate30;

    private BigDecimal payConverRate30;

    private BigDecimal reputationRate;

    private BigDecimal reputationRate30;

    private Long buyerNumber;

    private BigDecimal score;

    private Integer weight;

    private Double predictionScore;

    private Double itemScore;

    private Boolean inBlackList;

    private Boolean inStock;

    private Byte inFeed;

    private Short skuNum;

    private Boolean deleted;

    private Date createTime;

    private Date updateTime;

    private Long anchorEarning;

    private BigDecimal anchorCommission;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public GoodsIndexData withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public GoodsIndexData withItemId(Long itemId) {
        this.setItemId(itemId);
        return this;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getLongTitle() {
        return longTitle;
    }

    public GoodsIndexData withLongTitle(String longTitle) {
        this.setLongTitle(longTitle);
        return this;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle == null ? null : longTitle.trim();
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public GoodsIndexData withShortTitle(String shortTitle) {
        this.setShortTitle(shortTitle);
        return this;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle == null ? null : shortTitle.trim();
    }

    public Byte getChannel() {
        return channel;
    }

    public GoodsIndexData withChannel(Byte channel) {
        this.setChannel(channel);
        return this;
    }

    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    public Byte getOriginalChannel() {
        return originalChannel;
    }

    public GoodsIndexData withOriginalChannel(Byte originalChannel) {
        this.setOriginalChannel(originalChannel);
        return this;
    }

    public void setOriginalChannel(Byte originalChannel) {
        this.originalChannel = originalChannel;
    }

    public Byte getShelf() {
        return shelf;
    }

    public GoodsIndexData withShelf(Byte shelf) {
        this.setShelf(shelf);
        return this;
    }

    public void setShelf(Byte shelf) {
        this.shelf = shelf;
    }

    public Byte getStatus() {
        return status;
    }

    public GoodsIndexData withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getItemType() {
        return itemType;
    }

    public GoodsIndexData withItemType(Byte itemType) {
        this.setItemType(itemType);
        return this;
    }

    public void setItemType(Byte itemType) {
        this.itemType = itemType;
    }

    public Byte getItemSubType() {
        return itemSubType;
    }

    public GoodsIndexData withItemSubType(Byte itemSubType) {
        this.setItemSubType(itemSubType);
        return this;
    }

    public void setItemSubType(Byte itemSubType) {
        this.itemSubType = itemSubType;
    }

    public Long getFirstShelfTime() {
        return firstShelfTime;
    }

    public GoodsIndexData withFirstShelfTime(Long firstShelfTime) {
        this.setFirstShelfTime(firstShelfTime);
        return this;
    }

    public void setFirstShelfTime(Long firstShelfTime) {
        this.firstShelfTime = firstShelfTime;
    }

    public Date getItemCreateTime() {
        return itemCreateTime;
    }

    public GoodsIndexData withItemCreateTime(Date itemCreateTime) {
        this.setItemCreateTime(itemCreateTime);
        return this;
    }

    public void setItemCreateTime(Date itemCreateTime) {
        this.itemCreateTime = itemCreateTime;
    }

    public Boolean getItemDeliverAreaType() {
        return itemDeliverAreaType;
    }

    public GoodsIndexData withItemDeliverAreaType(Boolean itemDeliverAreaType) {
        this.setItemDeliverAreaType(itemDeliverAreaType);
        return this;
    }

    public void setItemDeliverAreaType(Boolean itemDeliverAreaType) {
        this.itemDeliverAreaType = itemDeliverAreaType;
    }

    public String getWhiteImageUrl() {
        return whiteImageUrl;
    }

    public GoodsIndexData withWhiteImageUrl(String whiteImageUrl) {
        this.setWhiteImageUrl(whiteImageUrl);
        return this;
    }

    public void setWhiteImageUrl(String whiteImageUrl) {
        this.whiteImageUrl = whiteImageUrl == null ? null : whiteImageUrl.trim();
    }

    public Integer getWhiteImageWidth() {
        return whiteImageWidth;
    }

    public GoodsIndexData withWhiteImageWidth(Integer whiteImageWidth) {
        this.setWhiteImageWidth(whiteImageWidth);
        return this;
    }

    public void setWhiteImageWidth(Integer whiteImageWidth) {
        this.whiteImageWidth = whiteImageWidth;
    }

    public Integer getWhiteImageHeight() {
        return whiteImageHeight;
    }

    public GoodsIndexData withWhiteImageHeight(Integer whiteImageHeight) {
        this.setWhiteImageHeight(whiteImageHeight);
        return this;
    }

    public void setWhiteImageHeight(Integer whiteImageHeight) {
        this.whiteImageHeight = whiteImageHeight;
    }

    public String getMajorImageUrl() {
        return majorImageUrl;
    }

    public GoodsIndexData withMajorImageUrl(String majorImageUrl) {
        this.setMajorImageUrl(majorImageUrl);
        return this;
    }

    public void setMajorImageUrl(String majorImageUrl) {
        this.majorImageUrl = majorImageUrl == null ? null : majorImageUrl.trim();
    }

    public Integer getMajorImageWidth() {
        return majorImageWidth;
    }

    public GoodsIndexData withMajorImageWidth(Integer majorImageWidth) {
        this.setMajorImageWidth(majorImageWidth);
        return this;
    }

    public void setMajorImageWidth(Integer majorImageWidth) {
        this.majorImageWidth = majorImageWidth;
    }

    public Integer getMajorImageHeight() {
        return majorImageHeight;
    }

    public GoodsIndexData withMajorImageHeight(Integer majorImageHeight) {
        this.setMajorImageHeight(majorImageHeight);
        return this;
    }

    public void setMajorImageHeight(Integer majorImageHeight) {
        this.majorImageHeight = majorImageHeight;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public GoodsIndexData withBrandId(Integer brandId) {
        this.setBrandId(brandId);
        return this;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandCnName() {
        return brandCnName;
    }

    public GoodsIndexData withBrandCnName(String brandCnName) {
        this.setBrandCnName(brandCnName);
        return this;
    }

    public void setBrandCnName(String brandCnName) {
        this.brandCnName = brandCnName == null ? null : brandCnName.trim();
    }

    public String getBrandEnName() {
        return brandEnName;
    }

    public GoodsIndexData withBrandEnName(String brandEnName) {
        this.setBrandEnName(brandEnName);
        return this;
    }

    public void setBrandEnName(String brandEnName) {
        this.brandEnName = brandEnName == null ? null : brandEnName.trim();
    }

    public Integer getBrandStateId() {
        return brandStateId;
    }

    public GoodsIndexData withBrandStateId(Integer brandStateId) {
        this.setBrandStateId(brandStateId);
        return this;
    }

    public void setBrandStateId(Integer brandStateId) {
        this.brandStateId = brandStateId;
    }

    public String getBrandStateName() {
        return brandStateName;
    }

    public GoodsIndexData withBrandStateName(String brandStateName) {
        this.setBrandStateName(brandStateName);
        return this;
    }

    public void setBrandStateName(String brandStateName) {
        this.brandStateName = brandStateName == null ? null : brandStateName.trim();
    }

    public String getBrandCountryFlagUrl() {
        return brandCountryFlagUrl;
    }

    public GoodsIndexData withBrandCountryFlagUrl(String brandCountryFlagUrl) {
        this.setBrandCountryFlagUrl(brandCountryFlagUrl);
        return this;
    }

    public void setBrandCountryFlagUrl(String brandCountryFlagUrl) {
        this.brandCountryFlagUrl = brandCountryFlagUrl == null ? null : brandCountryFlagUrl.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public GoodsIndexData withCategoryId(Integer categoryId) {
        this.setCategoryId(categoryId);
        return this;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryIdPath() {
        return categoryIdPath;
    }

    public GoodsIndexData withCategoryIdPath(String categoryIdPath) {
        this.setCategoryIdPath(categoryIdPath);
        return this;
    }

    public void setCategoryIdPath(String categoryIdPath) {
        this.categoryIdPath = categoryIdPath == null ? null : categoryIdPath.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public GoodsIndexData withCategoryName(String categoryName) {
        this.setCategoryName(categoryName);
        return this;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryPathName() {
        return categoryPathName;
    }

    public GoodsIndexData withCategoryPathName(String categoryPathName) {
        this.setCategoryPathName(categoryPathName);
        return this;
    }

    public void setCategoryPathName(String categoryPathName) {
        this.categoryPathName = categoryPathName == null ? null : categoryPathName.trim();
    }

    public String getSearchTags() {
        return searchTags;
    }

    public GoodsIndexData withSearchTags(String searchTags) {
        this.setSearchTags(searchTags);
        return this;
    }

    public void setSearchTags(String searchTags) {
        this.searchTags = searchTags == null ? null : searchTags.trim();
    }

    public String getGoodsTags() {
        return goodsTags;
    }

    public GoodsIndexData withGoodsTags(String goodsTags) {
        this.setGoodsTags(goodsTags);
        return this;
    }

    public void setGoodsTags(String goodsTags) {
        this.goodsTags = goodsTags == null ? null : goodsTags.trim();
    }

    public String getGoodsProperties() {
        return goodsProperties;
    }

    public GoodsIndexData withGoodsProperties(String goodsProperties) {
        this.setGoodsProperties(goodsProperties);
        return this;
    }

    public void setGoodsProperties(String goodsProperties) {
        this.goodsProperties = goodsProperties == null ? null : goodsProperties.trim();
    }

    public Long getShopId() {
        return shopId;
    }

    public GoodsIndexData withShopId(Long shopId) {
        this.setShopId(shopId);
        return this;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public GoodsIndexData withShopName(String shopName) {
        this.setShopName(shopName);
        return this;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopClassId() {
        return shopClassId;
    }

    public GoodsIndexData withShopClassId(String shopClassId) {
        this.setShopClassId(shopClassId);
        return this;
    }

    public void setShopClassId(String shopClassId) {
        this.shopClassId = shopClassId == null ? null : shopClassId.trim();
    }

    public Boolean getShopType() {
        return shopType;
    }

    public GoodsIndexData withShopType(Boolean shopType) {
        this.setShopType(shopType);
        return this;
    }

    public void setShopType(Boolean shopType) {
        this.shopType = shopType;
    }

    public Boolean getRegistrationAddressType() {
        return registrationAddressType;
    }

    public GoodsIndexData withRegistrationAddressType(Boolean registrationAddressType) {
        this.setRegistrationAddressType(registrationAddressType);
        return this;
    }

    public void setRegistrationAddressType(Boolean registrationAddressType) {
        this.registrationAddressType = registrationAddressType;
    }

    public Boolean getShopLevel() {
        return shopLevel;
    }

    public GoodsIndexData withShopLevel(Boolean shopLevel) {
        this.setShopLevel(shopLevel);
        return this;
    }

    public void setShopLevel(Boolean shopLevel) {
        this.shopLevel = shopLevel;
    }

    public String getShopMajorCategoryIds() {
        return shopMajorCategoryIds;
    }

    public GoodsIndexData withShopMajorCategoryIds(String shopMajorCategoryIds) {
        this.setShopMajorCategoryIds(shopMajorCategoryIds);
        return this;
    }

    public void setShopMajorCategoryIds(String shopMajorCategoryIds) {
        this.shopMajorCategoryIds = shopMajorCategoryIds == null ? null : shopMajorCategoryIds.trim();
    }

    public BigDecimal getShopGmv30() {
        return shopGmv30;
    }

    public GoodsIndexData withShopGmv30(BigDecimal shopGmv30) {
        this.setShopGmv30(shopGmv30);
        return this;
    }

    public void setShopGmv30(BigDecimal shopGmv30) {
        this.shopGmv30 = shopGmv30;
    }

    public BigDecimal getShopGmv90() {
        return shopGmv90;
    }

    public GoodsIndexData withShopGmv90(BigDecimal shopGmv90) {
        this.setShopGmv90(shopGmv90);
        return this;
    }

    public void setShopGmv90(BigDecimal shopGmv90) {
        this.shopGmv90 = shopGmv90;
    }

    public BigDecimal getShopAftersaleRate30() {
        return shopAftersaleRate30;
    }

    public GoodsIndexData withShopAftersaleRate30(BigDecimal shopAftersaleRate30) {
        this.setShopAftersaleRate30(shopAftersaleRate30);
        return this;
    }

    public void setShopAftersaleRate30(BigDecimal shopAftersaleRate30) {
        this.shopAftersaleRate30 = shopAftersaleRate30;
    }

    public Integer getShopOpenDays() {
        return shopOpenDays;
    }

    public GoodsIndexData withShopOpenDays(Integer shopOpenDays) {
        this.setShopOpenDays(shopOpenDays);
        return this;
    }

    public void setShopOpenDays(Integer shopOpenDays) {
        this.shopOpenDays = shopOpenDays;
    }

    public BigDecimal getShopDsr() {
        return shopDsr;
    }

    public GoodsIndexData withShopDsr(BigDecimal shopDsr) {
        this.setShopDsr(shopDsr);
        return this;
    }

    public void setShopDsr(BigDecimal shopDsr) {
        this.shopDsr = shopDsr;
    }

    public Long getShop30DaysSalesVolume() {
        return shop30DaysSalesVolume;
    }

    public GoodsIndexData withShop30DaysSalesVolume(Long shop30DaysSalesVolume) {
        this.setShop30DaysSalesVolume(shop30DaysSalesVolume);
        return this;
    }

    public void setShop30DaysSalesVolume(Long shop30DaysSalesVolume) {
        this.shop30DaysSalesVolume = shop30DaysSalesVolume;
    }

    public String getActivityIds() {
        return activityIds;
    }

    public GoodsIndexData withActivityIds(String activityIds) {
        this.setActivityIds(activityIds);
        return this;
    }

    public void setActivityIds(String activityIds) {
        this.activityIds = activityIds == null ? null : activityIds.trim();
    }

    public String getActivityBlacklist() {
        return activityBlacklist;
    }

    public GoodsIndexData withActivityBlacklist(String activityBlacklist) {
        this.setActivityBlacklist(activityBlacklist);
        return this;
    }

    public void setActivityBlacklist(String activityBlacklist) {
        this.activityBlacklist = activityBlacklist == null ? null : activityBlacklist.trim();
    }

    public String getShopActivityInfo() {
        return shopActivityInfo;
    }

    public GoodsIndexData withShopActivityInfo(String shopActivityInfo) {
        this.setShopActivityInfo(shopActivityInfo);
        return this;
    }

    public void setShopActivityInfo(String shopActivityInfo) {
        this.shopActivityInfo = shopActivityInfo == null ? null : shopActivityInfo.trim();
    }

    public String getShopWarmActivityInfo() {
        return shopWarmActivityInfo;
    }

    public GoodsIndexData withShopWarmActivityInfo(String shopWarmActivityInfo) {
        this.setShopWarmActivityInfo(shopWarmActivityInfo);
        return this;
    }

    public void setShopWarmActivityInfo(String shopWarmActivityInfo) {
        this.shopWarmActivityInfo = shopWarmActivityInfo == null ? null : shopWarmActivityInfo.trim();
    }

    public String getShopPartActivityIds() {
        return shopPartActivityIds;
    }

    public GoodsIndexData withShopPartActivityIds(String shopPartActivityIds) {
        this.setShopPartActivityIds(shopPartActivityIds);
        return this;
    }

    public void setShopPartActivityIds(String shopPartActivityIds) {
        this.shopPartActivityIds = shopPartActivityIds == null ? null : shopPartActivityIds.trim();
    }

    public String getShopInvestPartActivityIds() {
        return shopInvestPartActivityIds;
    }

    public GoodsIndexData withShopInvestPartActivityIds(String shopInvestPartActivityIds) {
        this.setShopInvestPartActivityIds(shopInvestPartActivityIds);
        return this;
    }

    public void setShopInvestPartActivityIds(String shopInvestPartActivityIds) {
        this.shopInvestPartActivityIds = shopInvestPartActivityIds == null ? null : shopInvestPartActivityIds.trim();
    }

    public String getShopInvestActivityIds() {
        return shopInvestActivityIds;
    }

    public GoodsIndexData withShopInvestActivityIds(String shopInvestActivityIds) {
        this.setShopInvestActivityIds(shopInvestActivityIds);
        return this;
    }

    public void setShopInvestActivityIds(String shopInvestActivityIds) {
        this.shopInvestActivityIds = shopInvestActivityIds == null ? null : shopInvestActivityIds.trim();
    }

    public String getCrossShopActivityIds() {
        return crossShopActivityIds;
    }

    public GoodsIndexData withCrossShopActivityIds(String crossShopActivityIds) {
        this.setCrossShopActivityIds(crossShopActivityIds);
        return this;
    }

    public void setCrossShopActivityIds(String crossShopActivityIds) {
        this.crossShopActivityIds = crossShopActivityIds == null ? null : crossShopActivityIds.trim();
    }

    public String getCrossShopActivityInfo() {
        return crossShopActivityInfo;
    }

    public GoodsIndexData withCrossShopActivityInfo(String crossShopActivityInfo) {
        this.setCrossShopActivityInfo(crossShopActivityInfo);
        return this;
    }

    public void setCrossShopActivityInfo(String crossShopActivityInfo) {
        this.crossShopActivityInfo = crossShopActivityInfo == null ? null : crossShopActivityInfo.trim();
    }

    public String getAllowanceActivityIds() {
        return allowanceActivityIds;
    }

    public GoodsIndexData withAllowanceActivityIds(String allowanceActivityIds) {
        this.setAllowanceActivityIds(allowanceActivityIds);
        return this;
    }

    public void setAllowanceActivityIds(String allowanceActivityIds) {
        this.allowanceActivityIds = allowanceActivityIds == null ? null : allowanceActivityIds.trim();
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public GoodsIndexData withOriginalPrice(Long originalPrice) {
        this.setOriginalPrice(originalPrice);
        return this;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Long getPrice() {
        return price;
    }

    public GoodsIndexData withPrice(Long price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getBigPromotionPrice() {
        return bigPromotionPrice;
    }

    public GoodsIndexData withBigPromotionPrice(Long bigPromotionPrice) {
        this.setBigPromotionPrice(bigPromotionPrice);
        return this;
    }

    public void setBigPromotionPrice(Long bigPromotionPrice) {
        this.bigPromotionPrice = bigPromotionPrice;
    }

    public Long getDailyPrice() {
        return dailyPrice;
    }

    public GoodsIndexData withDailyPrice(Long dailyPrice) {
        this.setDailyPrice(dailyPrice);
        return this;
    }

    public void setDailyPrice(Long dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public Long getVipPrice() {
        return vipPrice;
    }

    public GoodsIndexData withVipPrice(Long vipPrice) {
        this.setVipPrice(vipPrice);
        return this;
    }

    public void setVipPrice(Long vipPrice) {
        this.vipPrice = vipPrice;
    }

    public Long getBigPromotionVipPrice() {
        return bigPromotionVipPrice;
    }

    public GoodsIndexData withBigPromotionVipPrice(Long bigPromotionVipPrice) {
        this.setBigPromotionVipPrice(bigPromotionVipPrice);
        return this;
    }

    public void setBigPromotionVipPrice(Long bigPromotionVipPrice) {
        this.bigPromotionVipPrice = bigPromotionVipPrice;
    }

    public Long getDailyVipPrice() {
        return dailyVipPrice;
    }

    public GoodsIndexData withDailyVipPrice(Long dailyVipPrice) {
        this.setDailyVipPrice(dailyVipPrice);
        return this;
    }

    public void setDailyVipPrice(Long dailyVipPrice) {
        this.dailyVipPrice = dailyVipPrice;
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public GoodsIndexData withMarketPrice(Integer marketPrice) {
        this.setMarketPrice(marketPrice);
        return this;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getCommissionTotal() {
        return commissionTotal;
    }

    public GoodsIndexData withCommissionTotal(Long commissionTotal) {
        this.setCommissionTotal(commissionTotal);
        return this;
    }

    public void setCommissionTotal(Long commissionTotal) {
        this.commissionTotal = commissionTotal;
    }

    public Long getCommission() {
        return commission;
    }

    public GoodsIndexData withCommission(Long commission) {
        this.setCommission(commission);
        return this;
    }

    public void setCommission(Long commission) {
        this.commission = commission;
    }

    public BigDecimal getBrokerage() {
        return brokerage;
    }

    public GoodsIndexData withBrokerage(BigDecimal brokerage) {
        this.setBrokerage(brokerage);
        return this;
    }

    public void setBrokerage(BigDecimal brokerage) {
        this.brokerage = brokerage;
    }

    public Long getLowestPriceLast7Days() {
        return lowestPriceLast7Days;
    }

    public GoodsIndexData withLowestPriceLast7Days(Long lowestPriceLast7Days) {
        this.setLowestPriceLast7Days(lowestPriceLast7Days);
        return this;
    }

    public void setLowestPriceLast7Days(Long lowestPriceLast7Days) {
        this.lowestPriceLast7Days = lowestPriceLast7Days;
    }

    public Long getLowestPriceLast15Days() {
        return lowestPriceLast15Days;
    }

    public GoodsIndexData withLowestPriceLast15Days(Long lowestPriceLast15Days) {
        this.setLowestPriceLast15Days(lowestPriceLast15Days);
        return this;
    }

    public void setLowestPriceLast15Days(Long lowestPriceLast15Days) {
        this.lowestPriceLast15Days = lowestPriceLast15Days;
    }

    public Long getLowestPriceLast30Days() {
        return lowestPriceLast30Days;
    }

    public GoodsIndexData withLowestPriceLast30Days(Long lowestPriceLast30Days) {
        this.setLowestPriceLast30Days(lowestPriceLast30Days);
        return this;
    }

    public void setLowestPriceLast30Days(Long lowestPriceLast30Days) {
        this.lowestPriceLast30Days = lowestPriceLast30Days;
    }

    public Byte getInBigPromotion() {
        return inBigPromotion;
    }

    public GoodsIndexData withInBigPromotion(Byte inBigPromotion) {
        this.setInBigPromotion(inBigPromotion);
        return this;
    }

    public void setInBigPromotion(Byte inBigPromotion) {
        this.inBigPromotion = inBigPromotion;
    }

    public Long getGoods7DaysSalesVolume() {
        return goods7DaysSalesVolume;
    }

    public GoodsIndexData withGoods7DaysSalesVolume(Long goods7DaysSalesVolume) {
        this.setGoods7DaysSalesVolume(goods7DaysSalesVolume);
        return this;
    }

    public void setGoods7DaysSalesVolume(Long goods7DaysSalesVolume) {
        this.goods7DaysSalesVolume = goods7DaysSalesVolume;
    }

    public Long getGoods30DaysSalesVolume() {
        return goods30DaysSalesVolume;
    }

    public GoodsIndexData withGoods30DaysSalesVolume(Long goods30DaysSalesVolume) {
        this.setGoods30DaysSalesVolume(goods30DaysSalesVolume);
        return this;
    }

    public void setGoods30DaysSalesVolume(Long goods30DaysSalesVolume) {
        this.goods30DaysSalesVolume = goods30DaysSalesVolume;
    }

    public Long getGoods60DaysSalesVolume() {
        return goods60DaysSalesVolume;
    }

    public GoodsIndexData withGoods60DaysSalesVolume(Long goods60DaysSalesVolume) {
        this.setGoods60DaysSalesVolume(goods60DaysSalesVolume);
        return this;
    }

    public void setGoods60DaysSalesVolume(Long goods60DaysSalesVolume) {
        this.goods60DaysSalesVolume = goods60DaysSalesVolume;
    }

    public BigDecimal getGoodsGmv7() {
        return goodsGmv7;
    }

    public GoodsIndexData withGoodsGmv7(BigDecimal goodsGmv7) {
        this.setGoodsGmv7(goodsGmv7);
        return this;
    }

    public void setGoodsGmv7(BigDecimal goodsGmv7) {
        this.goodsGmv7 = goodsGmv7;
    }

    public BigDecimal getGoodsGmv30() {
        return goodsGmv30;
    }

    public GoodsIndexData withGoodsGmv30(BigDecimal goodsGmv30) {
        this.setGoodsGmv30(goodsGmv30);
        return this;
    }

    public void setGoodsGmv30(BigDecimal goodsGmv30) {
        this.goodsGmv30 = goodsGmv30;
    }

    public BigDecimal getGoodsGmv60() {
        return goodsGmv60;
    }

    public GoodsIndexData withGoodsGmv60(BigDecimal goodsGmv60) {
        this.setGoodsGmv60(goodsGmv60);
        return this;
    }

    public void setGoodsGmv60(BigDecimal goodsGmv60) {
        this.goodsGmv60 = goodsGmv60;
    }

    public BigDecimal getGoodsDsr() {
        return goodsDsr;
    }

    public GoodsIndexData withGoodsDsr(BigDecimal goodsDsr) {
        this.setGoodsDsr(goodsDsr);
        return this;
    }

    public void setGoodsDsr(BigDecimal goodsDsr) {
        this.goodsDsr = goodsDsr;
    }

    public BigDecimal getClickConverRate30() {
        return clickConverRate30;
    }

    public GoodsIndexData withClickConverRate30(BigDecimal clickConverRate30) {
        this.setClickConverRate30(clickConverRate30);
        return this;
    }

    public void setClickConverRate30(BigDecimal clickConverRate30) {
        this.clickConverRate30 = clickConverRate30;
    }

    public BigDecimal getPurchaseConverRate30() {
        return purchaseConverRate30;
    }

    public GoodsIndexData withPurchaseConverRate30(BigDecimal purchaseConverRate30) {
        this.setPurchaseConverRate30(purchaseConverRate30);
        return this;
    }

    public void setPurchaseConverRate30(BigDecimal purchaseConverRate30) {
        this.purchaseConverRate30 = purchaseConverRate30;
    }

    public BigDecimal getPayConverRate30() {
        return payConverRate30;
    }

    public GoodsIndexData withPayConverRate30(BigDecimal payConverRate30) {
        this.setPayConverRate30(payConverRate30);
        return this;
    }

    public void setPayConverRate30(BigDecimal payConverRate30) {
        this.payConverRate30 = payConverRate30;
    }

    public BigDecimal getReputationRate() {
        return reputationRate;
    }

    public GoodsIndexData withReputationRate(BigDecimal reputationRate) {
        this.setReputationRate(reputationRate);
        return this;
    }

    public void setReputationRate(BigDecimal reputationRate) {
        this.reputationRate = reputationRate;
    }

    public BigDecimal getReputationRate30() {
        return reputationRate30;
    }

    public GoodsIndexData withReputationRate30(BigDecimal reputationRate30) {
        this.setReputationRate30(reputationRate30);
        return this;
    }

    public void setReputationRate30(BigDecimal reputationRate30) {
        this.reputationRate30 = reputationRate30;
    }

    public Long getBuyerNumber() {
        return buyerNumber;
    }

    public GoodsIndexData withBuyerNumber(Long buyerNumber) {
        this.setBuyerNumber(buyerNumber);
        return this;
    }

    public void setBuyerNumber(Long buyerNumber) {
        this.buyerNumber = buyerNumber;
    }

    public BigDecimal getScore() {
        return score;
    }

    public GoodsIndexData withScore(BigDecimal score) {
        this.setScore(score);
        return this;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getWeight() {
        return weight;
    }

    public GoodsIndexData withWeight(Integer weight) {
        this.setWeight(weight);
        return this;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getPredictionScore() {
        return predictionScore;
    }

    public GoodsIndexData withPredictionScore(Double predictionScore) {
        this.setPredictionScore(predictionScore);
        return this;
    }

    public void setPredictionScore(Double predictionScore) {
        this.predictionScore = predictionScore;
    }

    public Double getItemScore() {
        return itemScore;
    }

    public GoodsIndexData withItemScore(Double itemScore) {
        this.setItemScore(itemScore);
        return this;
    }

    public void setItemScore(Double itemScore) {
        this.itemScore = itemScore;
    }

    public Boolean getInBlackList() {
        return inBlackList;
    }

    public GoodsIndexData withInBlackList(Boolean inBlackList) {
        this.setInBlackList(inBlackList);
        return this;
    }

    public void setInBlackList(Boolean inBlackList) {
        this.inBlackList = inBlackList;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public GoodsIndexData withInStock(Boolean inStock) {
        this.setInStock(inStock);
        return this;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public Byte getInFeed() {
        return inFeed;
    }

    public GoodsIndexData withInFeed(Byte inFeed) {
        this.setInFeed(inFeed);
        return this;
    }

    public void setInFeed(Byte inFeed) {
        this.inFeed = inFeed;
    }

    public Short getSkuNum() {
        return skuNum;
    }

    public GoodsIndexData withSkuNum(Short skuNum) {
        this.setSkuNum(skuNum);
        return this;
    }

    public void setSkuNum(Short skuNum) {
        this.skuNum = skuNum;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public GoodsIndexData withDeleted(Boolean deleted) {
        this.setDeleted(deleted);
        return this;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public GoodsIndexData withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public GoodsIndexData withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getAnchorEarning() {
        return anchorEarning;
    }

    public GoodsIndexData withAnchorEarning(Long anchorEarning) {
        this.setAnchorEarning(anchorEarning);
        return this;
    }

    public void setAnchorEarning(Long anchorEarning) {
        this.anchorEarning = anchorEarning;
    }

    public BigDecimal getAnchorCommission() {
        return anchorCommission;
    }

    public GoodsIndexData withAnchorCommission(BigDecimal anchorCommission) {
        this.setAnchorCommission(anchorCommission);
        return this;
    }

    public void setAnchorCommission(BigDecimal anchorCommission) {
        this.anchorCommission = anchorCommission;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", longTitle=").append(longTitle);
        sb.append(", shortTitle=").append(shortTitle);
        sb.append(", channel=").append(channel);
        sb.append(", originalChannel=").append(originalChannel);
        sb.append(", shelf=").append(shelf);
        sb.append(", status=").append(status);
        sb.append(", itemType=").append(itemType);
        sb.append(", itemSubType=").append(itemSubType);
        sb.append(", firstShelfTime=").append(firstShelfTime);
        sb.append(", itemCreateTime=").append(itemCreateTime);
        sb.append(", itemDeliverAreaType=").append(itemDeliverAreaType);
        sb.append(", whiteImageUrl=").append(whiteImageUrl);
        sb.append(", whiteImageWidth=").append(whiteImageWidth);
        sb.append(", whiteImageHeight=").append(whiteImageHeight);
        sb.append(", majorImageUrl=").append(majorImageUrl);
        sb.append(", majorImageWidth=").append(majorImageWidth);
        sb.append(", majorImageHeight=").append(majorImageHeight);
        sb.append(", brandId=").append(brandId);
        sb.append(", brandCnName=").append(brandCnName);
        sb.append(", brandEnName=").append(brandEnName);
        sb.append(", brandStateId=").append(brandStateId);
        sb.append(", brandStateName=").append(brandStateName);
        sb.append(", brandCountryFlagUrl=").append(brandCountryFlagUrl);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryIdPath=").append(categoryIdPath);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryPathName=").append(categoryPathName);
        sb.append(", searchTags=").append(searchTags);
        sb.append(", goodsTags=").append(goodsTags);
        sb.append(", goodsProperties=").append(goodsProperties);
        sb.append(", shopId=").append(shopId);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopClassId=").append(shopClassId);
        sb.append(", shopType=").append(shopType);
        sb.append(", registrationAddressType=").append(registrationAddressType);
        sb.append(", shopLevel=").append(shopLevel);
        sb.append(", shopMajorCategoryIds=").append(shopMajorCategoryIds);
        sb.append(", shopGmv30=").append(shopGmv30);
        sb.append(", shopGmv90=").append(shopGmv90);
        sb.append(", shopAftersaleRate30=").append(shopAftersaleRate30);
        sb.append(", shopOpenDays=").append(shopOpenDays);
        sb.append(", shopDsr=").append(shopDsr);
        sb.append(", shop30DaysSalesVolume=").append(shop30DaysSalesVolume);
        sb.append(", activityIds=").append(activityIds);
        sb.append(", activityBlacklist=").append(activityBlacklist);
        sb.append(", shopActivityInfo=").append(shopActivityInfo);
        sb.append(", shopWarmActivityInfo=").append(shopWarmActivityInfo);
        sb.append(", shopPartActivityIds=").append(shopPartActivityIds);
        sb.append(", shopInvestPartActivityIds=").append(shopInvestPartActivityIds);
        sb.append(", shopInvestActivityIds=").append(shopInvestActivityIds);
        sb.append(", crossShopActivityIds=").append(crossShopActivityIds);
        sb.append(", crossShopActivityInfo=").append(crossShopActivityInfo);
        sb.append(", allowanceActivityIds=").append(allowanceActivityIds);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", price=").append(price);
        sb.append(", bigPromotionPrice=").append(bigPromotionPrice);
        sb.append(", dailyPrice=").append(dailyPrice);
        sb.append(", vipPrice=").append(vipPrice);
        sb.append(", bigPromotionVipPrice=").append(bigPromotionVipPrice);
        sb.append(", dailyVipPrice=").append(dailyVipPrice);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", commissionTotal=").append(commissionTotal);
        sb.append(", commission=").append(commission);
        sb.append(", brokerage=").append(brokerage);
        sb.append(", lowestPriceLast7Days=").append(lowestPriceLast7Days);
        sb.append(", lowestPriceLast15Days=").append(lowestPriceLast15Days);
        sb.append(", lowestPriceLast30Days=").append(lowestPriceLast30Days);
        sb.append(", inBigPromotion=").append(inBigPromotion);
        sb.append(", goods7DaysSalesVolume=").append(goods7DaysSalesVolume);
        sb.append(", goods30DaysSalesVolume=").append(goods30DaysSalesVolume);
        sb.append(", goods60DaysSalesVolume=").append(goods60DaysSalesVolume);
        sb.append(", goodsGmv7=").append(goodsGmv7);
        sb.append(", goodsGmv30=").append(goodsGmv30);
        sb.append(", goodsGmv60=").append(goodsGmv60);
        sb.append(", goodsDsr=").append(goodsDsr);
        sb.append(", clickConverRate30=").append(clickConverRate30);
        sb.append(", purchaseConverRate30=").append(purchaseConverRate30);
        sb.append(", payConverRate30=").append(payConverRate30);
        sb.append(", reputationRate=").append(reputationRate);
        sb.append(", reputationRate30=").append(reputationRate30);
        sb.append(", buyerNumber=").append(buyerNumber);
        sb.append(", score=").append(score);
        sb.append(", weight=").append(weight);
        sb.append(", predictionScore=").append(predictionScore);
        sb.append(", itemScore=").append(itemScore);
        sb.append(", inBlackList=").append(inBlackList);
        sb.append(", inStock=").append(inStock);
        sb.append(", inFeed=").append(inFeed);
        sb.append(", skuNum=").append(skuNum);
        sb.append(", deleted=").append(deleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", anchorEarning=").append(anchorEarning);
        sb.append(", anchorCommission=").append(anchorCommission);
        sb.append("]");
        return sb.toString();
    }
}