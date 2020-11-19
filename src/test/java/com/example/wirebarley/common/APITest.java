package com.example.wirebarley.common;

import com.example.wirebarley.common.api.DummyAPI;
import com.example.wirebarley.model.rate.CurrencyCode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class APITest {

    @Autowired
    DummyAPI<Double> dummyCurrencyAPI;

    @Test
    void apiTest1() {
        Assert.assertTrue(dummyCurrencyAPI.get(CurrencyCode.USD.name() + CurrencyCode.KRW.name()) == 1105.510487);
    }

}