package com.example.wirebarley.common;

import org.json.simple.JSONObject;

public class CurrencyAPI extends DummyAPI {
    private static final String API_URL = "http://api.currencylayer.com/live?access_key=63c18a0666d7f4863dff12ef4470a769&format=1";

    public CurrencyAPI() {
        super(API_URL);
    }

    //    @Scheduled(cron = "* 0/10 * * * *")
    public void updateScheduled() {
        update();
    }

    public Double getRate(String stateCode) {
        update(); // Scheduled 사용할 경우 삭제
        JSONObject jsonObject = (JSONObject) get().get("quotes");
        return Double.parseDouble(jsonObject.get(stateCode).toString());
    }

}
