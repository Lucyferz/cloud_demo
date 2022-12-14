package org.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain7001.class, args);
    }
}
