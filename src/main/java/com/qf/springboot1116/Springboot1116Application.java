package com.qf.springboot1116;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qf.springboot1116.mapper"})
public class Springboot1116Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1116Application.class, args);
    }

}
