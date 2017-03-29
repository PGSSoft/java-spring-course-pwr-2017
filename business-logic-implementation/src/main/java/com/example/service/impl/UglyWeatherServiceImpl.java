package com.example.service.impl;

import com.example.service.WeatherService;
import org.springframework.stereotype.Service;

/**
 * Created by piotr on 14.03.17.
 */
@Service("ugly")
public class UglyWeatherServiceImpl implements WeatherService {

  //  @Override
    public String getWeather() {
        return "It's rainy";
    }
}
