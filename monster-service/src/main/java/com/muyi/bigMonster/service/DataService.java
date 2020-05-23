package com.muyi.bigMonster.service;

import com.muyi.bigMonster.daily1.mapper.LiveVideoAttributeMapper;
import com.muyi.bigMonster.daily1.model.LiveVideoAttribute;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DataService {

    @Resource
    private LiveVideoAttributeMapper liveVideoAttributeMapper;

    public void case01() {
        LiveVideoAttribute liveVideoAttribute = liveVideoAttributeMapper.selectByPrimaryKey(1);
        Integer accountId = liveVideoAttribute.getAccountId();
        System.out.println("accountId:" + accountId);

    }

}
