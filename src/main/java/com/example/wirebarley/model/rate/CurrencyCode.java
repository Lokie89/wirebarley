package com.example.wirebarley.model.rate;

import java.util.Arrays;

public enum CurrencyCode {
    USD,
    KRW,
    JPY,
    PHP,
    ;

    public static CurrencyCode getCode(String codeStr) {
        return Arrays.stream(CurrencyCode.values())
                .filter(currencyCode -> currencyCode.name().equals(codeStr))
                .findFirst()
                .orElseThrow(CurrencyCodeException::new)
                ;
    }
}
