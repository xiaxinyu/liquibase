package com.xiaxinyu.liquibase;

import liquibase.configuration.LiquibaseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquibaseApplication {
    public static void main(String[] args) {
        //LiquibaseConfiguration
        SpringApplication.run(LiquibaseApplication.class, args);
    }
}
