package com.example.controller;

import com.example.model.MainResponse;
import com.example.model.WeatherResponse;
import com.example.service.OpenWeatherMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping("/forecast/{city}")
    public WeatherResponse getWeather(@PathVariable String city){
        return weatherClient.getWeather(city);
    }

    @RequestMapping("/forecast2/{city}")
    public ResponseEntity<WeatherResponse> getWeather2(@PathVariable String city){
        return new ResponseEntity(weatherClient.getWeather(city), HttpStatus.ACCEPTED);
    }

    @RequestMapping("/forecast3/{city}")
    public MainResponse getWeather3(@PathVariable String city){
        return weatherClient.getCoreWeather(city);
    }
}
