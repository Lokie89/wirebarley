package com.example.wirebarley.common.api;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

@Component(value = "currencyAPI")
public class CurrencyAPI extends RequestAPI {
    private static final String API_URL = "http://api.currencylayer.com/live?access_key=63c18a0666d7f4863dff12ef4470a769&format=1";

    public CurrencyAPI() {
        super(API_URL);
    }

    //    @Scheduled(cron = "* 0/10 * * * *")
    public void generateScheduled() {
        generate();
    }

    @Override
    public <R> R get(Class<R> clazz, String key) {
        generate(); // Scheduled 사용하면 삭제
        JSONObject jsonObject = super.get(JSONObject.class,"quotes");
        return clazz.cast(jsonObject.get(key));
    }

}
