package com.example.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//RedisFlushMode有两个参数：ON_SAVE（表示在response commit前刷新缓存），IMMEDIATE（表示只要有更新，就刷新缓存）
@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 1800, redisFlushMode = RedisFlushMode.ON_SAVE, redisNamespace = "myproject")
@EnableDubboConfig
@DubboComponentScan(basePackages = "com.example.consumer.controller")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
