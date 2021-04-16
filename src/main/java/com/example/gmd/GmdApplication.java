package com.example.gmd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.gmd.Mapper")
@SpringBootApplication
public class GmdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmdApplication.class, args);
    }

}
