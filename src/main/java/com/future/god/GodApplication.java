package com.future.god;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.future.god.dao")
public class GodApplication {

    public static void main(String[] args) {
        SpringApplication.run(GodApplication.class, args);
    }

}
