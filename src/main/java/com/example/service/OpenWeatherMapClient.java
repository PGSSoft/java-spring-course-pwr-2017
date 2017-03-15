package com.example.service;

import com.example.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenWeatherMapClient {
    private static final String QUERY_STRING = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";

    private static final String APP_ID = "25d2ccfb833e7fe68ff0272544b43116";

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeather(String city){
        WeatherResponse response=restTemplate.getForObject(String.format(QUERY_STRING,city,APP_ID),WeatherResponse.class);
        System.out.println(response);
        return response;
    }

}
