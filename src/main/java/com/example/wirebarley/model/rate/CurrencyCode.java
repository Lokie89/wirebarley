package com.example.wirebarley.model.rate;

import java.util.Arrays;

public enum CurrencyCode {
    USD,
    KRW,
    JPY,
    PHP,
    ;

    public static CurrencyCode getState(String code) {
        return Arrays.stream(CurrencyCode.values())
                .filter(currencyCode -> currencyCode.name().equals(code))
                .findFirst()
                .orElse(null)
                ;
    }
}
