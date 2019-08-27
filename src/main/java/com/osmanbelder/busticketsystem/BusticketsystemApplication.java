package com.osmanbelder.busticketsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class BusticketsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusticketsystemApplication.class, args);
    }

}
