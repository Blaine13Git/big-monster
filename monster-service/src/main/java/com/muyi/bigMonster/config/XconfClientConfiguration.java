package com.muyi.bigMonster.config;

import com.ggj.platform.xconf.client.entry.connection.XconfClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class XconfClientConfiguration {

    @Bean(name = "xconfClient", initMethod = "init")
    public XconfClient xconfClient() {
        XconfClient xconfClient = new XconfClient();
        xconfClient.setZkAddrsPropKey("xconf.address");
//        log.info("Xconf获取zk地址");
        return xconfClient;
    }

}
