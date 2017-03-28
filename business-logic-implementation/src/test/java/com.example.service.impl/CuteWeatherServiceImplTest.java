package com.example.service.impl;

/**
 * Created by piotr on 28.03.17.
 */
public class CuteWeatherServiceImplTest {

    @org.junit.Test
    public void shouldReturnValue(){
        new CuteWeatherServiceImpl().getWeather();
    }

}
