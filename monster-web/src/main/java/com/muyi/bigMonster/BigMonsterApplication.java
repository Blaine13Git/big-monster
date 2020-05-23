package com.muyi.bigMonster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.muyi.bigMonster",})
public class BigMonsterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigMonsterApplication.class, args);
    }

}
