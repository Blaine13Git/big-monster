package com.muyi.bigMonster.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.daily1")
    public DataSourceProperties daily1DataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource daily1DataSource() {
        DataSourceProperties dataSourceProperties = daily1DataSourceProperties();
        System.out.println("daily1DataSource: " + dataSourceProperties.getUrl());
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.daily2drds")
    public DataSourceProperties daily2drdsDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource daily2drdsDataSource() {
        DataSourceProperties dataSourceProperties = daily2drdsDataSourceProperties();
        System.out.println("daily2drdsDataSource: " + dataSourceProperties.getUrl());
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }
}
