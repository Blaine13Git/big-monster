package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily2drds.PBuyerResourceMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class WebToolsService {

    @Resource
    private PBuyerResourceMapper pBuyerResourceMapper;

    /**
     * 更新优惠券的有效期
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

    // 活动下的子活动

    // 活动对应的红包

    // 活动对应的中奖情况

    // 红包对应中奖情况
}
