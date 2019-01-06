package com.gzw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceOneApplication.class,args);
    }
}
