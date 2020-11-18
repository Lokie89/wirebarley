package com.example.wirebarley.model.rate;

import com.example.wirebarley.common.CurrencyAPI;
import lombok.Getter;

@Getter
public class ExchangeRate {
    private CurrencyCode transferCurrencyCode;
    private CurrencyCode receiveCurrencyCode;
    private double rate;

    public ExchangeRate(CurrencyCode transferCurrencyCode, CurrencyCode receiveCurrencyCode) {
        this.transferCurrencyCode = transferCurrencyCode;
        this.receiveCurrencyCode = receiveCurrencyCode;
        rate = new CurrencyAPI().getRate(transferCurrencyCode.name() + receiveCurrencyCode.name());
    }

}
