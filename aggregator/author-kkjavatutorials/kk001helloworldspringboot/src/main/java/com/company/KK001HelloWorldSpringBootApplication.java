package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KK001HelloWorldSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KK001HelloWorldSpringBootApplication.class, args);
    }
}