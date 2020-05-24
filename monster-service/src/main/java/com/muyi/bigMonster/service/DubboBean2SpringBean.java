package com.muyi.bigMonster.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ggj.hqbs.live.api.LiveApi;
import com.ggj.hqbs.live.api.RoomApi;
import com.ggj.hqbs.live.api.StreamApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.ggj.lottery.service.activity.redpacket.RedPacketService;


/**
 * Dubbo bean 2 Spring bean
 */
@Configuration
public class DubboBean2SpringBean {

    /**
     * 服务API依赖
     */
    @Reference(timeout = 10000, check = false)
    private LiveApi liveApi;

    @Reference(timeout = 10000, check = false)
    private RoomApi roomApi;

    @Reference(timeout = 10000, check = false)
    private StreamApi streamApi;

//    @Reference(timeout = 10000, check = false)
//    private RedPacketService redPacketService;

///////////////////////////Spring Bean///////////////////////////

    @Bean(name = "liveApi")
    public LiveApi getLiveApi() {
        return liveApi;
    }

    @Bean(name = "roomApi")
    public RoomApi getRoomApi() {
        return roomApi;
    }

    @Bean(name = "streamApi")
    public StreamApi getStreamApi() {
        return streamApi;
    }

//    @Bean(name = "redPacketService")
//    public RedPacketService getRedPacketService() {
//        return redPacketService;
//    }


}
