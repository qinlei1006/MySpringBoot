package com.example.springboots;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//自定义DAO交给mybaits
@MapperScan("com.example.springboots.dao")
@SpringBootApplication
public class SpringbootsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsApplication.class, args);
    }

}
