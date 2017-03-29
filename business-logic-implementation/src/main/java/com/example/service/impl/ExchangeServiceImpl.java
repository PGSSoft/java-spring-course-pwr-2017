package com.example.service.impl;

import com.example.model.ExchangeModel;
import com.example.service.ExchangeClient;
import com.example.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by piotr on 22.03.17.
 */
@Service
public class ExchangeServiceImpl implements ExchangeService {

    @Autowired
    private ExchangeClient exchangeClient;

 //   @Override
    public ExchangeModel getExchange() {
        return exchangeClient.getExchange();
    }
}
