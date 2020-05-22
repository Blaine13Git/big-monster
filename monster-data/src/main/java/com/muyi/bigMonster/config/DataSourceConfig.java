package com.muyi.bigMonster.config;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

//@Configuration
public class DataSourceConfig {

//    @Bean
//    public void generateArtifacts() throws Exception {
//        List<String> warnings = new ArrayList<>();
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        org.mybatis.generator.config.Configuration config = cp.parseConfiguration(this.getClass().getResourceAsStream("/mybatis-generator.xml"));
//        DefaultShellCallback callback = new DefaultShellCallback(true);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        myBatisGenerator.generate(null);
//    }
}
