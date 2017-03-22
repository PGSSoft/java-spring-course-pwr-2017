package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages = "com.example.*")
@EnableJpaRepositories(basePackages = {"com.example.*"})
@ComponentScan({"com.example.*"})
@EntityScan(basePackages = {"com.example.*"})

@ImportResource("classpath:beans.xml")
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    String weatherType() {
        return "weather type: ";
    }


    @Bean
    String otherWeatherType() {
        return "other weather type";
    }

    @Bean
    RestTemplate RestTemplate() {
        return new RestTemplateBuilder().build();
    }
}
