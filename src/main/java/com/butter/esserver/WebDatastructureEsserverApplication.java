package com.butter.esserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WebDatastructureEsserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebDatastructureEsserverApplication.class, args);
    }

}
