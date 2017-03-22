package com.example.controller;

import com.example.model.ExchangeModel;

import com.example.model.WeatherParams;
import com.example.model.WeatherResponse;
import com.example.service.ExchangeService;
import com.example.service.OpenWeatherMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/newapi")
public class NewWeatherController {


    @Autowired
    private ExchangeService exchangeService;

    @Autowired
    private OpenWeatherMapClient weatherClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam(name = "imie", required = false, defaultValue = "stranger") String name) {
        return "hello " + name;
    }

    @RequestMapping("/weather")
    WeatherParams getWeather(@Validated WeatherParams params) {
        params.setCurrent(false);
        return params;
    }

    @RequestMapping(value = "/weather", method = RequestMethod.POST)
    WeatherParams getWeatherPost(@RequestBody WeatherParams params) {
        params.setCurrent(false);
        return params;
    }

    @RequestMapping(value = "/status", method = RequestMethod.POST)
    ResponseEntity<WeatherParams> getWeatherStatus(@RequestBody WeatherParams params) {
        params.setCurrent(false);
        return new ResponseEntity(params, HttpStatus.CREATED);
    }

    @RequestMapping("/currency")
    public ExchangeModel getExchange() {
        return exchangeService.getExchange();
    }

    @RequestMapping("/forecast/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherClient.getWeather(city);
    }

}
