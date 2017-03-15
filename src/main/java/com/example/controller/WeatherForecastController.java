package com.example.controller;

import com.example.model.WeatherResponse;
import com.example.service.OpenWeatherMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherForecastController {

    @Autowired
    OpenWeatherMapClient weatherClient;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @RequestMapping("/weather/{city}")
    public WeatherResponse getWeather(@PathVariable String city){
        return weatherClient.getWeather(city);
    }


}
