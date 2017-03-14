package com.example.controller;

import com.example.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by piotr on 14.03.17.
 */
@RestController
@RequestMapping("/api")
public class WeatherController {

    @Autowired
    private Collection<WeatherService> weatherServices;

    @Autowired
    @Qualifier("xmlBean")
    private String myBean;


    @RequestMapping("/weather")
    public List<String> allWeathers() {
        List<String> result = new ArrayList<String>();
        weatherServices.forEach(((x)->result.add(x.getWeather())));
        result.add(myBean);
        return result;
    }

}
