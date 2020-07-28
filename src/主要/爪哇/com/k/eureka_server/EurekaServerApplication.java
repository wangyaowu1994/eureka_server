package com.cykj.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    //姓名更新
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
