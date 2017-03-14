package com.example.service.impl;

import com.example.service.WeatherService;
import com.example.service.impl.conditions.LinuxCondition;
import com.example.service.impl.conditions.WindowsCondition;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by piotr on 14.03.17.
 */
@Conditional(value = WindowsCondition.class)
@Service("ugly")
public class UglyWeatherServiceImpl implements WeatherService {

    @Override
    public String getWeather() {
        return "It's rainy";
    }
}
