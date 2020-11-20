package com.example.wirebarley.model.rate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CurrencyCodeTest {

    @Test()
    void getCode() {
        Assert.assertThrows(CurrencyCodeException.class, () -> CurrencyCode.getCode("ABC"));
        Assert.assertEquals(CurrencyCode.USD, CurrencyCode.getCode("USD"));
    }
}