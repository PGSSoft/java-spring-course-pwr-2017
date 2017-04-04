package com.example.service.impl;


import com.example.model.MainResponse;
import com.example.model.WeatherResponse;
import com.example.repository.WeatherRepository;
import com.example.service.OpenWeatherMapClient;
import com.example.service.WeatherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

@RunWith(MockitoJUnitRunner.class)
public class WeatherServiceImplTest {


    @Mock
    private OpenWeatherMapClient weatherMapClient;

    @Mock
    private WeatherRepository repository;

    @InjectMocks
    WeatherService sut = new WeatherServiceImpl();


    @Test
    public void shouldFetchDataWhenInvokingClient(){
        WeatherResponse toReturn = new WeatherResponse();
        MainResponse main = new MainResponse();
        main.setTemp(343.0);
        main.setPressure(999.0);
        toReturn.setMain(main);
        Mockito.when(weatherMapClient.getWeather("Warsaw")).thenReturn(toReturn);


        WeatherResponse response=sut.getWeather("Warsaw");
        org.junit.Assert.assertTrue(response.getMain().getTemp().equals(343.0));
    }
}
