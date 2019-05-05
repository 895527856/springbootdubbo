package com.example.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.example.provider.dao")
public class ProviderApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ProviderApplication.class, args);
        new SpringApplicationBuilder(ProviderApplication.class).web(WebApplicationType.NONE).run(args);
    }

}
