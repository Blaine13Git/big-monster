package com.muyi.bigMonster.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = {"com.muyi.bigMonster.mapper",}, sqlSessionFactoryRef = "daily1SqlSessionFactory")
public class DataSource01Config {

    // 读取配置文件
    @Primary
    @Bean(name = "daily1DataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.daily1")
    public DataSourceProperties daily1DataSourceProperties() {
        return new DataSourceProperties();
    }

    // 创建数据源
    @Primary
    @Bean(name = "daily1DataSource")
    public DataSource daily1DataSource(@Qualifier("daily1DataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    // 创建session
    @Primary
    @Bean(name = "daily1SqlSessionFactory")
    public SqlSessionFactory daily1SqlSessionFactory(@Qualifier("daily1DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    // 配置事务
    @Primary
    @Bean(name="daily1TransactionManager")
    public DataSourceTransactionManager daily1TransactionManager(@Qualifier("daily1DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name="daily1SqlSessionTemplate")
    public SqlSessionTemplate daily1SqlSessionTemplate(@Qualifier("daily1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
