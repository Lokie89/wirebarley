package com.example.wirebarley.controller;

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

    @GetMapping(value = "/exchangeRate")
    @ResponseBody
    public ResponseEntity<ExchangeRate> rate(@RequestParam String transfer, @RequestParam String receive) {
        CurrencyCode transferCurrencyCode = CurrencyCode.getState(transfer);
        CurrencyCode receiveCurrencyCode = CurrencyCode.getState(receive);
        return new ResponseEntity<>(new ExchangeRate(transferCurrencyCode, receiveCurrencyCode), HttpStatus.OK);
    }

    @GetMapping(value = "/home")
    public void home() {

    }

}
