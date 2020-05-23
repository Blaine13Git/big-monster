package com.muyi.bigMonster.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = {"com.muyi.bigMonster.mapper.daily2drds",}, sqlSessionFactoryRef = "daily2drdsSqlSessionFactory")
public class DataSource02Config {

    // 创建数据源
    @Bean(name = "daily2drdsDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.daily2drds")// 读取配置文件
    public DataSource daily2drdsDataSource() {
        return DataSourceBuilder.create().build();
    }

    // 创建session
    @Bean(name = "daily2drdsSqlSessionFactory")
    public SqlSessionFactory daily2drdsSqlSessionFactory(@Qualifier("daily2drdsDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    // 配置事务
    @Bean(name = "daily2drdsTransactionManager")
    public DataSourceTransactionManager daily2drdsTransactionManager(@Qualifier("daily2drdsDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    // 创建会话模版
    @Bean(name = "daily2drdsSqlSessionTemplate")
    public SqlSessionTemplate daily2drdsSqlSessionTemplate(@Qualifier("daily2drdsSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
