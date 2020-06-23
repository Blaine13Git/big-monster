package com.muyi.bigMonster.mapper.daily3;

import com.muyi.bigMonster.model.daily3.GoodsIndexDataExample.Criteria;
import com.muyi.bigMonster.model.daily3.GoodsIndexDataExample.Criterion;
import com.muyi.bigMonster.model.daily3.GoodsIndexDataExample;
import com.muyi.bigMonster.model.daily3.GoodsIndexDataWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class GoodsIndexDataSqlProvider {
    public String countByExample(GoodsIndexDataExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("goods_index_data");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(GoodsIndexDataExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("goods_index_data");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(GoodsIndexDataWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("goods_index_data");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getItemId() != null) {
            sql.VALUES("item_id", "#{itemId,jdbcType=BIGINT}");
        }
        
        if (record.getLongTitle() != null) {
            sql.VALUES("long_title", "#{longTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getShortTitle() != null) {
            sql.VALUES("short_title", "#{shortTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getChannel() != null) {
            sql.VALUES("channel", "#{channel,jdbcType=TINYINT}");
        }
        
        if (record.getOriginalChannel() != null) {
            sql.VALUES("original_channel", "#{originalChannel,jdbcType=TINYINT}");
        }
        
        if (record.getShelf() != null) {
            sql.VALUES("shelf", "#{shelf,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getItemType() != null) {
            sql.VALUES("item_type", "#{itemType,jdbcType=TINYINT}");
        }
        
        if (record.getItemSubType() != null) {
            sql.VALUES("item_sub_type", "#{itemSubType,jdbcType=TINYINT}");
        }
        
        if (record.getFirstShelfTime() != null) {
            sql.VALUES("first_shelf_time", "#{firstShelfTime,jdbcType=BIGINT}");
        }
        
        if (record.getItemCreateTime() != null) {
            sql.VALUES("item_create_time", "#{itemCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getItemDeliverAreaType() != null) {
            sql.VALUES("item_deliver_area_type", "#{itemDeliverAreaType,jdbcType=BIT}");
        }
        
        if (record.getWhiteImageUrl() != null) {
            sql.VALUES("white_image_url", "#{whiteImageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getWhiteImageWidth() != null) {
            sql.VALUES("white_image_width", "#{whiteImageWidth,jdbcType=INTEGER}");
        }
        
        if (record.getWhiteImageHeight() != null) {
            sql.VALUES("white_image_height", "#{whiteImageHeight,jdbcType=INTEGER}");
        }
        
        if (record.getMajorImageUrl() != null) {
            sql.VALUES("major_image_url", "#{majorImageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorImageWidth() != null) {
            sql.VALUES("major_image_width", "#{majorImageWidth,jdbcType=INTEGER}");
        }
        
        if (record.getMajorImageHeight() != null) {
            sql.VALUES("major_image_height", "#{majorImageHeight,jdbcType=INTEGER}");
        }
        
        if (record.getBrandId() != null) {
            sql.VALUES("brand_id", "#{brandId,jdbcType=INTEGER}");
        }
        
        if (record.getBrandCnName() != null) {
            sql.VALUES("brand_cn_name", "#{brandCnName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandEnName() != null) {
            sql.VALUES("brand_en_name", "#{brandEnName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandStateId() != null) {
            sql.VALUES("brand_state_id", "#{brandStateId,jdbcType=INTEGER}");
        }
        
        if (record.getBrandStateName() != null) {
            sql.VALUES("brand_state_name", "#{brandStateName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandCountryFlagUrl() != null) {
            sql.VALUES("brand_country_flag_url", "#{brandCountryFlagUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryId() != null) {
            sql.VALUES("category_id", "#{categoryId,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryIdPath() != null) {
            sql.VALUES("category_id_path", "#{categoryIdPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryName() != null) {
            sql.VALUES("category_name", "#{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPathName() != null) {
            sql.VALUES("category_path_name", "#{categoryPathName,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchTags() != null) {
            sql.VALUES("search_tags", "#{searchTags,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsTags() != null) {
            sql.VALUES("goods_tags", "#{goodsTags,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsProperties() != null) {
            sql.VALUES("goods_properties", "#{goodsProperties,jdbcType=VARCHAR}");
        }
        
        if (record.getShopId() != null) {
            sql.VALUES("shop_id", "#{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getShopName() != null) {
            sql.VALUES("shop_name", "#{shopName,jdbcType=VARCHAR}");
        }
        
        if (record.getShopClassId() != null) {
            sql.VALUES("shop_class_id", "#{shopClassId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopType() != null) {
            sql.VALUES("shop_type", "#{shopType,jdbcType=BIT}");
        }
        
        if (record.getRegistrationAddressType() != null) {
            sql.VALUES("registration_address_type", "#{registrationAddressType,jdbcType=BIT}");
        }
        
        if (record.getShopLevel() != null) {
            sql.VALUES("shop_level", "#{shopLevel,jdbcType=BIT}");
        }
        
        if (record.getShopMajorCategoryIds() != null) {
            sql.VALUES("shop_major_category_ids", "#{shopMajorCategoryIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopGmv30() != null) {
            sql.VALUES("shop_gmv_30", "#{shopGmv30,jdbcType=DECIMAL}");
        }
        
        if (record.getShopGmv90() != null) {
            sql.VALUES("shop_gmv_90", "#{shopGmv90,jdbcType=DECIMAL}");
        }
        
        if (record.getShopAftersaleRate30() != null) {
            sql.VALUES("shop_aftersale_rate_30", "#{shopAftersaleRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getShopOpenDays() != null) {
            sql.VALUES("shop_open_days", "#{shopOpenDays,jdbcType=INTEGER}");
        }
        
        if (record.getShopDsr() != null) {
            sql.VALUES("shop_dsr", "#{shopDsr,jdbcType=DECIMAL}");
        }
        
        if (record.getShop30DaysSalesVolume() != null) {
            sql.VALUES("shop_30_days_sales_volume", "#{shop30DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getActivityIds() != null) {
            sql.VALUES("activity_ids", "#{activityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityBlacklist() != null) {
            sql.VALUES("activity_blacklist", "#{activityBlacklist,jdbcType=VARCHAR}");
        }
        
        if (record.getShopActivityInfo() != null) {
            sql.VALUES("shop_activity_info", "#{shopActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopWarmActivityInfo() != null) {
            sql.VALUES("shop_warm_activity_info", "#{shopWarmActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopPartActivityIds() != null) {
            sql.VALUES("shop_part_activity_ids", "#{shopPartActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopInvestPartActivityIds() != null) {
            sql.VALUES("shop_invest_part_activity_ids", "#{shopInvestPartActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopInvestActivityIds() != null) {
            sql.VALUES("shop_invest_activity_ids", "#{shopInvestActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getCrossShopActivityIds() != null) {
            sql.VALUES("cross_shop_activity_ids", "#{crossShopActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getCrossShopActivityInfo() != null) {
            sql.VALUES("cross_shop_activity_info", "#{crossShopActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getAllowanceActivityIds() != null) {
            sql.VALUES("allowance_activity_ids", "#{allowanceActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginalPrice() != null) {
            sql.VALUES("original_price", "#{originalPrice,jdbcType=BIGINT}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=BIGINT}");
        }
        
        if (record.getBigPromotionPrice() != null) {
            sql.VALUES("big_promotion_price", "#{bigPromotionPrice,jdbcType=BIGINT}");
        }
        
        if (record.getDailyPrice() != null) {
            sql.VALUES("daily_price", "#{dailyPrice,jdbcType=BIGINT}");
        }
        
        if (record.getVipPrice() != null) {
            sql.VALUES("vip_price", "#{vipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getBigPromotionVipPrice() != null) {
            sql.VALUES("big_promotion_vip_price", "#{bigPromotionVipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getDailyVipPrice() != null) {
            sql.VALUES("daily_vip_price", "#{dailyVipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getMarketPrice() != null) {
            sql.VALUES("market_price", "#{marketPrice,jdbcType=INTEGER}");
        }
        
        if (record.getCommissionTotal() != null) {
            sql.VALUES("commission_total", "#{commissionTotal,jdbcType=BIGINT}");
        }
        
        if (record.getCommission() != null) {
            sql.VALUES("commission", "#{commission,jdbcType=BIGINT}");
        }
        
        if (record.getBrokerage() != null) {
            sql.VALUES("brokerage", "#{brokerage,jdbcType=DECIMAL}");
        }
        
        if (record.getLowestPriceLast7Days() != null) {
            sql.VALUES("lowest_price_last_7_days", "#{lowestPriceLast7Days,jdbcType=BIGINT}");
        }
        
        if (record.getLowestPriceLast15Days() != null) {
            sql.VALUES("lowest_price_last_15_days", "#{lowestPriceLast15Days,jdbcType=BIGINT}");
        }
        
        if (record.getLowestPriceLast30Days() != null) {
            sql.VALUES("lowest_price_last_30_days", "#{lowestPriceLast30Days,jdbcType=BIGINT}");
        }
        
        if (record.getInBigPromotion() != null) {
            sql.VALUES("in_big_promotion", "#{inBigPromotion,jdbcType=TINYINT}");
        }
        
        if (record.getGoods7DaysSalesVolume() != null) {
            sql.VALUES("goods_7_days_sales_volume", "#{goods7DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoods30DaysSalesVolume() != null) {
            sql.VALUES("goods_30_days_sales_volume", "#{goods30DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoods60DaysSalesVolume() != null) {
            sql.VALUES("goods_60_days_sales_volume", "#{goods60DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsGmv7() != null) {
            sql.VALUES("goods_gmv_7", "#{goodsGmv7,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsGmv30() != null) {
            sql.VALUES("goods_gmv_30", "#{goodsGmv30,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsGmv60() != null) {
            sql.VALUES("goods_gmv_60", "#{goodsGmv60,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsDsr() != null) {
            sql.VALUES("goods_dsr", "#{goodsDsr,jdbcType=DECIMAL}");
        }
        
        if (record.getClickConverRate30() != null) {
            sql.VALUES("click_conver_rate_30", "#{clickConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getPurchaseConverRate30() != null) {
            sql.VALUES("purchase_conver_rate_30", "#{purchaseConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getPayConverRate30() != null) {
            sql.VALUES("pay_conver_rate_30", "#{payConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getReputationRate() != null) {
            sql.VALUES("reputation_rate", "#{reputationRate,jdbcType=DECIMAL}");
        }
        
        if (record.getReputationRate30() != null) {
            sql.VALUES("reputation_rate30", "#{reputationRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getBuyerNumber() != null) {
            sql.VALUES("buyer_number", "#{buyerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=DECIMAL}");
        }
        
        if (record.getWeight() != null) {
            sql.VALUES("weight", "#{weight,jdbcType=INTEGER}");
        }
        
        if (record.getPredictionScore() != null) {
            sql.VALUES("prediction_score", "#{predictionScore,jdbcType=DOUBLE}");
        }
        
        if (record.getItemScore() != null) {
            sql.VALUES("item_score", "#{itemScore,jdbcType=DOUBLE}");
        }
        
        if (record.getInBlackList() != null) {
            sql.VALUES("in_black_list", "#{inBlackList,jdbcType=BIT}");
        }
        
        if (record.getInStock() != null) {
            sql.VALUES("in_stock", "#{inStock,jdbcType=BIT}");
        }
        
        if (record.getInFeed() != null) {
            sql.VALUES("in_feed", "#{inFeed,jdbcType=TINYINT}");
        }
        
        if (record.getSkuNum() != null) {
            sql.VALUES("sku_num", "#{skuNum,jdbcType=SMALLINT}");
        }
        
        if (record.getDeleted() != null) {
            sql.VALUES("deleted", "#{deleted,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnchorEarning() != null) {
            sql.VALUES("anchor_earning", "#{anchorEarning,jdbcType=BIGINT}");
        }
        
        if (record.getAnchorCommission() != null) {
            sql.VALUES("anchor_commission", "#{anchorCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelData() != null) {
            sql.VALUES("channel_data", "#{channelData,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getShopTags() != null) {
            sql.VALUES("shop_tags", "#{shopTags,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getActivityTags() != null) {
            sql.VALUES("activity_tags", "#{activityTags,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getWholeSaleDiscounts() != null) {
            sql.VALUES("whole_sale_discounts", "#{wholeSaleDiscounts,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getBigPromotionPriceInfo() != null) {
            sql.VALUES("big_promotion_price_info", "#{bigPromotionPriceInfo,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getAdvanceSaleInfo() != null) {
            sql.VALUES("advance_sale_info", "#{advanceSaleInfo,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getEmbedding() != null) {
            sql.VALUES("embedding", "#{embedding,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(GoodsIndexDataExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("item_id");
        sql.SELECT("long_title");
        sql.SELECT("short_title");
        sql.SELECT("channel");
        sql.SELECT("original_channel");
        sql.SELECT("shelf");
        sql.SELECT("status");
        sql.SELECT("item_type");
        sql.SELECT("item_sub_type");
        sql.SELECT("first_shelf_time");
        sql.SELECT("item_create_time");
        sql.SELECT("item_deliver_area_type");
        sql.SELECT("white_image_url");
        sql.SELECT("white_image_width");
        sql.SELECT("white_image_height");
        sql.SELECT("major_image_url");
        sql.SELECT("major_image_width");
        sql.SELECT("major_image_height");
        sql.SELECT("brand_id");
        sql.SELECT("brand_cn_name");
        sql.SELECT("brand_en_name");
        sql.SELECT("brand_state_id");
        sql.SELECT("brand_state_name");
        sql.SELECT("brand_country_flag_url");
        sql.SELECT("category_id");
        sql.SELECT("category_id_path");
        sql.SELECT("category_name");
        sql.SELECT("category_path_name");
        sql.SELECT("search_tags");
        sql.SELECT("goods_tags");
        sql.SELECT("goods_properties");
        sql.SELECT("shop_id");
        sql.SELECT("shop_name");
        sql.SELECT("shop_class_id");
        sql.SELECT("shop_type");
        sql.SELECT("registration_address_type");
        sql.SELECT("shop_level");
        sql.SELECT("shop_major_category_ids");
        sql.SELECT("shop_gmv_30");
        sql.SELECT("shop_gmv_90");
        sql.SELECT("shop_aftersale_rate_30");
        sql.SELECT("shop_open_days");
        sql.SELECT("shop_dsr");
        sql.SELECT("shop_30_days_sales_volume");
        sql.SELECT("activity_ids");
        sql.SELECT("activity_blacklist");
        sql.SELECT("shop_activity_info");
        sql.SELECT("shop_warm_activity_info");
        sql.SELECT("shop_part_activity_ids");
        sql.SELECT("shop_invest_part_activity_ids");
        sql.SELECT("shop_invest_activity_ids");
        sql.SELECT("cross_shop_activity_ids");
        sql.SELECT("cross_shop_activity_info");
        sql.SELECT("allowance_activity_ids");
        sql.SELECT("original_price");
        sql.SELECT("price");
        sql.SELECT("big_promotion_price");
        sql.SELECT("daily_price");
        sql.SELECT("vip_price");
        sql.SELECT("big_promotion_vip_price");
        sql.SELECT("daily_vip_price");
        sql.SELECT("market_price");
        sql.SELECT("commission_total");
        sql.SELECT("commission");
        sql.SELECT("brokerage");
        sql.SELECT("lowest_price_last_7_days");
        sql.SELECT("lowest_price_last_15_days");
        sql.SELECT("lowest_price_last_30_days");
        sql.SELECT("in_big_promotion");
        sql.SELECT("goods_7_days_sales_volume");
        sql.SELECT("goods_30_days_sales_volume");
        sql.SELECT("goods_60_days_sales_volume");
        sql.SELECT("goods_gmv_7");
        sql.SELECT("goods_gmv_30");
        sql.SELECT("goods_gmv_60");
        sql.SELECT("goods_dsr");
        sql.SELECT("click_conver_rate_30");
        sql.SELECT("purchase_conver_rate_30");
        sql.SELECT("pay_conver_rate_30");
        sql.SELECT("reputation_rate");
        sql.SELECT("reputation_rate30");
        sql.SELECT("buyer_number");
        sql.SELECT("score");
        sql.SELECT("weight");
        sql.SELECT("prediction_score");
        sql.SELECT("item_score");
        sql.SELECT("in_black_list");
        sql.SELECT("in_stock");
        sql.SELECT("in_feed");
        sql.SELECT("sku_num");
        sql.SELECT("deleted");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("anchor_earning");
        sql.SELECT("anchor_commission");
        sql.SELECT("channel_data");
        sql.SELECT("shop_tags");
        sql.SELECT("activity_tags");
        sql.SELECT("whole_sale_discounts");
        sql.SELECT("big_promotion_price_info");
        sql.SELECT("advance_sale_info");
        sql.SELECT("embedding");
        sql.FROM("goods_index_data");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(GoodsIndexDataExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("item_id");
        sql.SELECT("long_title");
        sql.SELECT("short_title");
        sql.SELECT("channel");
        sql.SELECT("original_channel");
        sql.SELECT("shelf");
        sql.SELECT("status");
        sql.SELECT("item_type");
        sql.SELECT("item_sub_type");
        sql.SELECT("first_shelf_time");
        sql.SELECT("item_create_time");
        sql.SELECT("item_deliver_area_type");
        sql.SELECT("white_image_url");
        sql.SELECT("white_image_width");
        sql.SELECT("white_image_height");
        sql.SELECT("major_image_url");
        sql.SELECT("major_image_width");
        sql.SELECT("major_image_height");
        sql.SELECT("brand_id");
        sql.SELECT("brand_cn_name");
        sql.SELECT("brand_en_name");
        sql.SELECT("brand_state_id");
        sql.SELECT("brand_state_name");
        sql.SELECT("brand_country_flag_url");
        sql.SELECT("category_id");
        sql.SELECT("category_id_path");
        sql.SELECT("category_name");
        sql.SELECT("category_path_name");
        sql.SELECT("search_tags");
        sql.SELECT("goods_tags");
        sql.SELECT("goods_properties");
        sql.SELECT("shop_id");
        sql.SELECT("shop_name");
        sql.SELECT("shop_class_id");
        sql.SELECT("shop_type");
        sql.SELECT("registration_address_type");
        sql.SELECT("shop_level");
        sql.SELECT("shop_major_category_ids");
        sql.SELECT("shop_gmv_30");
        sql.SELECT("shop_gmv_90");
        sql.SELECT("shop_aftersale_rate_30");
        sql.SELECT("shop_open_days");
        sql.SELECT("shop_dsr");
        sql.SELECT("shop_30_days_sales_volume");
        sql.SELECT("activity_ids");
        sql.SELECT("activity_blacklist");
        sql.SELECT("shop_activity_info");
        sql.SELECT("shop_warm_activity_info");
        sql.SELECT("shop_part_activity_ids");
        sql.SELECT("shop_invest_part_activity_ids");
        sql.SELECT("shop_invest_activity_ids");
        sql.SELECT("cross_shop_activity_ids");
        sql.SELECT("cross_shop_activity_info");
        sql.SELECT("allowance_activity_ids");
        sql.SELECT("original_price");
        sql.SELECT("price");
        sql.SELECT("big_promotion_price");
        sql.SELECT("daily_price");
        sql.SELECT("vip_price");
        sql.SELECT("big_promotion_vip_price");
        sql.SELECT("daily_vip_price");
        sql.SELECT("market_price");
        sql.SELECT("commission_total");
        sql.SELECT("commission");
        sql.SELECT("brokerage");
        sql.SELECT("lowest_price_last_7_days");
        sql.SELECT("lowest_price_last_15_days");
        sql.SELECT("lowest_price_last_30_days");
        sql.SELECT("in_big_promotion");
        sql.SELECT("goods_7_days_sales_volume");
        sql.SELECT("goods_30_days_sales_volume");
        sql.SELECT("goods_60_days_sales_volume");
        sql.SELECT("goods_gmv_7");
        sql.SELECT("goods_gmv_30");
        sql.SELECT("goods_gmv_60");
        sql.SELECT("goods_dsr");
        sql.SELECT("click_conver_rate_30");
        sql.SELECT("purchase_conver_rate_30");
        sql.SELECT("pay_conver_rate_30");
        sql.SELECT("reputation_rate");
        sql.SELECT("reputation_rate30");
        sql.SELECT("buyer_number");
        sql.SELECT("score");
        sql.SELECT("weight");
        sql.SELECT("prediction_score");
        sql.SELECT("item_score");
        sql.SELECT("in_black_list");
        sql.SELECT("in_stock");
        sql.SELECT("in_feed");
        sql.SELECT("sku_num");
        sql.SELECT("deleted");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("anchor_earning");
        sql.SELECT("anchor_commission");
        sql.FROM("goods_index_data");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GoodsIndexDataWithBLOBs record = (GoodsIndexDataWithBLOBs) parameter.get("record");
        GoodsIndexDataExample example = (GoodsIndexDataExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("goods_index_data");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        }
        
        if (record.getLongTitle() != null) {
            sql.SET("long_title = #{record.longTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getShortTitle() != null) {
            sql.SET("short_title = #{record.shortTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{record.channel,jdbcType=TINYINT}");
        }
        
        if (record.getOriginalChannel() != null) {
            sql.SET("original_channel = #{record.originalChannel,jdbcType=TINYINT}");
        }
        
        if (record.getShelf() != null) {
            sql.SET("shelf = #{record.shelf,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getItemType() != null) {
            sql.SET("item_type = #{record.itemType,jdbcType=TINYINT}");
        }
        
        if (record.getItemSubType() != null) {
            sql.SET("item_sub_type = #{record.itemSubType,jdbcType=TINYINT}");
        }
        
        if (record.getFirstShelfTime() != null) {
            sql.SET("first_shelf_time = #{record.firstShelfTime,jdbcType=BIGINT}");
        }
        
        if (record.getItemCreateTime() != null) {
            sql.SET("item_create_time = #{record.itemCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getItemDeliverAreaType() != null) {
            sql.SET("item_deliver_area_type = #{record.itemDeliverAreaType,jdbcType=BIT}");
        }
        
        if (record.getWhiteImageUrl() != null) {
            sql.SET("white_image_url = #{record.whiteImageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getWhiteImageWidth() != null) {
            sql.SET("white_image_width = #{record.whiteImageWidth,jdbcType=INTEGER}");
        }
        
        if (record.getWhiteImageHeight() != null) {
            sql.SET("white_image_height = #{record.whiteImageHeight,jdbcType=INTEGER}");
        }
        
        if (record.getMajorImageUrl() != null) {
            sql.SET("major_image_url = #{record.majorImageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorImageWidth() != null) {
            sql.SET("major_image_width = #{record.majorImageWidth,jdbcType=INTEGER}");
        }
        
        if (record.getMajorImageHeight() != null) {
            sql.SET("major_image_height = #{record.majorImageHeight,jdbcType=INTEGER}");
        }
        
        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        }
        
        if (record.getBrandCnName() != null) {
            sql.SET("brand_cn_name = #{record.brandCnName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandEnName() != null) {
            sql.SET("brand_en_name = #{record.brandEnName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandStateId() != null) {
            sql.SET("brand_state_id = #{record.brandStateId,jdbcType=INTEGER}");
        }
        
        if (record.getBrandStateName() != null) {
            sql.SET("brand_state_name = #{record.brandStateName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandCountryFlagUrl() != null) {
            sql.SET("brand_country_flag_url = #{record.brandCountryFlagUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryId() != null) {
            sql.SET("category_id = #{record.categoryId,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryIdPath() != null) {
            sql.SET("category_id_path = #{record.categoryIdPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryName() != null) {
            sql.SET("category_name = #{record.categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPathName() != null) {
            sql.SET("category_path_name = #{record.categoryPathName,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchTags() != null) {
            sql.SET("search_tags = #{record.searchTags,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsTags() != null) {
            sql.SET("goods_tags = #{record.goodsTags,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsProperties() != null) {
            sql.SET("goods_properties = #{record.goodsProperties,jdbcType=VARCHAR}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{record.shopId,jdbcType=BIGINT}");
        }
        
        if (record.getShopName() != null) {
            sql.SET("shop_name = #{record.shopName,jdbcType=VARCHAR}");
        }
        
        if (record.getShopClassId() != null) {
            sql.SET("shop_class_id = #{record.shopClassId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopType() != null) {
            sql.SET("shop_type = #{record.shopType,jdbcType=BIT}");
        }
        
        if (record.getRegistrationAddressType() != null) {
            sql.SET("registration_address_type = #{record.registrationAddressType,jdbcType=BIT}");
        }
        
        if (record.getShopLevel() != null) {
            sql.SET("shop_level = #{record.shopLevel,jdbcType=BIT}");
        }
        
        if (record.getShopMajorCategoryIds() != null) {
            sql.SET("shop_major_category_ids = #{record.shopMajorCategoryIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopGmv30() != null) {
            sql.SET("shop_gmv_30 = #{record.shopGmv30,jdbcType=DECIMAL}");
        }
        
        if (record.getShopGmv90() != null) {
            sql.SET("shop_gmv_90 = #{record.shopGmv90,jdbcType=DECIMAL}");
        }
        
        if (record.getShopAftersaleRate30() != null) {
            sql.SET("shop_aftersale_rate_30 = #{record.shopAftersaleRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getShopOpenDays() != null) {
            sql.SET("shop_open_days = #{record.shopOpenDays,jdbcType=INTEGER}");
        }
        
        if (record.getShopDsr() != null) {
            sql.SET("shop_dsr = #{record.shopDsr,jdbcType=DECIMAL}");
        }
        
        if (record.getShop30DaysSalesVolume() != null) {
            sql.SET("shop_30_days_sales_volume = #{record.shop30DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getActivityIds() != null) {
            sql.SET("activity_ids = #{record.activityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityBlacklist() != null) {
            sql.SET("activity_blacklist = #{record.activityBlacklist,jdbcType=VARCHAR}");
        }
        
        if (record.getShopActivityInfo() != null) {
            sql.SET("shop_activity_info = #{record.shopActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopWarmActivityInfo() != null) {
            sql.SET("shop_warm_activity_info = #{record.shopWarmActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopPartActivityIds() != null) {
            sql.SET("shop_part_activity_ids = #{record.shopPartActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopInvestPartActivityIds() != null) {
            sql.SET("shop_invest_part_activity_ids = #{record.shopInvestPartActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopInvestActivityIds() != null) {
            sql.SET("shop_invest_activity_ids = #{record.shopInvestActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getCrossShopActivityIds() != null) {
            sql.SET("cross_shop_activity_ids = #{record.crossShopActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getCrossShopActivityInfo() != null) {
            sql.SET("cross_shop_activity_info = #{record.crossShopActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getAllowanceActivityIds() != null) {
            sql.SET("allowance_activity_ids = #{record.allowanceActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginalPrice() != null) {
            sql.SET("original_price = #{record.originalPrice,jdbcType=BIGINT}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{record.price,jdbcType=BIGINT}");
        }
        
        if (record.getBigPromotionPrice() != null) {
            sql.SET("big_promotion_price = #{record.bigPromotionPrice,jdbcType=BIGINT}");
        }
        
        if (record.getDailyPrice() != null) {
            sql.SET("daily_price = #{record.dailyPrice,jdbcType=BIGINT}");
        }
        
        if (record.getVipPrice() != null) {
            sql.SET("vip_price = #{record.vipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getBigPromotionVipPrice() != null) {
            sql.SET("big_promotion_vip_price = #{record.bigPromotionVipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getDailyVipPrice() != null) {
            sql.SET("daily_vip_price = #{record.dailyVipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getMarketPrice() != null) {
            sql.SET("market_price = #{record.marketPrice,jdbcType=INTEGER}");
        }
        
        if (record.getCommissionTotal() != null) {
            sql.SET("commission_total = #{record.commissionTotal,jdbcType=BIGINT}");
        }
        
        if (record.getCommission() != null) {
            sql.SET("commission = #{record.commission,jdbcType=BIGINT}");
        }
        
        if (record.getBrokerage() != null) {
            sql.SET("brokerage = #{record.brokerage,jdbcType=DECIMAL}");
        }
        
        if (record.getLowestPriceLast7Days() != null) {
            sql.SET("lowest_price_last_7_days = #{record.lowestPriceLast7Days,jdbcType=BIGINT}");
        }
        
        if (record.getLowestPriceLast15Days() != null) {
            sql.SET("lowest_price_last_15_days = #{record.lowestPriceLast15Days,jdbcType=BIGINT}");
        }
        
        if (record.getLowestPriceLast30Days() != null) {
            sql.SET("lowest_price_last_30_days = #{record.lowestPriceLast30Days,jdbcType=BIGINT}");
        }
        
        if (record.getInBigPromotion() != null) {
            sql.SET("in_big_promotion = #{record.inBigPromotion,jdbcType=TINYINT}");
        }
        
        if (record.getGoods7DaysSalesVolume() != null) {
            sql.SET("goods_7_days_sales_volume = #{record.goods7DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoods30DaysSalesVolume() != null) {
            sql.SET("goods_30_days_sales_volume = #{record.goods30DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoods60DaysSalesVolume() != null) {
            sql.SET("goods_60_days_sales_volume = #{record.goods60DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsGmv7() != null) {
            sql.SET("goods_gmv_7 = #{record.goodsGmv7,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsGmv30() != null) {
            sql.SET("goods_gmv_30 = #{record.goodsGmv30,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsGmv60() != null) {
            sql.SET("goods_gmv_60 = #{record.goodsGmv60,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsDsr() != null) {
            sql.SET("goods_dsr = #{record.goodsDsr,jdbcType=DECIMAL}");
        }
        
        if (record.getClickConverRate30() != null) {
            sql.SET("click_conver_rate_30 = #{record.clickConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getPurchaseConverRate30() != null) {
            sql.SET("purchase_conver_rate_30 = #{record.purchaseConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getPayConverRate30() != null) {
            sql.SET("pay_conver_rate_30 = #{record.payConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getReputationRate() != null) {
            sql.SET("reputation_rate = #{record.reputationRate,jdbcType=DECIMAL}");
        }
        
        if (record.getReputationRate30() != null) {
            sql.SET("reputation_rate30 = #{record.reputationRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getBuyerNumber() != null) {
            sql.SET("buyer_number = #{record.buyerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{record.score,jdbcType=DECIMAL}");
        }
        
        if (record.getWeight() != null) {
            sql.SET("weight = #{record.weight,jdbcType=INTEGER}");
        }
        
        if (record.getPredictionScore() != null) {
            sql.SET("prediction_score = #{record.predictionScore,jdbcType=DOUBLE}");
        }
        
        if (record.getItemScore() != null) {
            sql.SET("item_score = #{record.itemScore,jdbcType=DOUBLE}");
        }
        
        if (record.getInBlackList() != null) {
            sql.SET("in_black_list = #{record.inBlackList,jdbcType=BIT}");
        }
        
        if (record.getInStock() != null) {
            sql.SET("in_stock = #{record.inStock,jdbcType=BIT}");
        }
        
        if (record.getInFeed() != null) {
            sql.SET("in_feed = #{record.inFeed,jdbcType=TINYINT}");
        }
        
        if (record.getSkuNum() != null) {
            sql.SET("sku_num = #{record.skuNum,jdbcType=SMALLINT}");
        }
        
        if (record.getDeleted() != null) {
            sql.SET("deleted = #{record.deleted,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnchorEarning() != null) {
            sql.SET("anchor_earning = #{record.anchorEarning,jdbcType=BIGINT}");
        }
        
        if (record.getAnchorCommission() != null) {
            sql.SET("anchor_commission = #{record.anchorCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelData() != null) {
            sql.SET("channel_data = #{record.channelData,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getShopTags() != null) {
            sql.SET("shop_tags = #{record.shopTags,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getActivityTags() != null) {
            sql.SET("activity_tags = #{record.activityTags,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getWholeSaleDiscounts() != null) {
            sql.SET("whole_sale_discounts = #{record.wholeSaleDiscounts,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getBigPromotionPriceInfo() != null) {
            sql.SET("big_promotion_price_info = #{record.bigPromotionPriceInfo,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getAdvanceSaleInfo() != null) {
            sql.SET("advance_sale_info = #{record.advanceSaleInfo,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getEmbedding() != null) {
            sql.SET("embedding = #{record.embedding,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("goods_index_data");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        sql.SET("long_title = #{record.longTitle,jdbcType=VARCHAR}");
        sql.SET("short_title = #{record.shortTitle,jdbcType=VARCHAR}");
        sql.SET("channel = #{record.channel,jdbcType=TINYINT}");
        sql.SET("original_channel = #{record.originalChannel,jdbcType=TINYINT}");
        sql.SET("shelf = #{record.shelf,jdbcType=TINYINT}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("item_type = #{record.itemType,jdbcType=TINYINT}");
        sql.SET("item_sub_type = #{record.itemSubType,jdbcType=TINYINT}");
        sql.SET("first_shelf_time = #{record.firstShelfTime,jdbcType=BIGINT}");
        sql.SET("item_create_time = #{record.itemCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("item_deliver_area_type = #{record.itemDeliverAreaType,jdbcType=BIT}");
        sql.SET("white_image_url = #{record.whiteImageUrl,jdbcType=VARCHAR}");
        sql.SET("white_image_width = #{record.whiteImageWidth,jdbcType=INTEGER}");
        sql.SET("white_image_height = #{record.whiteImageHeight,jdbcType=INTEGER}");
        sql.SET("major_image_url = #{record.majorImageUrl,jdbcType=VARCHAR}");
        sql.SET("major_image_width = #{record.majorImageWidth,jdbcType=INTEGER}");
        sql.SET("major_image_height = #{record.majorImageHeight,jdbcType=INTEGER}");
        sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        sql.SET("brand_cn_name = #{record.brandCnName,jdbcType=VARCHAR}");
        sql.SET("brand_en_name = #{record.brandEnName,jdbcType=VARCHAR}");
        sql.SET("brand_state_id = #{record.brandStateId,jdbcType=INTEGER}");
        sql.SET("brand_state_name = #{record.brandStateName,jdbcType=VARCHAR}");
        sql.SET("brand_country_flag_url = #{record.brandCountryFlagUrl,jdbcType=VARCHAR}");
        sql.SET("category_id = #{record.categoryId,jdbcType=INTEGER}");
        sql.SET("category_id_path = #{record.categoryIdPath,jdbcType=VARCHAR}");
        sql.SET("category_name = #{record.categoryName,jdbcType=VARCHAR}");
        sql.SET("category_path_name = #{record.categoryPathName,jdbcType=VARCHAR}");
        sql.SET("search_tags = #{record.searchTags,jdbcType=VARCHAR}");
        sql.SET("goods_tags = #{record.goodsTags,jdbcType=VARCHAR}");
        sql.SET("goods_properties = #{record.goodsProperties,jdbcType=VARCHAR}");
        sql.SET("shop_id = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("shop_name = #{record.shopName,jdbcType=VARCHAR}");
        sql.SET("shop_class_id = #{record.shopClassId,jdbcType=VARCHAR}");
        sql.SET("shop_type = #{record.shopType,jdbcType=BIT}");
        sql.SET("registration_address_type = #{record.registrationAddressType,jdbcType=BIT}");
        sql.SET("shop_level = #{record.shopLevel,jdbcType=BIT}");
        sql.SET("shop_major_category_ids = #{record.shopMajorCategoryIds,jdbcType=VARCHAR}");
        sql.SET("shop_gmv_30 = #{record.shopGmv30,jdbcType=DECIMAL}");
        sql.SET("shop_gmv_90 = #{record.shopGmv90,jdbcType=DECIMAL}");
        sql.SET("shop_aftersale_rate_30 = #{record.shopAftersaleRate30,jdbcType=DECIMAL}");
        sql.SET("shop_open_days = #{record.shopOpenDays,jdbcType=INTEGER}");
        sql.SET("shop_dsr = #{record.shopDsr,jdbcType=DECIMAL}");
        sql.SET("shop_30_days_sales_volume = #{record.shop30DaysSalesVolume,jdbcType=BIGINT}");
        sql.SET("activity_ids = #{record.activityIds,jdbcType=VARCHAR}");
        sql.SET("activity_blacklist = #{record.activityBlacklist,jdbcType=VARCHAR}");
        sql.SET("shop_activity_info = #{record.shopActivityInfo,jdbcType=VARCHAR}");
        sql.SET("shop_warm_activity_info = #{record.shopWarmActivityInfo,jdbcType=VARCHAR}");
        sql.SET("shop_part_activity_ids = #{record.shopPartActivityIds,jdbcType=VARCHAR}");
        sql.SET("shop_invest_part_activity_ids = #{record.shopInvestPartActivityIds,jdbcType=VARCHAR}");
        sql.SET("shop_invest_activity_ids = #{record.shopInvestActivityIds,jdbcType=VARCHAR}");
        sql.SET("cross_shop_activity_ids = #{record.crossShopActivityIds,jdbcType=VARCHAR}");
        sql.SET("cross_shop_activity_info = #{record.crossShopActivityInfo,jdbcType=VARCHAR}");
        sql.SET("allowance_activity_ids = #{record.allowanceActivityIds,jdbcType=VARCHAR}");
        sql.SET("original_price = #{record.originalPrice,jdbcType=BIGINT}");
        sql.SET("price = #{record.price,jdbcType=BIGINT}");
        sql.SET("big_promotion_price = #{record.bigPromotionPrice,jdbcType=BIGINT}");
        sql.SET("daily_price = #{record.dailyPrice,jdbcType=BIGINT}");
        sql.SET("vip_price = #{record.vipPrice,jdbcType=BIGINT}");
        sql.SET("big_promotion_vip_price = #{record.bigPromotionVipPrice,jdbcType=BIGINT}");
        sql.SET("daily_vip_price = #{record.dailyVipPrice,jdbcType=BIGINT}");
        sql.SET("market_price = #{record.marketPrice,jdbcType=INTEGER}");
        sql.SET("commission_total = #{record.commissionTotal,jdbcType=BIGINT}");
        sql.SET("commission = #{record.commission,jdbcType=BIGINT}");
        sql.SET("brokerage = #{record.brokerage,jdbcType=DECIMAL}");
        sql.SET("lowest_price_last_7_days = #{record.lowestPriceLast7Days,jdbcType=BIGINT}");
        sql.SET("lowest_price_last_15_days = #{record.lowestPriceLast15Days,jdbcType=BIGINT}");
        sql.SET("lowest_price_last_30_days = #{record.lowestPriceLast30Days,jdbcType=BIGINT}");
        sql.SET("in_big_promotion = #{record.inBigPromotion,jdbcType=TINYINT}");
        sql.SET("goods_7_days_sales_volume = #{record.goods7DaysSalesVolume,jdbcType=BIGINT}");
        sql.SET("goods_30_days_sales_volume = #{record.goods30DaysSalesVolume,jdbcType=BIGINT}");
        sql.SET("goods_60_days_sales_volume = #{record.goods60DaysSalesVolume,jdbcType=BIGINT}");
        sql.SET("goods_gmv_7 = #{record.goodsGmv7,jdbcType=DECIMAL}");
        sql.SET("goods_gmv_30 = #{record.goodsGmv30,jdbcType=DECIMAL}");
        sql.SET("goods_gmv_60 = #{record.goodsGmv60,jdbcType=DECIMAL}");
        sql.SET("goods_dsr = #{record.goodsDsr,jdbcType=DECIMAL}");
        sql.SET("click_conver_rate_30 = #{record.clickConverRate30,jdbcType=DECIMAL}");
        sql.SET("purchase_conver_rate_30 = #{record.purchaseConverRate30,jdbcType=DECIMAL}");
        sql.SET("pay_conver_rate_30 = #{record.payConverRate30,jdbcType=DECIMAL}");
        sql.SET("reputation_rate = #{record.reputationRate,jdbcType=DECIMAL}");
        sql.SET("reputation_rate30 = #{record.reputationRate30,jdbcType=DECIMAL}");
        sql.SET("buyer_number = #{record.buyerNumber,jdbcType=BIGINT}");
        sql.SET("score = #{record.score,jdbcType=DECIMAL}");
        sql.SET("weight = #{record.weight,jdbcType=INTEGER}");
        sql.SET("prediction_score = #{record.predictionScore,jdbcType=DOUBLE}");
        sql.SET("item_score = #{record.itemScore,jdbcType=DOUBLE}");
        sql.SET("in_black_list = #{record.inBlackList,jdbcType=BIT}");
        sql.SET("in_stock = #{record.inStock,jdbcType=BIT}");
        sql.SET("in_feed = #{record.inFeed,jdbcType=TINYINT}");
        sql.SET("sku_num = #{record.skuNum,jdbcType=SMALLINT}");
        sql.SET("deleted = #{record.deleted,jdbcType=BIT}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("anchor_earning = #{record.anchorEarning,jdbcType=BIGINT}");
        sql.SET("anchor_commission = #{record.anchorCommission,jdbcType=DECIMAL}");
        sql.SET("channel_data = #{record.channelData,jdbcType=LONGVARCHAR}");
        sql.SET("shop_tags = #{record.shopTags,jdbcType=LONGVARCHAR}");
        sql.SET("activity_tags = #{record.activityTags,jdbcType=LONGVARCHAR}");
        sql.SET("whole_sale_discounts = #{record.wholeSaleDiscounts,jdbcType=LONGVARCHAR}");
        sql.SET("big_promotion_price_info = #{record.bigPromotionPriceInfo,jdbcType=LONGVARCHAR}");
        sql.SET("advance_sale_info = #{record.advanceSaleInfo,jdbcType=LONGVARCHAR}");
        sql.SET("embedding = #{record.embedding,jdbcType=LONGVARCHAR}");
        
        GoodsIndexDataExample example = (GoodsIndexDataExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("goods_index_data");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        sql.SET("long_title = #{record.longTitle,jdbcType=VARCHAR}");
        sql.SET("short_title = #{record.shortTitle,jdbcType=VARCHAR}");
        sql.SET("channel = #{record.channel,jdbcType=TINYINT}");
        sql.SET("original_channel = #{record.originalChannel,jdbcType=TINYINT}");
        sql.SET("shelf = #{record.shelf,jdbcType=TINYINT}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("item_type = #{record.itemType,jdbcType=TINYINT}");
        sql.SET("item_sub_type = #{record.itemSubType,jdbcType=TINYINT}");
        sql.SET("first_shelf_time = #{record.firstShelfTime,jdbcType=BIGINT}");
        sql.SET("item_create_time = #{record.itemCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("item_deliver_area_type = #{record.itemDeliverAreaType,jdbcType=BIT}");
        sql.SET("white_image_url = #{record.whiteImageUrl,jdbcType=VARCHAR}");
        sql.SET("white_image_width = #{record.whiteImageWidth,jdbcType=INTEGER}");
        sql.SET("white_image_height = #{record.whiteImageHeight,jdbcType=INTEGER}");
        sql.SET("major_image_url = #{record.majorImageUrl,jdbcType=VARCHAR}");
        sql.SET("major_image_width = #{record.majorImageWidth,jdbcType=INTEGER}");
        sql.SET("major_image_height = #{record.majorImageHeight,jdbcType=INTEGER}");
        sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        sql.SET("brand_cn_name = #{record.brandCnName,jdbcType=VARCHAR}");
        sql.SET("brand_en_name = #{record.brandEnName,jdbcType=VARCHAR}");
        sql.SET("brand_state_id = #{record.brandStateId,jdbcType=INTEGER}");
        sql.SET("brand_state_name = #{record.brandStateName,jdbcType=VARCHAR}");
        sql.SET("brand_country_flag_url = #{record.brandCountryFlagUrl,jdbcType=VARCHAR}");
        sql.SET("category_id = #{record.categoryId,jdbcType=INTEGER}");
        sql.SET("category_id_path = #{record.categoryIdPath,jdbcType=VARCHAR}");
        sql.SET("category_name = #{record.categoryName,jdbcType=VARCHAR}");
        sql.SET("category_path_name = #{record.categoryPathName,jdbcType=VARCHAR}");
        sql.SET("search_tags = #{record.searchTags,jdbcType=VARCHAR}");
        sql.SET("goods_tags = #{record.goodsTags,jdbcType=VARCHAR}");
        sql.SET("goods_properties = #{record.goodsProperties,jdbcType=VARCHAR}");
        sql.SET("shop_id = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("shop_name = #{record.shopName,jdbcType=VARCHAR}");
        sql.SET("shop_class_id = #{record.shopClassId,jdbcType=VARCHAR}");
        sql.SET("shop_type = #{record.shopType,jdbcType=BIT}");
        sql.SET("registration_address_type = #{record.registrationAddressType,jdbcType=BIT}");
        sql.SET("shop_level = #{record.shopLevel,jdbcType=BIT}");
        sql.SET("shop_major_category_ids = #{record.shopMajorCategoryIds,jdbcType=VARCHAR}");
        sql.SET("shop_gmv_30 = #{record.shopGmv30,jdbcType=DECIMAL}");
        sql.SET("shop_gmv_90 = #{record.shopGmv90,jdbcType=DECIMAL}");
        sql.SET("shop_aftersale_rate_30 = #{record.shopAftersaleRate30,jdbcType=DECIMAL}");
        sql.SET("shop_open_days = #{record.shopOpenDays,jdbcType=INTEGER}");
        sql.SET("shop_dsr = #{record.shopDsr,jdbcType=DECIMAL}");
        sql.SET("shop_30_days_sales_volume = #{record.shop30DaysSalesVolume,jdbcType=BIGINT}");
        sql.SET("activity_ids = #{record.activityIds,jdbcType=VARCHAR}");
        sql.SET("activity_blacklist = #{record.activityBlacklist,jdbcType=VARCHAR}");
        sql.SET("shop_activity_info = #{record.shopActivityInfo,jdbcType=VARCHAR}");
        sql.SET("shop_warm_activity_info = #{record.shopWarmActivityInfo,jdbcType=VARCHAR}");
        sql.SET("shop_part_activity_ids = #{record.shopPartActivityIds,jdbcType=VARCHAR}");
        sql.SET("shop_invest_part_activity_ids = #{record.shopInvestPartActivityIds,jdbcType=VARCHAR}");
        sql.SET("shop_invest_activity_ids = #{record.shopInvestActivityIds,jdbcType=VARCHAR}");
        sql.SET("cross_shop_activity_ids = #{record.crossShopActivityIds,jdbcType=VARCHAR}");
        sql.SET("cross_shop_activity_info = #{record.crossShopActivityInfo,jdbcType=VARCHAR}");
        sql.SET("allowance_activity_ids = #{record.allowanceActivityIds,jdbcType=VARCHAR}");
        sql.SET("original_price = #{record.originalPrice,jdbcType=BIGINT}");
        sql.SET("price = #{record.price,jdbcType=BIGINT}");
        sql.SET("big_promotion_price = #{record.bigPromotionPrice,jdbcType=BIGINT}");
        sql.SET("daily_price = #{record.dailyPrice,jdbcType=BIGINT}");
        sql.SET("vip_price = #{record.vipPrice,jdbcType=BIGINT}");
        sql.SET("big_promotion_vip_price = #{record.bigPromotionVipPrice,jdbcType=BIGINT}");
        sql.SET("daily_vip_price = #{record.dailyVipPrice,jdbcType=BIGINT}");
        sql.SET("market_price = #{record.marketPrice,jdbcType=INTEGER}");
        sql.SET("commission_total = #{record.commissionTotal,jdbcType=BIGINT}");
        sql.SET("commission = #{record.commission,jdbcType=BIGINT}");
        sql.SET("brokerage = #{record.brokerage,jdbcType=DECIMAL}");
        sql.SET("lowest_price_last_7_days = #{record.lowestPriceLast7Days,jdbcType=BIGINT}");
        sql.SET("lowest_price_last_15_days = #{record.lowestPriceLast15Days,jdbcType=BIGINT}");
        sql.SET("lowest_price_last_30_days = #{record.lowestPriceLast30Days,jdbcType=BIGINT}");
        sql.SET("in_big_promotion = #{record.inBigPromotion,jdbcType=TINYINT}");
        sql.SET("goods_7_days_sales_volume = #{record.goods7DaysSalesVolume,jdbcType=BIGINT}");
        sql.SET("goods_30_days_sales_volume = #{record.goods30DaysSalesVolume,jdbcType=BIGINT}");
        sql.SET("goods_60_days_sales_volume = #{record.goods60DaysSalesVolume,jdbcType=BIGINT}");
        sql.SET("goods_gmv_7 = #{record.goodsGmv7,jdbcType=DECIMAL}");
        sql.SET("goods_gmv_30 = #{record.goodsGmv30,jdbcType=DECIMAL}");
        sql.SET("goods_gmv_60 = #{record.goodsGmv60,jdbcType=DECIMAL}");
        sql.SET("goods_dsr = #{record.goodsDsr,jdbcType=DECIMAL}");
        sql.SET("click_conver_rate_30 = #{record.clickConverRate30,jdbcType=DECIMAL}");
        sql.SET("purchase_conver_rate_30 = #{record.purchaseConverRate30,jdbcType=DECIMAL}");
        sql.SET("pay_conver_rate_30 = #{record.payConverRate30,jdbcType=DECIMAL}");
        sql.SET("reputation_rate = #{record.reputationRate,jdbcType=DECIMAL}");
        sql.SET("reputation_rate30 = #{record.reputationRate30,jdbcType=DECIMAL}");
        sql.SET("buyer_number = #{record.buyerNumber,jdbcType=BIGINT}");
        sql.SET("score = #{record.score,jdbcType=DECIMAL}");
        sql.SET("weight = #{record.weight,jdbcType=INTEGER}");
        sql.SET("prediction_score = #{record.predictionScore,jdbcType=DOUBLE}");
        sql.SET("item_score = #{record.itemScore,jdbcType=DOUBLE}");
        sql.SET("in_black_list = #{record.inBlackList,jdbcType=BIT}");
        sql.SET("in_stock = #{record.inStock,jdbcType=BIT}");
        sql.SET("in_feed = #{record.inFeed,jdbcType=TINYINT}");
        sql.SET("sku_num = #{record.skuNum,jdbcType=SMALLINT}");
        sql.SET("deleted = #{record.deleted,jdbcType=BIT}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("anchor_earning = #{record.anchorEarning,jdbcType=BIGINT}");
        sql.SET("anchor_commission = #{record.anchorCommission,jdbcType=DECIMAL}");
        
        GoodsIndexDataExample example = (GoodsIndexDataExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GoodsIndexDataWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("goods_index_data");
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{itemId,jdbcType=BIGINT}");
        }
        
        if (record.getLongTitle() != null) {
            sql.SET("long_title = #{longTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getShortTitle() != null) {
            sql.SET("short_title = #{shortTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{channel,jdbcType=TINYINT}");
        }
        
        if (record.getOriginalChannel() != null) {
            sql.SET("original_channel = #{originalChannel,jdbcType=TINYINT}");
        }
        
        if (record.getShelf() != null) {
            sql.SET("shelf = #{shelf,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getItemType() != null) {
            sql.SET("item_type = #{itemType,jdbcType=TINYINT}");
        }
        
        if (record.getItemSubType() != null) {
            sql.SET("item_sub_type = #{itemSubType,jdbcType=TINYINT}");
        }
        
        if (record.getFirstShelfTime() != null) {
            sql.SET("first_shelf_time = #{firstShelfTime,jdbcType=BIGINT}");
        }
        
        if (record.getItemCreateTime() != null) {
            sql.SET("item_create_time = #{itemCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getItemDeliverAreaType() != null) {
            sql.SET("item_deliver_area_type = #{itemDeliverAreaType,jdbcType=BIT}");
        }
        
        if (record.getWhiteImageUrl() != null) {
            sql.SET("white_image_url = #{whiteImageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getWhiteImageWidth() != null) {
            sql.SET("white_image_width = #{whiteImageWidth,jdbcType=INTEGER}");
        }
        
        if (record.getWhiteImageHeight() != null) {
            sql.SET("white_image_height = #{whiteImageHeight,jdbcType=INTEGER}");
        }
        
        if (record.getMajorImageUrl() != null) {
            sql.SET("major_image_url = #{majorImageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorImageWidth() != null) {
            sql.SET("major_image_width = #{majorImageWidth,jdbcType=INTEGER}");
        }
        
        if (record.getMajorImageHeight() != null) {
            sql.SET("major_image_height = #{majorImageHeight,jdbcType=INTEGER}");
        }
        
        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{brandId,jdbcType=INTEGER}");
        }
        
        if (record.getBrandCnName() != null) {
            sql.SET("brand_cn_name = #{brandCnName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandEnName() != null) {
            sql.SET("brand_en_name = #{brandEnName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandStateId() != null) {
            sql.SET("brand_state_id = #{brandStateId,jdbcType=INTEGER}");
        }
        
        if (record.getBrandStateName() != null) {
            sql.SET("brand_state_name = #{brandStateName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandCountryFlagUrl() != null) {
            sql.SET("brand_country_flag_url = #{brandCountryFlagUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryId() != null) {
            sql.SET("category_id = #{categoryId,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryIdPath() != null) {
            sql.SET("category_id_path = #{categoryIdPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryName() != null) {
            sql.SET("category_name = #{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPathName() != null) {
            sql.SET("category_path_name = #{categoryPathName,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchTags() != null) {
            sql.SET("search_tags = #{searchTags,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsTags() != null) {
            sql.SET("goods_tags = #{goodsTags,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsProperties() != null) {
            sql.SET("goods_properties = #{goodsProperties,jdbcType=VARCHAR}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getShopName() != null) {
            sql.SET("shop_name = #{shopName,jdbcType=VARCHAR}");
        }
        
        if (record.getShopClassId() != null) {
            sql.SET("shop_class_id = #{shopClassId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopType() != null) {
            sql.SET("shop_type = #{shopType,jdbcType=BIT}");
        }
        
        if (record.getRegistrationAddressType() != null) {
            sql.SET("registration_address_type = #{registrationAddressType,jdbcType=BIT}");
        }
        
        if (record.getShopLevel() != null) {
            sql.SET("shop_level = #{shopLevel,jdbcType=BIT}");
        }
        
        if (record.getShopMajorCategoryIds() != null) {
            sql.SET("shop_major_category_ids = #{shopMajorCategoryIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopGmv30() != null) {
            sql.SET("shop_gmv_30 = #{shopGmv30,jdbcType=DECIMAL}");
        }
        
        if (record.getShopGmv90() != null) {
            sql.SET("shop_gmv_90 = #{shopGmv90,jdbcType=DECIMAL}");
        }
        
        if (record.getShopAftersaleRate30() != null) {
            sql.SET("shop_aftersale_rate_30 = #{shopAftersaleRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getShopOpenDays() != null) {
            sql.SET("shop_open_days = #{shopOpenDays,jdbcType=INTEGER}");
        }
        
        if (record.getShopDsr() != null) {
            sql.SET("shop_dsr = #{shopDsr,jdbcType=DECIMAL}");
        }
        
        if (record.getShop30DaysSalesVolume() != null) {
            sql.SET("shop_30_days_sales_volume = #{shop30DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getActivityIds() != null) {
            sql.SET("activity_ids = #{activityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityBlacklist() != null) {
            sql.SET("activity_blacklist = #{activityBlacklist,jdbcType=VARCHAR}");
        }
        
        if (record.getShopActivityInfo() != null) {
            sql.SET("shop_activity_info = #{shopActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopWarmActivityInfo() != null) {
            sql.SET("shop_warm_activity_info = #{shopWarmActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopPartActivityIds() != null) {
            sql.SET("shop_part_activity_ids = #{shopPartActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopInvestPartActivityIds() != null) {
            sql.SET("shop_invest_part_activity_ids = #{shopInvestPartActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getShopInvestActivityIds() != null) {
            sql.SET("shop_invest_activity_ids = #{shopInvestActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getCrossShopActivityIds() != null) {
            sql.SET("cross_shop_activity_ids = #{crossShopActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getCrossShopActivityInfo() != null) {
            sql.SET("cross_shop_activity_info = #{crossShopActivityInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getAllowanceActivityIds() != null) {
            sql.SET("allowance_activity_ids = #{allowanceActivityIds,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginalPrice() != null) {
            sql.SET("original_price = #{originalPrice,jdbcType=BIGINT}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=BIGINT}");
        }
        
        if (record.getBigPromotionPrice() != null) {
            sql.SET("big_promotion_price = #{bigPromotionPrice,jdbcType=BIGINT}");
        }
        
        if (record.getDailyPrice() != null) {
            sql.SET("daily_price = #{dailyPrice,jdbcType=BIGINT}");
        }
        
        if (record.getVipPrice() != null) {
            sql.SET("vip_price = #{vipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getBigPromotionVipPrice() != null) {
            sql.SET("big_promotion_vip_price = #{bigPromotionVipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getDailyVipPrice() != null) {
            sql.SET("daily_vip_price = #{dailyVipPrice,jdbcType=BIGINT}");
        }
        
        if (record.getMarketPrice() != null) {
            sql.SET("market_price = #{marketPrice,jdbcType=INTEGER}");
        }
        
        if (record.getCommissionTotal() != null) {
            sql.SET("commission_total = #{commissionTotal,jdbcType=BIGINT}");
        }
        
        if (record.getCommission() != null) {
            sql.SET("commission = #{commission,jdbcType=BIGINT}");
        }
        
        if (record.getBrokerage() != null) {
            sql.SET("brokerage = #{brokerage,jdbcType=DECIMAL}");
        }
        
        if (record.getLowestPriceLast7Days() != null) {
            sql.SET("lowest_price_last_7_days = #{lowestPriceLast7Days,jdbcType=BIGINT}");
        }
        
        if (record.getLowestPriceLast15Days() != null) {
            sql.SET("lowest_price_last_15_days = #{lowestPriceLast15Days,jdbcType=BIGINT}");
        }
        
        if (record.getLowestPriceLast30Days() != null) {
            sql.SET("lowest_price_last_30_days = #{lowestPriceLast30Days,jdbcType=BIGINT}");
        }
        
        if (record.getInBigPromotion() != null) {
            sql.SET("in_big_promotion = #{inBigPromotion,jdbcType=TINYINT}");
        }
        
        if (record.getGoods7DaysSalesVolume() != null) {
            sql.SET("goods_7_days_sales_volume = #{goods7DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoods30DaysSalesVolume() != null) {
            sql.SET("goods_30_days_sales_volume = #{goods30DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoods60DaysSalesVolume() != null) {
            sql.SET("goods_60_days_sales_volume = #{goods60DaysSalesVolume,jdbcType=BIGINT}");
        }
        
        if (record.getGoodsGmv7() != null) {
            sql.SET("goods_gmv_7 = #{goodsGmv7,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsGmv30() != null) {
            sql.SET("goods_gmv_30 = #{goodsGmv30,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsGmv60() != null) {
            sql.SET("goods_gmv_60 = #{goodsGmv60,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsDsr() != null) {
            sql.SET("goods_dsr = #{goodsDsr,jdbcType=DECIMAL}");
        }
        
        if (record.getClickConverRate30() != null) {
            sql.SET("click_conver_rate_30 = #{clickConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getPurchaseConverRate30() != null) {
            sql.SET("purchase_conver_rate_30 = #{purchaseConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getPayConverRate30() != null) {
            sql.SET("pay_conver_rate_30 = #{payConverRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getReputationRate() != null) {
            sql.SET("reputation_rate = #{reputationRate,jdbcType=DECIMAL}");
        }
        
        if (record.getReputationRate30() != null) {
            sql.SET("reputation_rate30 = #{reputationRate30,jdbcType=DECIMAL}");
        }
        
        if (record.getBuyerNumber() != null) {
            sql.SET("buyer_number = #{buyerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=DECIMAL}");
        }
        
        if (record.getWeight() != null) {
            sql.SET("weight = #{weight,jdbcType=INTEGER}");
        }
        
        if (record.getPredictionScore() != null) {
            sql.SET("prediction_score = #{predictionScore,jdbcType=DOUBLE}");
        }
        
        if (record.getItemScore() != null) {
            sql.SET("item_score = #{itemScore,jdbcType=DOUBLE}");
        }
        
        if (record.getInBlackList() != null) {
            sql.SET("in_black_list = #{inBlackList,jdbcType=BIT}");
        }
        
        if (record.getInStock() != null) {
            sql.SET("in_stock = #{inStock,jdbcType=BIT}");
        }
        
        if (record.getInFeed() != null) {
            sql.SET("in_feed = #{inFeed,jdbcType=TINYINT}");
        }
        
        if (record.getSkuNum() != null) {
            sql.SET("sku_num = #{skuNum,jdbcType=SMALLINT}");
        }
        
        if (record.getDeleted() != null) {
            sql.SET("deleted = #{deleted,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnchorEarning() != null) {
            sql.SET("anchor_earning = #{anchorEarning,jdbcType=BIGINT}");
        }
        
        if (record.getAnchorCommission() != null) {
            sql.SET("anchor_commission = #{anchorCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelData() != null) {
            sql.SET("channel_data = #{channelData,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getShopTags() != null) {
            sql.SET("shop_tags = #{shopTags,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getActivityTags() != null) {
            sql.SET("activity_tags = #{activityTags,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getWholeSaleDiscounts() != null) {
            sql.SET("whole_sale_discounts = #{wholeSaleDiscounts,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getBigPromotionPriceInfo() != null) {
            sql.SET("big_promotion_price_info = #{bigPromotionPriceInfo,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getAdvanceSaleInfo() != null) {
            sql.SET("advance_sale_info = #{advanceSaleInfo,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getEmbedding() != null) {
            sql.SET("embedding = #{embedding,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, GoodsIndexDataExample example, boolean includeExamplePhrase) {
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