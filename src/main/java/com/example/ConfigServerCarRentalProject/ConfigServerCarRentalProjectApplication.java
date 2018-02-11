package com.example.ConfigServerCarRentalProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerCarRentalProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerCarRentalProjectApplication.class, args);
    }
}
