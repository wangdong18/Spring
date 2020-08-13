package com.spring.boot.manual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ManualApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManualApplication.class, args);
    }

}
