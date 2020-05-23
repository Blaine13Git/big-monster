package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily1.LiveVideoAttributeMapper;
import com.muyi.bigMonster.mapper.daily2drds.PBuyerResourceMapper;
import com.muyi.bigMonster.model.daily1.LiveVideoAttribute;
import com.muyi.bigMonster.model.daily2drds.PBuyerResource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

}
