package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.LiveVideoAttributeMapper;
import com.muyi.bigMonster.model.LiveVideoAttribute;
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
