package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherForecastController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }


}
