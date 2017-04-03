package com.example.service;


import com.example.model.WeatherResponse;

/**
 * Created by piotr on 14.03.17.
 */
public interface WeatherService {

    String getWeather();

    WeatherResponse getWeather(String city);
}
