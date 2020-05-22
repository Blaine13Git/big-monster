package com.muyi.bigMonster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

@SpringBootApplication(
        scanBasePackages = {"com.muyi.bigMonster"},
        exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, JdbcTemplateAutoConfiguration.class}
)
@MapperScan("com.muyi.bigMonster.mapper")
public class BigMonsterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigMonsterApplication.class, args);
    }

}
