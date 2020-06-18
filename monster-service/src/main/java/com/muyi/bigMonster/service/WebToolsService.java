package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily2drds.PBuyerResourceMapper;
import com.muyi.bigMonster.mapper.daily3.GoodsIndexDataMapper;
import com.muyi.bigMonster.model.daily2drds.PBuyerResource;
import com.muyi.bigMonster.model.daily2drds.PBuyerResourceExample;
import com.muyi.bigMonster.model.daily3.GoodsIndexData;
import com.muyi.bigMonster.model.daily3.GoodsIndexDataExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class WebToolsService {

    @Resource
    private PBuyerResourceMapper pBuyerResourceMapper;

    @Resource
    private GoodsIndexDataMapper goodsIndexDataMapper;

    /**
     * 更新优惠券的有效期
     * OK
     *
     * @param buyerResourceId
     * @param time
     * @return
     */
    public int updateBuyerResourceEndTime(Integer buyerResourceId, String time) {
        log.info("\nbuyerResourceId=" + buyerResourceId + "\ntime=" + time);
        int number = pBuyerResourceMapper.updateById(buyerResourceId, time);
        return number;
    }

    /**
     * 获取用户未过期的券
     *
     * @param accountId
     * @return
     */
    //查询红包记录
    public List<PBuyerResource> getUsefulBuyerResource(Long accountId) {
        PBuyerResourceExample example = new PBuyerResourceExample();
        PBuyerResourceExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId);
        criteria.andEndTimeGreaterThan(new Date());

        Integer status = 0;
        criteria.andStatusEqualTo(status.byteValue());
        List<PBuyerResource> pBuyerResources = pBuyerResourceMapper.selectByExample(example);
        return pBuyerResources;
    }

    /**
     * 获取用户已过期的券
     *
     * @param accountId
     * @return
     */
    //查询红包记录
    public List<PBuyerResource> getOverdueBuyerResource(Long accountId) {
        PBuyerResourceExample example = new PBuyerResourceExample();
        PBuyerResourceExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId);
        criteria.andEndTimeLessThan(new Date());
        Integer status = 0;
        criteria.andStatusEqualTo(status.byteValue());
        List<PBuyerResource> pBuyerResources = pBuyerResourceMapper.selectByExample(example);
        return pBuyerResources;
    }

    // 活动下的子活动

    // 活动对应的红包

    // 活动对应的中奖情况

    // 红包对应中奖情况

    /**
     * 查询佣金比例
     *
     * @param itemId
     * @return
     */
    public List<GoodsIndexData> getBrokerageByItemId(Long itemId) {
        GoodsIndexDataExample example = new GoodsIndexDataExample();
        GoodsIndexDataExample.Criteria criteria = example.createCriteria();
        criteria.andItemIdEqualTo(itemId);
        List<GoodsIndexData> goodsIndexData = goodsIndexDataMapper.selectByExample(example);
        return goodsIndexData;
    }

    public static void main(String[] args) {
        String data = "/Users/changfeng/work/jacoco/big-monster/monster-data/target/classes/mybatis-generator.xml";
        int index1 = data.indexOf("/target/classes/");
        int index2 = data.substring(0, index1).lastIndexOf("/") + 1;
        data.substring(0,index2);

        System.out.println();
    }
}
