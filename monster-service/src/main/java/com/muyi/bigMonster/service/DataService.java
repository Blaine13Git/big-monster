package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily1.LiveVideoAttributeMapper;
import com.muyi.bigMonster.mapper.daily2drds.PBuyerResourceMapper;
import com.muyi.bigMonster.model.daily1.LiveVideoAttribute;
import com.muyi.bigMonster.model.daily2drds.PBuyerResource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 基础工程调试使用
 * test
 */

@Service
public class DataService {

    @Resource
    private LiveVideoAttributeMapper liveVideoAttributeMapper;

    @Resource
    private PBuyerResourceMapper pBuyerResourceMapper;

    public void case01() {
        LiveVideoAttribute liveVideoAttribute = liveVideoAttributeMapper.selectByPrimaryKey(1);
        Integer accountId = liveVideoAttribute.getAccountId();
        System.out.println("accountId:" + accountId);

    }

    public void case02() {
        PBuyerResource pBuyerResource = pBuyerResourceMapper.selectByPrimaryKey(200468L);
        Long accountId = pBuyerResource.getAccountId();
        System.out.println("accountId:" + accountId);

    }

    public void case03(Integer buyerResourceId, String time) {
        int number = pBuyerResourceMapper.updateById(1406249, "2020-05-23 23:00:00");
        System.out.println("update number:" + number);

    }

}
