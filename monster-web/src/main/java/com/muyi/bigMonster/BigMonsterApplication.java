package com.muyi.bigMonster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.muyi.bigMonster"})
@MapperScan("com.muyi.bigMonster.mapper")
public class BigMonsterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigMonsterApplication.class, args);
    }

}
