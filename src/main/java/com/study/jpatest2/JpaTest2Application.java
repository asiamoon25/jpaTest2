package com.study.jpatest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class JpaTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(JpaTest2Application.class, args);
    }

}
