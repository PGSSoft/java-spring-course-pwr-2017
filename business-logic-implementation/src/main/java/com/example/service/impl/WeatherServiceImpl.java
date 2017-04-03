package com.example.service.impl;

import com.example.entity.Weather;
import com.example.model.WeatherResponse;
import com.example.repository.WeatherRepository;
import com.example.service.OpenWeatherMapClient;
import com.example.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by piotr on 03.04.17.
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private OpenWeatherMapClient weatherMapClient;

    @Autowired
    private WeatherRepository repository;

    @Override
    public String getWeather() {
        return null;
    }

    @Override
    public WeatherResponse getWeather(String city) {
        WeatherResponse response = weatherMapClient.getWeather(city);
        Weather w = new Weather();
        w.setCity(city);
        w.setPressure(response.getMain().getPressure());
        w.setTemp(response.getMain().getTemp());
        repository.save(w);
        return response;
    }
}
