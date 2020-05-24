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

    public int updateBuyerResourceEndTime(Integer buyerResourceId, String time) {
        log.info("buyerResourceId=" + buyerResourceId + "\ntime=" + time);
        int number = pBuyerResourceMapper.updateById(buyerResourceId, time);
        return number;
    }
}
