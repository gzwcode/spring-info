package com.gzw;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gzw.dao")
public class ServiceMysqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceMysqlApplication.class,args);
    }
}
