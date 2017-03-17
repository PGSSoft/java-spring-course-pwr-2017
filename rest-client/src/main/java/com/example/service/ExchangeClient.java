package com.example.service;


import com.example.model.ExchangeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ExchangeClient {

    private String url = "http://api.fixer.io/latest?symbols=USD,GBP&base=PLN";

    @Autowired
    private RestTemplate rest;

    public ExchangeModel getExchange() {
        return rest.getForObject(url, ExchangeModel.class);
    }
}
