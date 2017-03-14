package com.example.service.impl;

import com.example.service.WeatherService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by piotr on 14.03.17.
 */
@Profile("cuteProfile")
@Service("cute")
public class CuteWeatherServiceImpl implements WeatherService {

    @Override
    public String getWeather() {
        return "It's shiny";
    }
}
