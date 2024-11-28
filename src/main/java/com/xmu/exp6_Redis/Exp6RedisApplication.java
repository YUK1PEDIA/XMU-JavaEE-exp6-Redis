package com.xmu.exp6_Redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Exp6RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Exp6RedisApplication.class, args);
    }

}
