package com.muyi.bigMonster.model.daily3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsIndexDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsIndexDataExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andLongTitleIsNull() {
            addCriterion("long_title is null");
            return (Criteria) this;
        }

        public Criteria andLongTitleIsNotNull() {
            addCriterion("long_title is not null");
            return (Criteria) this;
        }

        public Criteria andLongTitleEqualTo(String value) {
            addCriterion("long_title =", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotEqualTo(String value) {
            addCriterion("long_title <>", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleGreaterThan(String value) {
            addCriterion("long_title >", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleGreaterThanOrEqualTo(String value) {
            addCriterion("long_title >=", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLessThan(String value) {
            addCriterion("long_title <", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLessThanOrEqualTo(String value) {
            addCriterion("long_title <=", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLike(String value) {
            addCriterion("long_title like", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotLike(String value) {
            addCriterion("long_title not like", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleIn(List<String> values) {
            addCriterion("long_title in", values, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotIn(List<String> values) {
            addCriterion("long_title not in", values, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleBetween(String value1, String value2) {
            addCriterion("long_title between", value1, value2, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotBetween(String value1, String value2) {
            addCriterion("long_title not between", value1, value2, "longTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNull() {
            addCriterion("short_title is null");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNotNull() {
            addCriterion("short_title is not null");
            return (Criteria) this;
        }

        public Criteria andShortTitleEqualTo(String value) {
            addCriterion("short_title =", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotEqualTo(String value) {
            addCriterion("short_title <>", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThan(String value) {
            addCriterion("short_title >", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThanOrEqualTo(String value) {
            addCriterion("short_title >=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThan(String value) {
            addCriterion("short_title <", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThanOrEqualTo(String value) {
            addCriterion("short_title <=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLike(String value) {
            addCriterion("short_title like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotLike(String value) {
            addCriterion("short_title not like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleIn(List<String> values) {
            addCriterion("short_title in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotIn(List<String> values) {
            addCriterion("short_title not in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleBetween(String value1, String value2) {
            addCriterion("short_title between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotBetween(String value1, String value2) {
            addCriterion("short_title not between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Byte value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Byte value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Byte value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Byte value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Byte value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Byte> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Byte> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Byte value1, Byte value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelIsNull() {
            addCriterion("original_channel is null");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelIsNotNull() {
            addCriterion("original_channel is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelEqualTo(Byte value) {
            addCriterion("original_channel =", value, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelNotEqualTo(Byte value) {
            addCriterion("original_channel <>", value, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelGreaterThan(Byte value) {
            addCriterion("original_channel >", value, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("original_channel >=", value, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelLessThan(Byte value) {
            addCriterion("original_channel <", value, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelLessThanOrEqualTo(Byte value) {
            addCriterion("original_channel <=", value, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelIn(List<Byte> values) {
            addCriterion("original_channel in", values, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelNotIn(List<Byte> values) {
            addCriterion("original_channel not in", values, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelBetween(Byte value1, Byte value2) {
            addCriterion("original_channel between", value1, value2, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andOriginalChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("original_channel not between", value1, value2, "originalChannel");
            return (Criteria) this;
        }

        public Criteria andShelfIsNull() {
            addCriterion("shelf is null");
            return (Criteria) this;
        }

        public Criteria andShelfIsNotNull() {
            addCriterion("shelf is not null");
            return (Criteria) this;
        }

        public Criteria andShelfEqualTo(Byte value) {
            addCriterion("shelf =", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfNotEqualTo(Byte value) {
            addCriterion("shelf <>", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfGreaterThan(Byte value) {
            addCriterion("shelf >", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfGreaterThanOrEqualTo(Byte value) {
            addCriterion("shelf >=", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfLessThan(Byte value) {
            addCriterion("shelf <", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfLessThanOrEqualTo(Byte value) {
            addCriterion("shelf <=", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfIn(List<Byte> values) {
            addCriterion("shelf in", values, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfNotIn(List<Byte> values) {
            addCriterion("shelf not in", values, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfBetween(Byte value1, Byte value2) {
            addCriterion("shelf between", value1, value2, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfNotBetween(Byte value1, Byte value2) {
            addCriterion("shelf not between", value1, value2, "shelf");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Byte value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Byte value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Byte value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Byte value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Byte value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Byte> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Byte> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Byte value1, Byte value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeIsNull() {
            addCriterion("item_sub_type is null");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeIsNotNull() {
            addCriterion("item_sub_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeEqualTo(Byte value) {
            addCriterion("item_sub_type =", value, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeNotEqualTo(Byte value) {
            addCriterion("item_sub_type <>", value, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeGreaterThan(Byte value) {
            addCriterion("item_sub_type >", value, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("item_sub_type >=", value, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeLessThan(Byte value) {
            addCriterion("item_sub_type <", value, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeLessThanOrEqualTo(Byte value) {
            addCriterion("item_sub_type <=", value, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeIn(List<Byte> values) {
            addCriterion("item_sub_type in", values, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeNotIn(List<Byte> values) {
            addCriterion("item_sub_type not in", values, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeBetween(Byte value1, Byte value2) {
            addCriterion("item_sub_type between", value1, value2, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andItemSubTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("item_sub_type not between", value1, value2, "itemSubType");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeIsNull() {
            addCriterion("first_shelf_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeIsNotNull() {
            addCriterion("first_shelf_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeEqualTo(Long value) {
            addCriterion("first_shelf_time =", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeNotEqualTo(Long value) {
            addCriterion("first_shelf_time <>", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeGreaterThan(Long value) {
            addCriterion("first_shelf_time >", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("first_shelf_time >=", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeLessThan(Long value) {
            addCriterion("first_shelf_time <", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeLessThanOrEqualTo(Long value) {
            addCriterion("first_shelf_time <=", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeIn(List<Long> values) {
            addCriterion("first_shelf_time in", values, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeNotIn(List<Long> values) {
            addCriterion("first_shelf_time not in", values, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeBetween(Long value1, Long value2) {
            addCriterion("first_shelf_time between", value1, value2, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeNotBetween(Long value1, Long value2) {
            addCriterion("first_shelf_time not between", value1, value2, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeIsNull() {
            addCriterion("item_create_time is null");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeIsNotNull() {
            addCriterion("item_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeEqualTo(Date value) {
            addCriterion("item_create_time =", value, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeNotEqualTo(Date value) {
            addCriterion("item_create_time <>", value, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeGreaterThan(Date value) {
            addCriterion("item_create_time >", value, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("item_create_time >=", value, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeLessThan(Date value) {
            addCriterion("item_create_time <", value, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("item_create_time <=", value, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeIn(List<Date> values) {
            addCriterion("item_create_time in", values, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeNotIn(List<Date> values) {
            addCriterion("item_create_time not in", values, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeBetween(Date value1, Date value2) {
            addCriterion("item_create_time between", value1, value2, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("item_create_time not between", value1, value2, "itemCreateTime");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeIsNull() {
            addCriterion("item_deliver_area_type is null");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeIsNotNull() {
            addCriterion("item_deliver_area_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeEqualTo(Boolean value) {
            addCriterion("item_deliver_area_type =", value, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeNotEqualTo(Boolean value) {
            addCriterion("item_deliver_area_type <>", value, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeGreaterThan(Boolean value) {
            addCriterion("item_deliver_area_type >", value, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("item_deliver_area_type >=", value, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeLessThan(Boolean value) {
            addCriterion("item_deliver_area_type <", value, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("item_deliver_area_type <=", value, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeIn(List<Boolean> values) {
            addCriterion("item_deliver_area_type in", values, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeNotIn(List<Boolean> values) {
            addCriterion("item_deliver_area_type not in", values, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("item_deliver_area_type between", value1, value2, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andItemDeliverAreaTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("item_deliver_area_type not between", value1, value2, "itemDeliverAreaType");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlIsNull() {
            addCriterion("white_image_url is null");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlIsNotNull() {
            addCriterion("white_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlEqualTo(String value) {
            addCriterion("white_image_url =", value, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlNotEqualTo(String value) {
            addCriterion("white_image_url <>", value, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlGreaterThan(String value) {
            addCriterion("white_image_url >", value, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("white_image_url >=", value, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlLessThan(String value) {
            addCriterion("white_image_url <", value, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlLessThanOrEqualTo(String value) {
            addCriterion("white_image_url <=", value, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlLike(String value) {
            addCriterion("white_image_url like", value, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlNotLike(String value) {
            addCriterion("white_image_url not like", value, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlIn(List<String> values) {
            addCriterion("white_image_url in", values, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlNotIn(List<String> values) {
            addCriterion("white_image_url not in", values, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlBetween(String value1, String value2) {
            addCriterion("white_image_url between", value1, value2, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageUrlNotBetween(String value1, String value2) {
            addCriterion("white_image_url not between", value1, value2, "whiteImageUrl");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthIsNull() {
            addCriterion("white_image_width is null");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthIsNotNull() {
            addCriterion("white_image_width is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthEqualTo(Integer value) {
            addCriterion("white_image_width =", value, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthNotEqualTo(Integer value) {
            addCriterion("white_image_width <>", value, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthGreaterThan(Integer value) {
            addCriterion("white_image_width >", value, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("white_image_width >=", value, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthLessThan(Integer value) {
            addCriterion("white_image_width <", value, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthLessThanOrEqualTo(Integer value) {
            addCriterion("white_image_width <=", value, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthIn(List<Integer> values) {
            addCriterion("white_image_width in", values, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthNotIn(List<Integer> values) {
            addCriterion("white_image_width not in", values, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthBetween(Integer value1, Integer value2) {
            addCriterion("white_image_width between", value1, value2, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("white_image_width not between", value1, value2, "whiteImageWidth");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightIsNull() {
            addCriterion("white_image_height is null");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightIsNotNull() {
            addCriterion("white_image_height is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightEqualTo(Integer value) {
            addCriterion("white_image_height =", value, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightNotEqualTo(Integer value) {
            addCriterion("white_image_height <>", value, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightGreaterThan(Integer value) {
            addCriterion("white_image_height >", value, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("white_image_height >=", value, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightLessThan(Integer value) {
            addCriterion("white_image_height <", value, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightLessThanOrEqualTo(Integer value) {
            addCriterion("white_image_height <=", value, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightIn(List<Integer> values) {
            addCriterion("white_image_height in", values, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightNotIn(List<Integer> values) {
            addCriterion("white_image_height not in", values, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightBetween(Integer value1, Integer value2) {
            addCriterion("white_image_height between", value1, value2, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andWhiteImageHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("white_image_height not between", value1, value2, "whiteImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlIsNull() {
            addCriterion("major_image_url is null");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlIsNotNull() {
            addCriterion("major_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlEqualTo(String value) {
            addCriterion("major_image_url =", value, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlNotEqualTo(String value) {
            addCriterion("major_image_url <>", value, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlGreaterThan(String value) {
            addCriterion("major_image_url >", value, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("major_image_url >=", value, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlLessThan(String value) {
            addCriterion("major_image_url <", value, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlLessThanOrEqualTo(String value) {
            addCriterion("major_image_url <=", value, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlLike(String value) {
            addCriterion("major_image_url like", value, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlNotLike(String value) {
            addCriterion("major_image_url not like", value, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlIn(List<String> values) {
            addCriterion("major_image_url in", values, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlNotIn(List<String> values) {
            addCriterion("major_image_url not in", values, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlBetween(String value1, String value2) {
            addCriterion("major_image_url between", value1, value2, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageUrlNotBetween(String value1, String value2) {
            addCriterion("major_image_url not between", value1, value2, "majorImageUrl");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthIsNull() {
            addCriterion("major_image_width is null");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthIsNotNull() {
            addCriterion("major_image_width is not null");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthEqualTo(Integer value) {
            addCriterion("major_image_width =", value, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthNotEqualTo(Integer value) {
            addCriterion("major_image_width <>", value, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthGreaterThan(Integer value) {
            addCriterion("major_image_width >", value, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_image_width >=", value, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthLessThan(Integer value) {
            addCriterion("major_image_width <", value, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthLessThanOrEqualTo(Integer value) {
            addCriterion("major_image_width <=", value, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthIn(List<Integer> values) {
            addCriterion("major_image_width in", values, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthNotIn(List<Integer> values) {
            addCriterion("major_image_width not in", values, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthBetween(Integer value1, Integer value2) {
            addCriterion("major_image_width between", value1, value2, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("major_image_width not between", value1, value2, "majorImageWidth");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightIsNull() {
            addCriterion("major_image_height is null");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightIsNotNull() {
            addCriterion("major_image_height is not null");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightEqualTo(Integer value) {
            addCriterion("major_image_height =", value, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightNotEqualTo(Integer value) {
            addCriterion("major_image_height <>", value, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightGreaterThan(Integer value) {
            addCriterion("major_image_height >", value, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_image_height >=", value, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightLessThan(Integer value) {
            addCriterion("major_image_height <", value, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightLessThanOrEqualTo(Integer value) {
            addCriterion("major_image_height <=", value, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightIn(List<Integer> values) {
            addCriterion("major_image_height in", values, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightNotIn(List<Integer> values) {
            addCriterion("major_image_height not in", values, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightBetween(Integer value1, Integer value2) {
            addCriterion("major_image_height between", value1, value2, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andMajorImageHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("major_image_height not between", value1, value2, "majorImageHeight");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameIsNull() {
            addCriterion("brand_cn_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameIsNotNull() {
            addCriterion("brand_cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameEqualTo(String value) {
            addCriterion("brand_cn_name =", value, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameNotEqualTo(String value) {
            addCriterion("brand_cn_name <>", value, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameGreaterThan(String value) {
            addCriterion("brand_cn_name >", value, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_cn_name >=", value, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameLessThan(String value) {
            addCriterion("brand_cn_name <", value, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameLessThanOrEqualTo(String value) {
            addCriterion("brand_cn_name <=", value, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameLike(String value) {
            addCriterion("brand_cn_name like", value, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameNotLike(String value) {
            addCriterion("brand_cn_name not like", value, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameIn(List<String> values) {
            addCriterion("brand_cn_name in", values, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameNotIn(List<String> values) {
            addCriterion("brand_cn_name not in", values, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameBetween(String value1, String value2) {
            addCriterion("brand_cn_name between", value1, value2, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandCnNameNotBetween(String value1, String value2) {
            addCriterion("brand_cn_name not between", value1, value2, "brandCnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameIsNull() {
            addCriterion("brand_en_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameIsNotNull() {
            addCriterion("brand_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameEqualTo(String value) {
            addCriterion("brand_en_name =", value, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameNotEqualTo(String value) {
            addCriterion("brand_en_name <>", value, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameGreaterThan(String value) {
            addCriterion("brand_en_name >", value, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_en_name >=", value, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameLessThan(String value) {
            addCriterion("brand_en_name <", value, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameLessThanOrEqualTo(String value) {
            addCriterion("brand_en_name <=", value, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameLike(String value) {
            addCriterion("brand_en_name like", value, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameNotLike(String value) {
            addCriterion("brand_en_name not like", value, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameIn(List<String> values) {
            addCriterion("brand_en_name in", values, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameNotIn(List<String> values) {
            addCriterion("brand_en_name not in", values, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameBetween(String value1, String value2) {
            addCriterion("brand_en_name between", value1, value2, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandEnNameNotBetween(String value1, String value2) {
            addCriterion("brand_en_name not between", value1, value2, "brandEnName");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdIsNull() {
            addCriterion("brand_state_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdIsNotNull() {
            addCriterion("brand_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdEqualTo(Integer value) {
            addCriterion("brand_state_id =", value, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdNotEqualTo(Integer value) {
            addCriterion("brand_state_id <>", value, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdGreaterThan(Integer value) {
            addCriterion("brand_state_id >", value, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_state_id >=", value, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdLessThan(Integer value) {
            addCriterion("brand_state_id <", value, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_state_id <=", value, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdIn(List<Integer> values) {
            addCriterion("brand_state_id in", values, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdNotIn(List<Integer> values) {
            addCriterion("brand_state_id not in", values, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_state_id between", value1, value2, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_state_id not between", value1, value2, "brandStateId");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameIsNull() {
            addCriterion("brand_state_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameIsNotNull() {
            addCriterion("brand_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameEqualTo(String value) {
            addCriterion("brand_state_name =", value, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameNotEqualTo(String value) {
            addCriterion("brand_state_name <>", value, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameGreaterThan(String value) {
            addCriterion("brand_state_name >", value, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_state_name >=", value, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameLessThan(String value) {
            addCriterion("brand_state_name <", value, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameLessThanOrEqualTo(String value) {
            addCriterion("brand_state_name <=", value, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameLike(String value) {
            addCriterion("brand_state_name like", value, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameNotLike(String value) {
            addCriterion("brand_state_name not like", value, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameIn(List<String> values) {
            addCriterion("brand_state_name in", values, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameNotIn(List<String> values) {
            addCriterion("brand_state_name not in", values, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameBetween(String value1, String value2) {
            addCriterion("brand_state_name between", value1, value2, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandStateNameNotBetween(String value1, String value2) {
            addCriterion("brand_state_name not between", value1, value2, "brandStateName");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlIsNull() {
            addCriterion("brand_country_flag_url is null");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlIsNotNull() {
            addCriterion("brand_country_flag_url is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlEqualTo(String value) {
            addCriterion("brand_country_flag_url =", value, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlNotEqualTo(String value) {
            addCriterion("brand_country_flag_url <>", value, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlGreaterThan(String value) {
            addCriterion("brand_country_flag_url >", value, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlGreaterThanOrEqualTo(String value) {
            addCriterion("brand_country_flag_url >=", value, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlLessThan(String value) {
            addCriterion("brand_country_flag_url <", value, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlLessThanOrEqualTo(String value) {
            addCriterion("brand_country_flag_url <=", value, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlLike(String value) {
            addCriterion("brand_country_flag_url like", value, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlNotLike(String value) {
            addCriterion("brand_country_flag_url not like", value, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlIn(List<String> values) {
            addCriterion("brand_country_flag_url in", values, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlNotIn(List<String> values) {
            addCriterion("brand_country_flag_url not in", values, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlBetween(String value1, String value2) {
            addCriterion("brand_country_flag_url between", value1, value2, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andBrandCountryFlagUrlNotBetween(String value1, String value2) {
            addCriterion("brand_country_flag_url not between", value1, value2, "brandCountryFlagUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathIsNull() {
            addCriterion("category_id_path is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathIsNotNull() {
            addCriterion("category_id_path is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathEqualTo(String value) {
            addCriterion("category_id_path =", value, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathNotEqualTo(String value) {
            addCriterion("category_id_path <>", value, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathGreaterThan(String value) {
            addCriterion("category_id_path >", value, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathGreaterThanOrEqualTo(String value) {
            addCriterion("category_id_path >=", value, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathLessThan(String value) {
            addCriterion("category_id_path <", value, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathLessThanOrEqualTo(String value) {
            addCriterion("category_id_path <=", value, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathLike(String value) {
            addCriterion("category_id_path like", value, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathNotLike(String value) {
            addCriterion("category_id_path not like", value, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathIn(List<String> values) {
            addCriterion("category_id_path in", values, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathNotIn(List<String> values) {
            addCriterion("category_id_path not in", values, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathBetween(String value1, String value2) {
            addCriterion("category_id_path between", value1, value2, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIdPathNotBetween(String value1, String value2) {
            addCriterion("category_id_path not between", value1, value2, "categoryIdPath");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameIsNull() {
            addCriterion("category_path_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameIsNotNull() {
            addCriterion("category_path_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameEqualTo(String value) {
            addCriterion("category_path_name =", value, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameNotEqualTo(String value) {
            addCriterion("category_path_name <>", value, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameGreaterThan(String value) {
            addCriterion("category_path_name >", value, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_path_name >=", value, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameLessThan(String value) {
            addCriterion("category_path_name <", value, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameLessThanOrEqualTo(String value) {
            addCriterion("category_path_name <=", value, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameLike(String value) {
            addCriterion("category_path_name like", value, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameNotLike(String value) {
            addCriterion("category_path_name not like", value, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameIn(List<String> values) {
            addCriterion("category_path_name in", values, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameNotIn(List<String> values) {
            addCriterion("category_path_name not in", values, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameBetween(String value1, String value2) {
            addCriterion("category_path_name between", value1, value2, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNameNotBetween(String value1, String value2) {
            addCriterion("category_path_name not between", value1, value2, "categoryPathName");
            return (Criteria) this;
        }

        public Criteria andSearchTagsIsNull() {
            addCriterion("search_tags is null");
            return (Criteria) this;
        }

        public Criteria andSearchTagsIsNotNull() {
            addCriterion("search_tags is not null");
            return (Criteria) this;
        }

        public Criteria andSearchTagsEqualTo(String value) {
            addCriterion("search_tags =", value, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsNotEqualTo(String value) {
            addCriterion("search_tags <>", value, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsGreaterThan(String value) {
            addCriterion("search_tags >", value, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsGreaterThanOrEqualTo(String value) {
            addCriterion("search_tags >=", value, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsLessThan(String value) {
            addCriterion("search_tags <", value, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsLessThanOrEqualTo(String value) {
            addCriterion("search_tags <=", value, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsLike(String value) {
            addCriterion("search_tags like", value, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsNotLike(String value) {
            addCriterion("search_tags not like", value, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsIn(List<String> values) {
            addCriterion("search_tags in", values, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsNotIn(List<String> values) {
            addCriterion("search_tags not in", values, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsBetween(String value1, String value2) {
            addCriterion("search_tags between", value1, value2, "searchTags");
            return (Criteria) this;
        }

        public Criteria andSearchTagsNotBetween(String value1, String value2) {
            addCriterion("search_tags not between", value1, value2, "searchTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsIsNull() {
            addCriterion("goods_tags is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsIsNotNull() {
            addCriterion("goods_tags is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsEqualTo(String value) {
            addCriterion("goods_tags =", value, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsNotEqualTo(String value) {
            addCriterion("goods_tags <>", value, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsGreaterThan(String value) {
            addCriterion("goods_tags >", value, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_tags >=", value, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsLessThan(String value) {
            addCriterion("goods_tags <", value, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsLessThanOrEqualTo(String value) {
            addCriterion("goods_tags <=", value, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsLike(String value) {
            addCriterion("goods_tags like", value, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsNotLike(String value) {
            addCriterion("goods_tags not like", value, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsIn(List<String> values) {
            addCriterion("goods_tags in", values, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsNotIn(List<String> values) {
            addCriterion("goods_tags not in", values, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsBetween(String value1, String value2) {
            addCriterion("goods_tags between", value1, value2, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsTagsNotBetween(String value1, String value2) {
            addCriterion("goods_tags not between", value1, value2, "goodsTags");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesIsNull() {
            addCriterion("goods_properties is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesIsNotNull() {
            addCriterion("goods_properties is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesEqualTo(String value) {
            addCriterion("goods_properties =", value, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesNotEqualTo(String value) {
            addCriterion("goods_properties <>", value, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesGreaterThan(String value) {
            addCriterion("goods_properties >", value, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("goods_properties >=", value, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesLessThan(String value) {
            addCriterion("goods_properties <", value, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesLessThanOrEqualTo(String value) {
            addCriterion("goods_properties <=", value, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesLike(String value) {
            addCriterion("goods_properties like", value, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesNotLike(String value) {
            addCriterion("goods_properties not like", value, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesIn(List<String> values) {
            addCriterion("goods_properties in", values, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesNotIn(List<String> values) {
            addCriterion("goods_properties not in", values, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesBetween(String value1, String value2) {
            addCriterion("goods_properties between", value1, value2, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andGoodsPropertiesNotBetween(String value1, String value2) {
            addCriterion("goods_properties not between", value1, value2, "goodsProperties");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopClassIdIsNull() {
            addCriterion("shop_class_id is null");
            return (Criteria) this;
        }

        public Criteria andShopClassIdIsNotNull() {
            addCriterion("shop_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopClassIdEqualTo(String value) {
            addCriterion("shop_class_id =", value, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdNotEqualTo(String value) {
            addCriterion("shop_class_id <>", value, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdGreaterThan(String value) {
            addCriterion("shop_class_id >", value, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_class_id >=", value, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdLessThan(String value) {
            addCriterion("shop_class_id <", value, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdLessThanOrEqualTo(String value) {
            addCriterion("shop_class_id <=", value, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdLike(String value) {
            addCriterion("shop_class_id like", value, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdNotLike(String value) {
            addCriterion("shop_class_id not like", value, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdIn(List<String> values) {
            addCriterion("shop_class_id in", values, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdNotIn(List<String> values) {
            addCriterion("shop_class_id not in", values, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdBetween(String value1, String value2) {
            addCriterion("shop_class_id between", value1, value2, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopClassIdNotBetween(String value1, String value2) {
            addCriterion("shop_class_id not between", value1, value2, "shopClassId");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(Boolean value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(Boolean value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(Boolean value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(Boolean value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<Boolean> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<Boolean> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeIsNull() {
            addCriterion("registration_address_type is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeIsNotNull() {
            addCriterion("registration_address_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeEqualTo(Boolean value) {
            addCriterion("registration_address_type =", value, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeNotEqualTo(Boolean value) {
            addCriterion("registration_address_type <>", value, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeGreaterThan(Boolean value) {
            addCriterion("registration_address_type >", value, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("registration_address_type >=", value, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeLessThan(Boolean value) {
            addCriterion("registration_address_type <", value, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("registration_address_type <=", value, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeIn(List<Boolean> values) {
            addCriterion("registration_address_type in", values, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeNotIn(List<Boolean> values) {
            addCriterion("registration_address_type not in", values, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("registration_address_type between", value1, value2, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andRegistrationAddressTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("registration_address_type not between", value1, value2, "registrationAddressType");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNull() {
            addCriterion("shop_level is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNotNull() {
            addCriterion("shop_level is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelEqualTo(Boolean value) {
            addCriterion("shop_level =", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotEqualTo(Boolean value) {
            addCriterion("shop_level <>", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThan(Boolean value) {
            addCriterion("shop_level >", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_level >=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThan(Boolean value) {
            addCriterion("shop_level <", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_level <=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelIn(List<Boolean> values) {
            addCriterion("shop_level in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotIn(List<Boolean> values) {
            addCriterion("shop_level not in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_level between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_level not between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsIsNull() {
            addCriterion("shop_major_category_ids is null");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsIsNotNull() {
            addCriterion("shop_major_category_ids is not null");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsEqualTo(String value) {
            addCriterion("shop_major_category_ids =", value, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsNotEqualTo(String value) {
            addCriterion("shop_major_category_ids <>", value, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsGreaterThan(String value) {
            addCriterion("shop_major_category_ids >", value, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsGreaterThanOrEqualTo(String value) {
            addCriterion("shop_major_category_ids >=", value, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsLessThan(String value) {
            addCriterion("shop_major_category_ids <", value, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsLessThanOrEqualTo(String value) {
            addCriterion("shop_major_category_ids <=", value, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsLike(String value) {
            addCriterion("shop_major_category_ids like", value, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsNotLike(String value) {
            addCriterion("shop_major_category_ids not like", value, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsIn(List<String> values) {
            addCriterion("shop_major_category_ids in", values, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsNotIn(List<String> values) {
            addCriterion("shop_major_category_ids not in", values, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsBetween(String value1, String value2) {
            addCriterion("shop_major_category_ids between", value1, value2, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopMajorCategoryIdsNotBetween(String value1, String value2) {
            addCriterion("shop_major_category_ids not between", value1, value2, "shopMajorCategoryIds");
            return (Criteria) this;
        }

        public Criteria andShopGmv30IsNull() {
            addCriterion("shop_gmv_30 is null");
            return (Criteria) this;
        }

        public Criteria andShopGmv30IsNotNull() {
            addCriterion("shop_gmv_30 is not null");
            return (Criteria) this;
        }

        public Criteria andShopGmv30EqualTo(BigDecimal value) {
            addCriterion("shop_gmv_30 =", value, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30NotEqualTo(BigDecimal value) {
            addCriterion("shop_gmv_30 <>", value, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30GreaterThan(BigDecimal value) {
            addCriterion("shop_gmv_30 >", value, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_gmv_30 >=", value, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30LessThan(BigDecimal value) {
            addCriterion("shop_gmv_30 <", value, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_gmv_30 <=", value, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30In(List<BigDecimal> values) {
            addCriterion("shop_gmv_30 in", values, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30NotIn(List<BigDecimal> values) {
            addCriterion("shop_gmv_30 not in", values, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_gmv_30 between", value1, value2, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_gmv_30 not between", value1, value2, "shopGmv30");
            return (Criteria) this;
        }

        public Criteria andShopGmv90IsNull() {
            addCriterion("shop_gmv_90 is null");
            return (Criteria) this;
        }

        public Criteria andShopGmv90IsNotNull() {
            addCriterion("shop_gmv_90 is not null");
            return (Criteria) this;
        }

        public Criteria andShopGmv90EqualTo(BigDecimal value) {
            addCriterion("shop_gmv_90 =", value, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90NotEqualTo(BigDecimal value) {
            addCriterion("shop_gmv_90 <>", value, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90GreaterThan(BigDecimal value) {
            addCriterion("shop_gmv_90 >", value, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_gmv_90 >=", value, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90LessThan(BigDecimal value) {
            addCriterion("shop_gmv_90 <", value, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90LessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_gmv_90 <=", value, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90In(List<BigDecimal> values) {
            addCriterion("shop_gmv_90 in", values, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90NotIn(List<BigDecimal> values) {
            addCriterion("shop_gmv_90 not in", values, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_gmv_90 between", value1, value2, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopGmv90NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_gmv_90 not between", value1, value2, "shopGmv90");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30IsNull() {
            addCriterion("shop_aftersale_rate_30 is null");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30IsNotNull() {
            addCriterion("shop_aftersale_rate_30 is not null");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30EqualTo(BigDecimal value) {
            addCriterion("shop_aftersale_rate_30 =", value, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30NotEqualTo(BigDecimal value) {
            addCriterion("shop_aftersale_rate_30 <>", value, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30GreaterThan(BigDecimal value) {
            addCriterion("shop_aftersale_rate_30 >", value, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_aftersale_rate_30 >=", value, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30LessThan(BigDecimal value) {
            addCriterion("shop_aftersale_rate_30 <", value, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_aftersale_rate_30 <=", value, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30In(List<BigDecimal> values) {
            addCriterion("shop_aftersale_rate_30 in", values, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30NotIn(List<BigDecimal> values) {
            addCriterion("shop_aftersale_rate_30 not in", values, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_aftersale_rate_30 between", value1, value2, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopAftersaleRate30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_aftersale_rate_30 not between", value1, value2, "shopAftersaleRate30");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysIsNull() {
            addCriterion("shop_open_days is null");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysIsNotNull() {
            addCriterion("shop_open_days is not null");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysEqualTo(Integer value) {
            addCriterion("shop_open_days =", value, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysNotEqualTo(Integer value) {
            addCriterion("shop_open_days <>", value, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysGreaterThan(Integer value) {
            addCriterion("shop_open_days >", value, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_open_days >=", value, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysLessThan(Integer value) {
            addCriterion("shop_open_days <", value, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysLessThanOrEqualTo(Integer value) {
            addCriterion("shop_open_days <=", value, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysIn(List<Integer> values) {
            addCriterion("shop_open_days in", values, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysNotIn(List<Integer> values) {
            addCriterion("shop_open_days not in", values, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysBetween(Integer value1, Integer value2) {
            addCriterion("shop_open_days between", value1, value2, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopOpenDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_open_days not between", value1, value2, "shopOpenDays");
            return (Criteria) this;
        }

        public Criteria andShopDsrIsNull() {
            addCriterion("shop_dsr is null");
            return (Criteria) this;
        }

        public Criteria andShopDsrIsNotNull() {
            addCriterion("shop_dsr is not null");
            return (Criteria) this;
        }

        public Criteria andShopDsrEqualTo(BigDecimal value) {
            addCriterion("shop_dsr =", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrNotEqualTo(BigDecimal value) {
            addCriterion("shop_dsr <>", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrGreaterThan(BigDecimal value) {
            addCriterion("shop_dsr >", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_dsr >=", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrLessThan(BigDecimal value) {
            addCriterion("shop_dsr <", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_dsr <=", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrIn(List<BigDecimal> values) {
            addCriterion("shop_dsr in", values, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrNotIn(List<BigDecimal> values) {
            addCriterion("shop_dsr not in", values, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_dsr between", value1, value2, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_dsr not between", value1, value2, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeIsNull() {
            addCriterion("shop_30_days_sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeIsNotNull() {
            addCriterion("shop_30_days_sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeEqualTo(Long value) {
            addCriterion("shop_30_days_sales_volume =", value, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeNotEqualTo(Long value) {
            addCriterion("shop_30_days_sales_volume <>", value, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeGreaterThan(Long value) {
            addCriterion("shop_30_days_sales_volume >", value, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_30_days_sales_volume >=", value, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeLessThan(Long value) {
            addCriterion("shop_30_days_sales_volume <", value, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeLessThanOrEqualTo(Long value) {
            addCriterion("shop_30_days_sales_volume <=", value, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeIn(List<Long> values) {
            addCriterion("shop_30_days_sales_volume in", values, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeNotIn(List<Long> values) {
            addCriterion("shop_30_days_sales_volume not in", values, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeBetween(Long value1, Long value2) {
            addCriterion("shop_30_days_sales_volume between", value1, value2, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andShop30DaysSalesVolumeNotBetween(Long value1, Long value2) {
            addCriterion("shop_30_days_sales_volume not between", value1, value2, "shop30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andActivityIdsIsNull() {
            addCriterion("activity_ids is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdsIsNotNull() {
            addCriterion("activity_ids is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdsEqualTo(String value) {
            addCriterion("activity_ids =", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsNotEqualTo(String value) {
            addCriterion("activity_ids <>", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsGreaterThan(String value) {
            addCriterion("activity_ids >", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("activity_ids >=", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsLessThan(String value) {
            addCriterion("activity_ids <", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsLessThanOrEqualTo(String value) {
            addCriterion("activity_ids <=", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsLike(String value) {
            addCriterion("activity_ids like", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsNotLike(String value) {
            addCriterion("activity_ids not like", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsIn(List<String> values) {
            addCriterion("activity_ids in", values, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsNotIn(List<String> values) {
            addCriterion("activity_ids not in", values, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsBetween(String value1, String value2) {
            addCriterion("activity_ids between", value1, value2, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsNotBetween(String value1, String value2) {
            addCriterion("activity_ids not between", value1, value2, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistIsNull() {
            addCriterion("activity_blacklist is null");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistIsNotNull() {
            addCriterion("activity_blacklist is not null");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistEqualTo(String value) {
            addCriterion("activity_blacklist =", value, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistNotEqualTo(String value) {
            addCriterion("activity_blacklist <>", value, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistGreaterThan(String value) {
            addCriterion("activity_blacklist >", value, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistGreaterThanOrEqualTo(String value) {
            addCriterion("activity_blacklist >=", value, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistLessThan(String value) {
            addCriterion("activity_blacklist <", value, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistLessThanOrEqualTo(String value) {
            addCriterion("activity_blacklist <=", value, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistLike(String value) {
            addCriterion("activity_blacklist like", value, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistNotLike(String value) {
            addCriterion("activity_blacklist not like", value, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistIn(List<String> values) {
            addCriterion("activity_blacklist in", values, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistNotIn(List<String> values) {
            addCriterion("activity_blacklist not in", values, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistBetween(String value1, String value2) {
            addCriterion("activity_blacklist between", value1, value2, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andActivityBlacklistNotBetween(String value1, String value2) {
            addCriterion("activity_blacklist not between", value1, value2, "activityBlacklist");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoIsNull() {
            addCriterion("shop_activity_info is null");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoIsNotNull() {
            addCriterion("shop_activity_info is not null");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoEqualTo(String value) {
            addCriterion("shop_activity_info =", value, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoNotEqualTo(String value) {
            addCriterion("shop_activity_info <>", value, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoGreaterThan(String value) {
            addCriterion("shop_activity_info >", value, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_activity_info >=", value, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoLessThan(String value) {
            addCriterion("shop_activity_info <", value, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoLessThanOrEqualTo(String value) {
            addCriterion("shop_activity_info <=", value, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoLike(String value) {
            addCriterion("shop_activity_info like", value, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoNotLike(String value) {
            addCriterion("shop_activity_info not like", value, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoIn(List<String> values) {
            addCriterion("shop_activity_info in", values, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoNotIn(List<String> values) {
            addCriterion("shop_activity_info not in", values, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoBetween(String value1, String value2) {
            addCriterion("shop_activity_info between", value1, value2, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopActivityInfoNotBetween(String value1, String value2) {
            addCriterion("shop_activity_info not between", value1, value2, "shopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoIsNull() {
            addCriterion("shop_warm_activity_info is null");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoIsNotNull() {
            addCriterion("shop_warm_activity_info is not null");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoEqualTo(String value) {
            addCriterion("shop_warm_activity_info =", value, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoNotEqualTo(String value) {
            addCriterion("shop_warm_activity_info <>", value, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoGreaterThan(String value) {
            addCriterion("shop_warm_activity_info >", value, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_warm_activity_info >=", value, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoLessThan(String value) {
            addCriterion("shop_warm_activity_info <", value, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoLessThanOrEqualTo(String value) {
            addCriterion("shop_warm_activity_info <=", value, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoLike(String value) {
            addCriterion("shop_warm_activity_info like", value, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoNotLike(String value) {
            addCriterion("shop_warm_activity_info not like", value, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoIn(List<String> values) {
            addCriterion("shop_warm_activity_info in", values, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoNotIn(List<String> values) {
            addCriterion("shop_warm_activity_info not in", values, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoBetween(String value1, String value2) {
            addCriterion("shop_warm_activity_info between", value1, value2, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopWarmActivityInfoNotBetween(String value1, String value2) {
            addCriterion("shop_warm_activity_info not between", value1, value2, "shopWarmActivityInfo");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsIsNull() {
            addCriterion("shop_part_activity_ids is null");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsIsNotNull() {
            addCriterion("shop_part_activity_ids is not null");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsEqualTo(String value) {
            addCriterion("shop_part_activity_ids =", value, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsNotEqualTo(String value) {
            addCriterion("shop_part_activity_ids <>", value, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsGreaterThan(String value) {
            addCriterion("shop_part_activity_ids >", value, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("shop_part_activity_ids >=", value, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsLessThan(String value) {
            addCriterion("shop_part_activity_ids <", value, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsLessThanOrEqualTo(String value) {
            addCriterion("shop_part_activity_ids <=", value, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsLike(String value) {
            addCriterion("shop_part_activity_ids like", value, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsNotLike(String value) {
            addCriterion("shop_part_activity_ids not like", value, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsIn(List<String> values) {
            addCriterion("shop_part_activity_ids in", values, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsNotIn(List<String> values) {
            addCriterion("shop_part_activity_ids not in", values, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsBetween(String value1, String value2) {
            addCriterion("shop_part_activity_ids between", value1, value2, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopPartActivityIdsNotBetween(String value1, String value2) {
            addCriterion("shop_part_activity_ids not between", value1, value2, "shopPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsIsNull() {
            addCriterion("shop_invest_part_activity_ids is null");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsIsNotNull() {
            addCriterion("shop_invest_part_activity_ids is not null");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsEqualTo(String value) {
            addCriterion("shop_invest_part_activity_ids =", value, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsNotEqualTo(String value) {
            addCriterion("shop_invest_part_activity_ids <>", value, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsGreaterThan(String value) {
            addCriterion("shop_invest_part_activity_ids >", value, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("shop_invest_part_activity_ids >=", value, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsLessThan(String value) {
            addCriterion("shop_invest_part_activity_ids <", value, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsLessThanOrEqualTo(String value) {
            addCriterion("shop_invest_part_activity_ids <=", value, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsLike(String value) {
            addCriterion("shop_invest_part_activity_ids like", value, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsNotLike(String value) {
            addCriterion("shop_invest_part_activity_ids not like", value, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsIn(List<String> values) {
            addCriterion("shop_invest_part_activity_ids in", values, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsNotIn(List<String> values) {
            addCriterion("shop_invest_part_activity_ids not in", values, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsBetween(String value1, String value2) {
            addCriterion("shop_invest_part_activity_ids between", value1, value2, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestPartActivityIdsNotBetween(String value1, String value2) {
            addCriterion("shop_invest_part_activity_ids not between", value1, value2, "shopInvestPartActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsIsNull() {
            addCriterion("shop_invest_activity_ids is null");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsIsNotNull() {
            addCriterion("shop_invest_activity_ids is not null");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsEqualTo(String value) {
            addCriterion("shop_invest_activity_ids =", value, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsNotEqualTo(String value) {
            addCriterion("shop_invest_activity_ids <>", value, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsGreaterThan(String value) {
            addCriterion("shop_invest_activity_ids >", value, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("shop_invest_activity_ids >=", value, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsLessThan(String value) {
            addCriterion("shop_invest_activity_ids <", value, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsLessThanOrEqualTo(String value) {
            addCriterion("shop_invest_activity_ids <=", value, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsLike(String value) {
            addCriterion("shop_invest_activity_ids like", value, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsNotLike(String value) {
            addCriterion("shop_invest_activity_ids not like", value, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsIn(List<String> values) {
            addCriterion("shop_invest_activity_ids in", values, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsNotIn(List<String> values) {
            addCriterion("shop_invest_activity_ids not in", values, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsBetween(String value1, String value2) {
            addCriterion("shop_invest_activity_ids between", value1, value2, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andShopInvestActivityIdsNotBetween(String value1, String value2) {
            addCriterion("shop_invest_activity_ids not between", value1, value2, "shopInvestActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsIsNull() {
            addCriterion("cross_shop_activity_ids is null");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsIsNotNull() {
            addCriterion("cross_shop_activity_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsEqualTo(String value) {
            addCriterion("cross_shop_activity_ids =", value, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsNotEqualTo(String value) {
            addCriterion("cross_shop_activity_ids <>", value, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsGreaterThan(String value) {
            addCriterion("cross_shop_activity_ids >", value, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("cross_shop_activity_ids >=", value, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsLessThan(String value) {
            addCriterion("cross_shop_activity_ids <", value, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsLessThanOrEqualTo(String value) {
            addCriterion("cross_shop_activity_ids <=", value, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsLike(String value) {
            addCriterion("cross_shop_activity_ids like", value, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsNotLike(String value) {
            addCriterion("cross_shop_activity_ids not like", value, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsIn(List<String> values) {
            addCriterion("cross_shop_activity_ids in", values, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsNotIn(List<String> values) {
            addCriterion("cross_shop_activity_ids not in", values, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsBetween(String value1, String value2) {
            addCriterion("cross_shop_activity_ids between", value1, value2, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityIdsNotBetween(String value1, String value2) {
            addCriterion("cross_shop_activity_ids not between", value1, value2, "crossShopActivityIds");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoIsNull() {
            addCriterion("cross_shop_activity_info is null");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoIsNotNull() {
            addCriterion("cross_shop_activity_info is not null");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoEqualTo(String value) {
            addCriterion("cross_shop_activity_info =", value, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoNotEqualTo(String value) {
            addCriterion("cross_shop_activity_info <>", value, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoGreaterThan(String value) {
            addCriterion("cross_shop_activity_info >", value, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoGreaterThanOrEqualTo(String value) {
            addCriterion("cross_shop_activity_info >=", value, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoLessThan(String value) {
            addCriterion("cross_shop_activity_info <", value, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoLessThanOrEqualTo(String value) {
            addCriterion("cross_shop_activity_info <=", value, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoLike(String value) {
            addCriterion("cross_shop_activity_info like", value, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoNotLike(String value) {
            addCriterion("cross_shop_activity_info not like", value, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoIn(List<String> values) {
            addCriterion("cross_shop_activity_info in", values, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoNotIn(List<String> values) {
            addCriterion("cross_shop_activity_info not in", values, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoBetween(String value1, String value2) {
            addCriterion("cross_shop_activity_info between", value1, value2, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andCrossShopActivityInfoNotBetween(String value1, String value2) {
            addCriterion("cross_shop_activity_info not between", value1, value2, "crossShopActivityInfo");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsIsNull() {
            addCriterion("allowance_activity_ids is null");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsIsNotNull() {
            addCriterion("allowance_activity_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsEqualTo(String value) {
            addCriterion("allowance_activity_ids =", value, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsNotEqualTo(String value) {
            addCriterion("allowance_activity_ids <>", value, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsGreaterThan(String value) {
            addCriterion("allowance_activity_ids >", value, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("allowance_activity_ids >=", value, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsLessThan(String value) {
            addCriterion("allowance_activity_ids <", value, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsLessThanOrEqualTo(String value) {
            addCriterion("allowance_activity_ids <=", value, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsLike(String value) {
            addCriterion("allowance_activity_ids like", value, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsNotLike(String value) {
            addCriterion("allowance_activity_ids not like", value, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsIn(List<String> values) {
            addCriterion("allowance_activity_ids in", values, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsNotIn(List<String> values) {
            addCriterion("allowance_activity_ids not in", values, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsBetween(String value1, String value2) {
            addCriterion("allowance_activity_ids between", value1, value2, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andAllowanceActivityIdsNotBetween(String value1, String value2) {
            addCriterion("allowance_activity_ids not between", value1, value2, "allowanceActivityIds");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(Long value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(Long value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(Long value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(Long value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(Long value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<Long> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<Long> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(Long value1, Long value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(Long value1, Long value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceIsNull() {
            addCriterion("big_promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceIsNotNull() {
            addCriterion("big_promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceEqualTo(Long value) {
            addCriterion("big_promotion_price =", value, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceNotEqualTo(Long value) {
            addCriterion("big_promotion_price <>", value, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceGreaterThan(Long value) {
            addCriterion("big_promotion_price >", value, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("big_promotion_price >=", value, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceLessThan(Long value) {
            addCriterion("big_promotion_price <", value, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceLessThanOrEqualTo(Long value) {
            addCriterion("big_promotion_price <=", value, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceIn(List<Long> values) {
            addCriterion("big_promotion_price in", values, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceNotIn(List<Long> values) {
            addCriterion("big_promotion_price not in", values, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceBetween(Long value1, Long value2) {
            addCriterion("big_promotion_price between", value1, value2, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionPriceNotBetween(Long value1, Long value2) {
            addCriterion("big_promotion_price not between", value1, value2, "bigPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceIsNull() {
            addCriterion("daily_price is null");
            return (Criteria) this;
        }

        public Criteria andDailyPriceIsNotNull() {
            addCriterion("daily_price is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPriceEqualTo(Long value) {
            addCriterion("daily_price =", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceNotEqualTo(Long value) {
            addCriterion("daily_price <>", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceGreaterThan(Long value) {
            addCriterion("daily_price >", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("daily_price >=", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceLessThan(Long value) {
            addCriterion("daily_price <", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceLessThanOrEqualTo(Long value) {
            addCriterion("daily_price <=", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceIn(List<Long> values) {
            addCriterion("daily_price in", values, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceNotIn(List<Long> values) {
            addCriterion("daily_price not in", values, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceBetween(Long value1, Long value2) {
            addCriterion("daily_price between", value1, value2, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceNotBetween(Long value1, Long value2) {
            addCriterion("daily_price not between", value1, value2, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNull() {
            addCriterion("vip_price is null");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNotNull() {
            addCriterion("vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipPriceEqualTo(Long value) {
            addCriterion("vip_price =", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotEqualTo(Long value) {
            addCriterion("vip_price <>", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThan(Long value) {
            addCriterion("vip_price >", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("vip_price >=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThan(Long value) {
            addCriterion("vip_price <", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThanOrEqualTo(Long value) {
            addCriterion("vip_price <=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIn(List<Long> values) {
            addCriterion("vip_price in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotIn(List<Long> values) {
            addCriterion("vip_price not in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceBetween(Long value1, Long value2) {
            addCriterion("vip_price between", value1, value2, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotBetween(Long value1, Long value2) {
            addCriterion("vip_price not between", value1, value2, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceIsNull() {
            addCriterion("big_promotion_vip_price is null");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceIsNotNull() {
            addCriterion("big_promotion_vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceEqualTo(Long value) {
            addCriterion("big_promotion_vip_price =", value, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceNotEqualTo(Long value) {
            addCriterion("big_promotion_vip_price <>", value, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceGreaterThan(Long value) {
            addCriterion("big_promotion_vip_price >", value, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("big_promotion_vip_price >=", value, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceLessThan(Long value) {
            addCriterion("big_promotion_vip_price <", value, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceLessThanOrEqualTo(Long value) {
            addCriterion("big_promotion_vip_price <=", value, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceIn(List<Long> values) {
            addCriterion("big_promotion_vip_price in", values, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceNotIn(List<Long> values) {
            addCriterion("big_promotion_vip_price not in", values, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceBetween(Long value1, Long value2) {
            addCriterion("big_promotion_vip_price between", value1, value2, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andBigPromotionVipPriceNotBetween(Long value1, Long value2) {
            addCriterion("big_promotion_vip_price not between", value1, value2, "bigPromotionVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceIsNull() {
            addCriterion("daily_vip_price is null");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceIsNotNull() {
            addCriterion("daily_vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceEqualTo(Long value) {
            addCriterion("daily_vip_price =", value, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceNotEqualTo(Long value) {
            addCriterion("daily_vip_price <>", value, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceGreaterThan(Long value) {
            addCriterion("daily_vip_price >", value, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("daily_vip_price >=", value, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceLessThan(Long value) {
            addCriterion("daily_vip_price <", value, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceLessThanOrEqualTo(Long value) {
            addCriterion("daily_vip_price <=", value, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceIn(List<Long> values) {
            addCriterion("daily_vip_price in", values, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceNotIn(List<Long> values) {
            addCriterion("daily_vip_price not in", values, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceBetween(Long value1, Long value2) {
            addCriterion("daily_vip_price between", value1, value2, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andDailyVipPriceNotBetween(Long value1, Long value2) {
            addCriterion("daily_vip_price not between", value1, value2, "dailyVipPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Integer value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Integer value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Integer value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Integer value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Integer value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Integer> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Integer> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Integer value1, Integer value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalIsNull() {
            addCriterion("commission_total is null");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalIsNotNull() {
            addCriterion("commission_total is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalEqualTo(Long value) {
            addCriterion("commission_total =", value, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalNotEqualTo(Long value) {
            addCriterion("commission_total <>", value, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalGreaterThan(Long value) {
            addCriterion("commission_total >", value, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("commission_total >=", value, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalLessThan(Long value) {
            addCriterion("commission_total <", value, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalLessThanOrEqualTo(Long value) {
            addCriterion("commission_total <=", value, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalIn(List<Long> values) {
            addCriterion("commission_total in", values, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalNotIn(List<Long> values) {
            addCriterion("commission_total not in", values, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalBetween(Long value1, Long value2) {
            addCriterion("commission_total between", value1, value2, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionTotalNotBetween(Long value1, Long value2) {
            addCriterion("commission_total not between", value1, value2, "commissionTotal");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Long value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Long value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Long value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Long value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Long value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Long value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Long> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Long> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Long value1, Long value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Long value1, Long value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andBrokerageIsNull() {
            addCriterion("brokerage is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageIsNotNull() {
            addCriterion("brokerage is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageEqualTo(BigDecimal value) {
            addCriterion("brokerage =", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotEqualTo(BigDecimal value) {
            addCriterion("brokerage <>", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageGreaterThan(BigDecimal value) {
            addCriterion("brokerage >", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("brokerage >=", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageLessThan(BigDecimal value) {
            addCriterion("brokerage <", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("brokerage <=", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageIn(List<BigDecimal> values) {
            addCriterion("brokerage in", values, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotIn(List<BigDecimal> values) {
            addCriterion("brokerage not in", values, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("brokerage between", value1, value2, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("brokerage not between", value1, value2, "brokerage");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysIsNull() {
            addCriterion("lowest_price_last_7_days is null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysIsNotNull() {
            addCriterion("lowest_price_last_7_days is not null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysEqualTo(Long value) {
            addCriterion("lowest_price_last_7_days =", value, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysNotEqualTo(Long value) {
            addCriterion("lowest_price_last_7_days <>", value, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysGreaterThan(Long value) {
            addCriterion("lowest_price_last_7_days >", value, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysGreaterThanOrEqualTo(Long value) {
            addCriterion("lowest_price_last_7_days >=", value, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysLessThan(Long value) {
            addCriterion("lowest_price_last_7_days <", value, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysLessThanOrEqualTo(Long value) {
            addCriterion("lowest_price_last_7_days <=", value, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysIn(List<Long> values) {
            addCriterion("lowest_price_last_7_days in", values, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysNotIn(List<Long> values) {
            addCriterion("lowest_price_last_7_days not in", values, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysBetween(Long value1, Long value2) {
            addCriterion("lowest_price_last_7_days between", value1, value2, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast7DaysNotBetween(Long value1, Long value2) {
            addCriterion("lowest_price_last_7_days not between", value1, value2, "lowestPriceLast7Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysIsNull() {
            addCriterion("lowest_price_last_15_days is null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysIsNotNull() {
            addCriterion("lowest_price_last_15_days is not null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysEqualTo(Long value) {
            addCriterion("lowest_price_last_15_days =", value, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysNotEqualTo(Long value) {
            addCriterion("lowest_price_last_15_days <>", value, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysGreaterThan(Long value) {
            addCriterion("lowest_price_last_15_days >", value, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysGreaterThanOrEqualTo(Long value) {
            addCriterion("lowest_price_last_15_days >=", value, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysLessThan(Long value) {
            addCriterion("lowest_price_last_15_days <", value, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysLessThanOrEqualTo(Long value) {
            addCriterion("lowest_price_last_15_days <=", value, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysIn(List<Long> values) {
            addCriterion("lowest_price_last_15_days in", values, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysNotIn(List<Long> values) {
            addCriterion("lowest_price_last_15_days not in", values, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysBetween(Long value1, Long value2) {
            addCriterion("lowest_price_last_15_days between", value1, value2, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast15DaysNotBetween(Long value1, Long value2) {
            addCriterion("lowest_price_last_15_days not between", value1, value2, "lowestPriceLast15Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysIsNull() {
            addCriterion("lowest_price_last_30_days is null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysIsNotNull() {
            addCriterion("lowest_price_last_30_days is not null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysEqualTo(Long value) {
            addCriterion("lowest_price_last_30_days =", value, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysNotEqualTo(Long value) {
            addCriterion("lowest_price_last_30_days <>", value, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysGreaterThan(Long value) {
            addCriterion("lowest_price_last_30_days >", value, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysGreaterThanOrEqualTo(Long value) {
            addCriterion("lowest_price_last_30_days >=", value, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysLessThan(Long value) {
            addCriterion("lowest_price_last_30_days <", value, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysLessThanOrEqualTo(Long value) {
            addCriterion("lowest_price_last_30_days <=", value, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysIn(List<Long> values) {
            addCriterion("lowest_price_last_30_days in", values, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysNotIn(List<Long> values) {
            addCriterion("lowest_price_last_30_days not in", values, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysBetween(Long value1, Long value2) {
            addCriterion("lowest_price_last_30_days between", value1, value2, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLast30DaysNotBetween(Long value1, Long value2) {
            addCriterion("lowest_price_last_30_days not between", value1, value2, "lowestPriceLast30Days");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionIsNull() {
            addCriterion("in_big_promotion is null");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionIsNotNull() {
            addCriterion("in_big_promotion is not null");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionEqualTo(Byte value) {
            addCriterion("in_big_promotion =", value, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionNotEqualTo(Byte value) {
            addCriterion("in_big_promotion <>", value, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionGreaterThan(Byte value) {
            addCriterion("in_big_promotion >", value, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionGreaterThanOrEqualTo(Byte value) {
            addCriterion("in_big_promotion >=", value, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionLessThan(Byte value) {
            addCriterion("in_big_promotion <", value, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionLessThanOrEqualTo(Byte value) {
            addCriterion("in_big_promotion <=", value, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionIn(List<Byte> values) {
            addCriterion("in_big_promotion in", values, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionNotIn(List<Byte> values) {
            addCriterion("in_big_promotion not in", values, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionBetween(Byte value1, Byte value2) {
            addCriterion("in_big_promotion between", value1, value2, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andInBigPromotionNotBetween(Byte value1, Byte value2) {
            addCriterion("in_big_promotion not between", value1, value2, "inBigPromotion");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeIsNull() {
            addCriterion("goods_7_days_sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeIsNotNull() {
            addCriterion("goods_7_days_sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeEqualTo(Long value) {
            addCriterion("goods_7_days_sales_volume =", value, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeNotEqualTo(Long value) {
            addCriterion("goods_7_days_sales_volume <>", value, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeGreaterThan(Long value) {
            addCriterion("goods_7_days_sales_volume >", value, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_7_days_sales_volume >=", value, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeLessThan(Long value) {
            addCriterion("goods_7_days_sales_volume <", value, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeLessThanOrEqualTo(Long value) {
            addCriterion("goods_7_days_sales_volume <=", value, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeIn(List<Long> values) {
            addCriterion("goods_7_days_sales_volume in", values, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeNotIn(List<Long> values) {
            addCriterion("goods_7_days_sales_volume not in", values, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeBetween(Long value1, Long value2) {
            addCriterion("goods_7_days_sales_volume between", value1, value2, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods7DaysSalesVolumeNotBetween(Long value1, Long value2) {
            addCriterion("goods_7_days_sales_volume not between", value1, value2, "goods7DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeIsNull() {
            addCriterion("goods_30_days_sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeIsNotNull() {
            addCriterion("goods_30_days_sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeEqualTo(Long value) {
            addCriterion("goods_30_days_sales_volume =", value, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeNotEqualTo(Long value) {
            addCriterion("goods_30_days_sales_volume <>", value, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeGreaterThan(Long value) {
            addCriterion("goods_30_days_sales_volume >", value, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_30_days_sales_volume >=", value, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeLessThan(Long value) {
            addCriterion("goods_30_days_sales_volume <", value, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeLessThanOrEqualTo(Long value) {
            addCriterion("goods_30_days_sales_volume <=", value, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeIn(List<Long> values) {
            addCriterion("goods_30_days_sales_volume in", values, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeNotIn(List<Long> values) {
            addCriterion("goods_30_days_sales_volume not in", values, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeBetween(Long value1, Long value2) {
            addCriterion("goods_30_days_sales_volume between", value1, value2, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods30DaysSalesVolumeNotBetween(Long value1, Long value2) {
            addCriterion("goods_30_days_sales_volume not between", value1, value2, "goods30DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeIsNull() {
            addCriterion("goods_60_days_sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeIsNotNull() {
            addCriterion("goods_60_days_sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeEqualTo(Long value) {
            addCriterion("goods_60_days_sales_volume =", value, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeNotEqualTo(Long value) {
            addCriterion("goods_60_days_sales_volume <>", value, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeGreaterThan(Long value) {
            addCriterion("goods_60_days_sales_volume >", value, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_60_days_sales_volume >=", value, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeLessThan(Long value) {
            addCriterion("goods_60_days_sales_volume <", value, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeLessThanOrEqualTo(Long value) {
            addCriterion("goods_60_days_sales_volume <=", value, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeIn(List<Long> values) {
            addCriterion("goods_60_days_sales_volume in", values, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeNotIn(List<Long> values) {
            addCriterion("goods_60_days_sales_volume not in", values, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeBetween(Long value1, Long value2) {
            addCriterion("goods_60_days_sales_volume between", value1, value2, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoods60DaysSalesVolumeNotBetween(Long value1, Long value2) {
            addCriterion("goods_60_days_sales_volume not between", value1, value2, "goods60DaysSalesVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7IsNull() {
            addCriterion("goods_gmv_7 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7IsNotNull() {
            addCriterion("goods_gmv_7 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7EqualTo(BigDecimal value) {
            addCriterion("goods_gmv_7 =", value, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7NotEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_7 <>", value, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7GreaterThan(BigDecimal value) {
            addCriterion("goods_gmv_7 >", value, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_7 >=", value, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7LessThan(BigDecimal value) {
            addCriterion("goods_gmv_7 <", value, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_7 <=", value, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7In(List<BigDecimal> values) {
            addCriterion("goods_gmv_7 in", values, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7NotIn(List<BigDecimal> values) {
            addCriterion("goods_gmv_7 not in", values, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_gmv_7 between", value1, value2, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_gmv_7 not between", value1, value2, "goodsGmv7");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30IsNull() {
            addCriterion("goods_gmv_30 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30IsNotNull() {
            addCriterion("goods_gmv_30 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30EqualTo(BigDecimal value) {
            addCriterion("goods_gmv_30 =", value, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30NotEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_30 <>", value, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30GreaterThan(BigDecimal value) {
            addCriterion("goods_gmv_30 >", value, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_30 >=", value, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30LessThan(BigDecimal value) {
            addCriterion("goods_gmv_30 <", value, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_30 <=", value, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30In(List<BigDecimal> values) {
            addCriterion("goods_gmv_30 in", values, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30NotIn(List<BigDecimal> values) {
            addCriterion("goods_gmv_30 not in", values, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_gmv_30 between", value1, value2, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_gmv_30 not between", value1, value2, "goodsGmv30");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60IsNull() {
            addCriterion("goods_gmv_60 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60IsNotNull() {
            addCriterion("goods_gmv_60 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60EqualTo(BigDecimal value) {
            addCriterion("goods_gmv_60 =", value, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60NotEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_60 <>", value, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60GreaterThan(BigDecimal value) {
            addCriterion("goods_gmv_60 >", value, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_60 >=", value, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60LessThan(BigDecimal value) {
            addCriterion("goods_gmv_60 <", value, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60LessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_gmv_60 <=", value, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60In(List<BigDecimal> values) {
            addCriterion("goods_gmv_60 in", values, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60NotIn(List<BigDecimal> values) {
            addCriterion("goods_gmv_60 not in", values, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_gmv_60 between", value1, value2, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsGmv60NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_gmv_60 not between", value1, value2, "goodsGmv60");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrIsNull() {
            addCriterion("goods_dsr is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrIsNotNull() {
            addCriterion("goods_dsr is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrEqualTo(BigDecimal value) {
            addCriterion("goods_dsr =", value, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrNotEqualTo(BigDecimal value) {
            addCriterion("goods_dsr <>", value, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrGreaterThan(BigDecimal value) {
            addCriterion("goods_dsr >", value, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_dsr >=", value, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrLessThan(BigDecimal value) {
            addCriterion("goods_dsr <", value, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_dsr <=", value, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrIn(List<BigDecimal> values) {
            addCriterion("goods_dsr in", values, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrNotIn(List<BigDecimal> values) {
            addCriterion("goods_dsr not in", values, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_dsr between", value1, value2, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andGoodsDsrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_dsr not between", value1, value2, "goodsDsr");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30IsNull() {
            addCriterion("click_conver_rate_30 is null");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30IsNotNull() {
            addCriterion("click_conver_rate_30 is not null");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30EqualTo(BigDecimal value) {
            addCriterion("click_conver_rate_30 =", value, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30NotEqualTo(BigDecimal value) {
            addCriterion("click_conver_rate_30 <>", value, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30GreaterThan(BigDecimal value) {
            addCriterion("click_conver_rate_30 >", value, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("click_conver_rate_30 >=", value, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30LessThan(BigDecimal value) {
            addCriterion("click_conver_rate_30 <", value, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("click_conver_rate_30 <=", value, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30In(List<BigDecimal> values) {
            addCriterion("click_conver_rate_30 in", values, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30NotIn(List<BigDecimal> values) {
            addCriterion("click_conver_rate_30 not in", values, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("click_conver_rate_30 between", value1, value2, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andClickConverRate30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("click_conver_rate_30 not between", value1, value2, "clickConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30IsNull() {
            addCriterion("purchase_conver_rate_30 is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30IsNotNull() {
            addCriterion("purchase_conver_rate_30 is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30EqualTo(BigDecimal value) {
            addCriterion("purchase_conver_rate_30 =", value, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30NotEqualTo(BigDecimal value) {
            addCriterion("purchase_conver_rate_30 <>", value, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30GreaterThan(BigDecimal value) {
            addCriterion("purchase_conver_rate_30 >", value, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_conver_rate_30 >=", value, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30LessThan(BigDecimal value) {
            addCriterion("purchase_conver_rate_30 <", value, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_conver_rate_30 <=", value, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30In(List<BigDecimal> values) {
            addCriterion("purchase_conver_rate_30 in", values, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30NotIn(List<BigDecimal> values) {
            addCriterion("purchase_conver_rate_30 not in", values, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_conver_rate_30 between", value1, value2, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPurchaseConverRate30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_conver_rate_30 not between", value1, value2, "purchaseConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30IsNull() {
            addCriterion("pay_conver_rate_30 is null");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30IsNotNull() {
            addCriterion("pay_conver_rate_30 is not null");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30EqualTo(BigDecimal value) {
            addCriterion("pay_conver_rate_30 =", value, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30NotEqualTo(BigDecimal value) {
            addCriterion("pay_conver_rate_30 <>", value, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30GreaterThan(BigDecimal value) {
            addCriterion("pay_conver_rate_30 >", value, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_conver_rate_30 >=", value, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30LessThan(BigDecimal value) {
            addCriterion("pay_conver_rate_30 <", value, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_conver_rate_30 <=", value, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30In(List<BigDecimal> values) {
            addCriterion("pay_conver_rate_30 in", values, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30NotIn(List<BigDecimal> values) {
            addCriterion("pay_conver_rate_30 not in", values, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_conver_rate_30 between", value1, value2, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andPayConverRate30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_conver_rate_30 not between", value1, value2, "payConverRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRateIsNull() {
            addCriterion("reputation_rate is null");
            return (Criteria) this;
        }

        public Criteria andReputationRateIsNotNull() {
            addCriterion("reputation_rate is not null");
            return (Criteria) this;
        }

        public Criteria andReputationRateEqualTo(BigDecimal value) {
            addCriterion("reputation_rate =", value, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateNotEqualTo(BigDecimal value) {
            addCriterion("reputation_rate <>", value, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateGreaterThan(BigDecimal value) {
            addCriterion("reputation_rate >", value, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reputation_rate >=", value, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateLessThan(BigDecimal value) {
            addCriterion("reputation_rate <", value, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reputation_rate <=", value, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateIn(List<BigDecimal> values) {
            addCriterion("reputation_rate in", values, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateNotIn(List<BigDecimal> values) {
            addCriterion("reputation_rate not in", values, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reputation_rate between", value1, value2, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reputation_rate not between", value1, value2, "reputationRate");
            return (Criteria) this;
        }

        public Criteria andReputationRate30IsNull() {
            addCriterion("reputation_rate30 is null");
            return (Criteria) this;
        }

        public Criteria andReputationRate30IsNotNull() {
            addCriterion("reputation_rate30 is not null");
            return (Criteria) this;
        }

        public Criteria andReputationRate30EqualTo(BigDecimal value) {
            addCriterion("reputation_rate30 =", value, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30NotEqualTo(BigDecimal value) {
            addCriterion("reputation_rate30 <>", value, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30GreaterThan(BigDecimal value) {
            addCriterion("reputation_rate30 >", value, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reputation_rate30 >=", value, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30LessThan(BigDecimal value) {
            addCriterion("reputation_rate30 <", value, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("reputation_rate30 <=", value, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30In(List<BigDecimal> values) {
            addCriterion("reputation_rate30 in", values, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30NotIn(List<BigDecimal> values) {
            addCriterion("reputation_rate30 not in", values, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("reputation_rate30 between", value1, value2, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andReputationRate30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reputation_rate30 not between", value1, value2, "reputationRate30");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberIsNull() {
            addCriterion("buyer_number is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberIsNotNull() {
            addCriterion("buyer_number is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberEqualTo(Long value) {
            addCriterion("buyer_number =", value, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberNotEqualTo(Long value) {
            addCriterion("buyer_number <>", value, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberGreaterThan(Long value) {
            addCriterion("buyer_number >", value, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("buyer_number >=", value, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberLessThan(Long value) {
            addCriterion("buyer_number <", value, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberLessThanOrEqualTo(Long value) {
            addCriterion("buyer_number <=", value, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberIn(List<Long> values) {
            addCriterion("buyer_number in", values, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberNotIn(List<Long> values) {
            addCriterion("buyer_number not in", values, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberBetween(Long value1, Long value2) {
            addCriterion("buyer_number between", value1, value2, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andBuyerNumberNotBetween(Long value1, Long value2) {
            addCriterion("buyer_number not between", value1, value2, "buyerNumber");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreIsNull() {
            addCriterion("prediction_score is null");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreIsNotNull() {
            addCriterion("prediction_score is not null");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreEqualTo(Double value) {
            addCriterion("prediction_score =", value, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreNotEqualTo(Double value) {
            addCriterion("prediction_score <>", value, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreGreaterThan(Double value) {
            addCriterion("prediction_score >", value, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("prediction_score >=", value, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreLessThan(Double value) {
            addCriterion("prediction_score <", value, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreLessThanOrEqualTo(Double value) {
            addCriterion("prediction_score <=", value, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreIn(List<Double> values) {
            addCriterion("prediction_score in", values, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreNotIn(List<Double> values) {
            addCriterion("prediction_score not in", values, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreBetween(Double value1, Double value2) {
            addCriterion("prediction_score between", value1, value2, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andPredictionScoreNotBetween(Double value1, Double value2) {
            addCriterion("prediction_score not between", value1, value2, "predictionScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreIsNull() {
            addCriterion("item_score is null");
            return (Criteria) this;
        }

        public Criteria andItemScoreIsNotNull() {
            addCriterion("item_score is not null");
            return (Criteria) this;
        }

        public Criteria andItemScoreEqualTo(Double value) {
            addCriterion("item_score =", value, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreNotEqualTo(Double value) {
            addCriterion("item_score <>", value, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreGreaterThan(Double value) {
            addCriterion("item_score >", value, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("item_score >=", value, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreLessThan(Double value) {
            addCriterion("item_score <", value, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreLessThanOrEqualTo(Double value) {
            addCriterion("item_score <=", value, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreIn(List<Double> values) {
            addCriterion("item_score in", values, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreNotIn(List<Double> values) {
            addCriterion("item_score not in", values, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreBetween(Double value1, Double value2) {
            addCriterion("item_score between", value1, value2, "itemScore");
            return (Criteria) this;
        }

        public Criteria andItemScoreNotBetween(Double value1, Double value2) {
            addCriterion("item_score not between", value1, value2, "itemScore");
            return (Criteria) this;
        }

        public Criteria andInBlackListIsNull() {
            addCriterion("in_black_list is null");
            return (Criteria) this;
        }

        public Criteria andInBlackListIsNotNull() {
            addCriterion("in_black_list is not null");
            return (Criteria) this;
        }

        public Criteria andInBlackListEqualTo(Boolean value) {
            addCriterion("in_black_list =", value, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListNotEqualTo(Boolean value) {
            addCriterion("in_black_list <>", value, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListGreaterThan(Boolean value) {
            addCriterion("in_black_list >", value, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListGreaterThanOrEqualTo(Boolean value) {
            addCriterion("in_black_list >=", value, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListLessThan(Boolean value) {
            addCriterion("in_black_list <", value, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListLessThanOrEqualTo(Boolean value) {
            addCriterion("in_black_list <=", value, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListIn(List<Boolean> values) {
            addCriterion("in_black_list in", values, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListNotIn(List<Boolean> values) {
            addCriterion("in_black_list not in", values, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListBetween(Boolean value1, Boolean value2) {
            addCriterion("in_black_list between", value1, value2, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInBlackListNotBetween(Boolean value1, Boolean value2) {
            addCriterion("in_black_list not between", value1, value2, "inBlackList");
            return (Criteria) this;
        }

        public Criteria andInStockIsNull() {
            addCriterion("in_stock is null");
            return (Criteria) this;
        }

        public Criteria andInStockIsNotNull() {
            addCriterion("in_stock is not null");
            return (Criteria) this;
        }

        public Criteria andInStockEqualTo(Boolean value) {
            addCriterion("in_stock =", value, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockNotEqualTo(Boolean value) {
            addCriterion("in_stock <>", value, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockGreaterThan(Boolean value) {
            addCriterion("in_stock >", value, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("in_stock >=", value, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockLessThan(Boolean value) {
            addCriterion("in_stock <", value, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockLessThanOrEqualTo(Boolean value) {
            addCriterion("in_stock <=", value, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockIn(List<Boolean> values) {
            addCriterion("in_stock in", values, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockNotIn(List<Boolean> values) {
            addCriterion("in_stock not in", values, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockBetween(Boolean value1, Boolean value2) {
            addCriterion("in_stock between", value1, value2, "inStock");
            return (Criteria) this;
        }

        public Criteria andInStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("in_stock not between", value1, value2, "inStock");
            return (Criteria) this;
        }

        public Criteria andInFeedIsNull() {
            addCriterion("in_feed is null");
            return (Criteria) this;
        }

        public Criteria andInFeedIsNotNull() {
            addCriterion("in_feed is not null");
            return (Criteria) this;
        }

        public Criteria andInFeedEqualTo(Byte value) {
            addCriterion("in_feed =", value, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedNotEqualTo(Byte value) {
            addCriterion("in_feed <>", value, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedGreaterThan(Byte value) {
            addCriterion("in_feed >", value, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedGreaterThanOrEqualTo(Byte value) {
            addCriterion("in_feed >=", value, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedLessThan(Byte value) {
            addCriterion("in_feed <", value, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedLessThanOrEqualTo(Byte value) {
            addCriterion("in_feed <=", value, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedIn(List<Byte> values) {
            addCriterion("in_feed in", values, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedNotIn(List<Byte> values) {
            addCriterion("in_feed not in", values, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedBetween(Byte value1, Byte value2) {
            addCriterion("in_feed between", value1, value2, "inFeed");
            return (Criteria) this;
        }

        public Criteria andInFeedNotBetween(Byte value1, Byte value2) {
            addCriterion("in_feed not between", value1, value2, "inFeed");
            return (Criteria) this;
        }

        public Criteria andSkuNumIsNull() {
            addCriterion("sku_num is null");
            return (Criteria) this;
        }

        public Criteria andSkuNumIsNotNull() {
            addCriterion("sku_num is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNumEqualTo(Short value) {
            addCriterion("sku_num =", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotEqualTo(Short value) {
            addCriterion("sku_num <>", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThan(Short value) {
            addCriterion("sku_num >", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThanOrEqualTo(Short value) {
            addCriterion("sku_num >=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThan(Short value) {
            addCriterion("sku_num <", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThanOrEqualTo(Short value) {
            addCriterion("sku_num <=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumIn(List<Short> values) {
            addCriterion("sku_num in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotIn(List<Short> values) {
            addCriterion("sku_num not in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumBetween(Short value1, Short value2) {
            addCriterion("sku_num between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotBetween(Short value1, Short value2) {
            addCriterion("sku_num not between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningIsNull() {
            addCriterion("anchor_earning is null");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningIsNotNull() {
            addCriterion("anchor_earning is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningEqualTo(Long value) {
            addCriterion("anchor_earning =", value, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningNotEqualTo(Long value) {
            addCriterion("anchor_earning <>", value, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningGreaterThan(Long value) {
            addCriterion("anchor_earning >", value, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningGreaterThanOrEqualTo(Long value) {
            addCriterion("anchor_earning >=", value, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningLessThan(Long value) {
            addCriterion("anchor_earning <", value, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningLessThanOrEqualTo(Long value) {
            addCriterion("anchor_earning <=", value, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningIn(List<Long> values) {
            addCriterion("anchor_earning in", values, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningNotIn(List<Long> values) {
            addCriterion("anchor_earning not in", values, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningBetween(Long value1, Long value2) {
            addCriterion("anchor_earning between", value1, value2, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorEarningNotBetween(Long value1, Long value2) {
            addCriterion("anchor_earning not between", value1, value2, "anchorEarning");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionIsNull() {
            addCriterion("anchor_commission is null");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionIsNotNull() {
            addCriterion("anchor_commission is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionEqualTo(BigDecimal value) {
            addCriterion("anchor_commission =", value, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionNotEqualTo(BigDecimal value) {
            addCriterion("anchor_commission <>", value, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionGreaterThan(BigDecimal value) {
            addCriterion("anchor_commission >", value, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("anchor_commission >=", value, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionLessThan(BigDecimal value) {
            addCriterion("anchor_commission <", value, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("anchor_commission <=", value, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionIn(List<BigDecimal> values) {
            addCriterion("anchor_commission in", values, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionNotIn(List<BigDecimal> values) {
            addCriterion("anchor_commission not in", values, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("anchor_commission between", value1, value2, "anchorCommission");
            return (Criteria) this;
        }

        public Criteria andAnchorCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("anchor_commission not between", value1, value2, "anchorCommission");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}