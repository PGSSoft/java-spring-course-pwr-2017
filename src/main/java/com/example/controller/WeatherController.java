package com.example.controller;

import com.example.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by piotr on 14.03.17.
 */
@RestController
@RequestMapping("/api")
public class WeatherController {

    @Autowired
    private WeatherService watherCondition;

    @RequestMapping("/weather/cute")
    public String getCuteWeather() {
        return watherCondition.getWeather();
    }

    @RequestMapping("/weather/ugly")
    public String getUglyWeather() {
        return watherCondition.getWeather();
    }
}
