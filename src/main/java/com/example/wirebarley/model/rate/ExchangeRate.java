package com.example.wirebarley.model.rate;

import com.example.wirebarley.common.api.DummyAPI;
import lombok.Getter;

@Getter
public class ExchangeRate {
    private CurrencyCode transferCurrencyCode;
    private CurrencyCode receiveCurrencyCode;
    private double rate;

    public ExchangeRate(DummyAPI api, CurrencyCode transferCurrencyCode, CurrencyCode receiveCurrencyCode) {
        this.transferCurrencyCode = transferCurrencyCode;
        this.receiveCurrencyCode = receiveCurrencyCode;
        rate = (Double) api.get(transferCurrencyCode.name() + receiveCurrencyCode.name());
    }

}
