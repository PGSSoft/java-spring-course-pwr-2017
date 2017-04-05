package com.example;

import com.example.entity.Weather;
import com.example.repository.WeatherRepository;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class, loader = AnnotationConfigContextLoader.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@DatabaseSetup("/weather/localWeather.xml")
public class WeatherRepositoryTest {


    @Autowired
    private WeatherRepository repository;


    @Test
    public void shouldReadAllRecordsWhenCounting() {
        Assert.assertEquals(5L, repository.count());
    }


    @Test
    public void shouldReadById() {
        Weather found = repository.findOne(5L);
        Assert.assertTrue(Double.valueOf(-11).equals(found.getTemp()));
    }
}