package com.example.providertwo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.example.providertwo.dao")
public class ProvidertwoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ProvidertwoApplication.class, args);
        new SpringApplicationBuilder(ProvidertwoApplication.class).web(WebApplicationType.NONE).run(args);
    }

}
