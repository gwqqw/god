package com.future.god;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.future.god.dao")
public class GodApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication();
        app.setBannerMode((Banner.Mode.OFF));
        app.run(GodApplication.class, args);

//        new SpringApplicationBuilder()
//                .sources(GodApplication.class)
//                .child(GodApplication.class)
//                .bannerMode(Banner.Mode.OFF)
//                .run(args);
    }
}
