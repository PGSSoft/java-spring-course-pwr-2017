package com.example.service;

import com.example.model.MainResponse;
import com.example.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

@Service
public class OpenWeatherMapClient {
    private static final String QUERY_STRING = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";

    private static final String APP_ID = "25d2ccfb833e7fe68ff0272544b43116";

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeather(String city) {
        WeatherResponse response = restTemplate.getForObject(getFormat(city), WeatherResponse.class);
        System.out.println(response);
        return response;
    }

    public MainResponse getCoreWeather(String city) {
        Map<String, Object> response = restTemplate.getForObject(getFormat(city), HashMap.class);
        System.out.println(response.get("main"));
        Gson gson = new Gson();
        return gson.fromJson(gson.toJson(response.get("main")), MainResponse.class);

    }

    private String getFormat(String city) {
        return String.format(QUERY_STRING, city, APP_ID);
    }

}
