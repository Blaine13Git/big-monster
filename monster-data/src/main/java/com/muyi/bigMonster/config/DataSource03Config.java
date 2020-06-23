package com.muyi.bigMonster.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = {"com.muyi.bigMonster.mapper.daily3",}, sqlSessionFactoryRef = "daily3SqlSessionFactory")
public class DataSource03Config {

    // 创建数据源
    @Bean(name = "daily3DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.daily3")// 读取配置文件
    public DataSource daily3DataSource() {
        return DataSourceBuilder.create().build();
    }

    // 创建session
    @Bean(name = "daily3SqlSessionFactory")
    public SqlSessionFactory daily3SqlSessionFactory(@Qualifier("daily3DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    // 配置事务
    @Bean(name = "daily3TransactionManager")
    public DataSourceTransactionManager daily3TransactionManager(@Qualifier("daily3DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    // 创建会话模版
    @Bean(name = "daily3SqlSessionTemplate")
    public SqlSessionTemplate daily3SqlSessionTemplate(@Qualifier("daily3SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
