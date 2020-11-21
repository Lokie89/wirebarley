package com.example.wirebarley.controller;

import com.example.wirebarley.common.api.API;
import com.example.wirebarley.model.rate.CurrencyCode;
import com.example.wirebarley.model.rate.ExchangeRate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExchangeRateController {

    private final API api;

    public ExchangeRateController(API exchangeRateDummyAPI) {
        this.api = exchangeRateDummyAPI;
    }

    @GetMapping(value = "/exchangeRate")
    @ResponseBody
    public ResponseEntity<ExchangeRate> rate(@RequestParam String transfer, @RequestParam String receive) {
        final String transferUppercase = transfer.toUpperCase();
        final String receiveUppercase = receive.toUpperCase();
        CurrencyCode transferCurrencyCode = CurrencyCode.getCode(transferUppercase);
        CurrencyCode receiveCurrencyCode = CurrencyCode.getCode(receiveUppercase);
        return new ResponseEntity<>(ExchangeRate.of(api, transferCurrencyCode, receiveCurrencyCode), HttpStatus.OK);
    }

    @GetMapping(value = "/home")
    public void home() {

    }

}
