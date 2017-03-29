package com.example.controller;

import com.example.model.ExchangeModel;
import com.example.service.ExchangeService;
import com.example.service.OpenWeatherMapClient;
import com.example.service.impl.ExchangeServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by piotr on 28.03.17.
 */

@RunWith(MockitoJUnitRunner.class)
public class NewWeatherControllerTest {

    @Mock(answer = Answers.RETURNS_MOCKS)
    private ExchangeService exchangeService;

    @Mock
    private OpenWeatherMapClient weatherClient;


    @InjectMocks
    NewWeatherController sut;


    @Before
    public void setUP() {
    }


    @Test
    public void shouoldReturnWeather() {
        ExchangeModel model = sut.getExchange();
        Assert.assertNotNull(model);
    }
}
