package com.example.wirebarley.model.rate;

import com.example.wirebarley.common.api.API;
import lombok.Getter;

@Getter
public class ExchangeRate {
    private CurrencyCode transferCurrencyCode;
    private CurrencyCode receiveCurrencyCode;
    private double rate;

    private ExchangeRate(API api, CurrencyCode transferCurrencyCode, CurrencyCode receiveCurrencyCode) {
        this.transferCurrencyCode = transferCurrencyCode;
        this.receiveCurrencyCode = receiveCurrencyCode;
        rate = api.get(Double.class, transferCurrencyCode.name() + receiveCurrencyCode.name());
    }

    public static ExchangeRate of(API api, CurrencyCode transferCurrencyCode, CurrencyCode receiveCurrencyCode) {
        return new ExchangeRate(api, transferCurrencyCode, receiveCurrencyCode);
    }

}
