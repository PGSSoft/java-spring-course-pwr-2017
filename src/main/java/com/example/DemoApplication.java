package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        System.getProperties().put(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "uglyProfile");
        SpringApplication.run(DemoApplication.class, args);
    }
}
