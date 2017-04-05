package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Currency;

/**
 * Created by piotr on 07.03.17.
 */
@RestController
@RequestMapping("/api/v2")
public class CurrencyExchangeController {

    public CurrencyExchangeController(){

    }

    @RequestMapping("/{number}")
    public Long multiplyByFive(@PathVariable Long number){
      return number*5;
    }

    @RequestMapping("/currency/{value}/")
    public String addCurrencySignature(@PathVariable Long value,
                                       @RequestParam("currency") String currency){
        return value.toString()+currency;
    }

    @RequestMapping("/multiplier/{value}/{multiplier}")
    public String currencyMultiplier(@RequestParam("from") String from,
                                     @RequestParam("to") String to,
                                    @PathVariable Long value,
                                     @PathVariable Long multiplier) {
        try {
            Currency currencyFrom = Currency.getInstance(from);
            Currency currencyTo = Currency.getInstance(to);
            return value + " " + from + " equals " + value*multiplier  + " " + to;
        } catch (IllegalArgumentException e){
            throw new RuntimeException("Something went wrong");
        }

    }
}
