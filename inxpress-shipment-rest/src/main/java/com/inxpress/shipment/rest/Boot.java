package com.inxpress.shipment.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.inxpress.shipment")
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }
}
