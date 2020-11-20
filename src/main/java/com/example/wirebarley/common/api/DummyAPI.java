package com.example.wirebarley.common.api;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public abstract class DummyAPI implements API {

    private final JSONParser jsonParser = new JSONParser();
    private JSONObject jsonObject = null;

    final String dummy;

    public DummyAPI(String dummy) {
        this.dummy = dummy;
    }

    @Override
    public void generate() {
        try {
            jsonObject = (JSONObject) jsonParser.parse(dummy);
        } catch (ParseException e) {

        }
    }

    @Override
    public <R> R get(Class<R> clazz, String... keys) {
        for (int i = 0; i < keys.length - 1; i++) {
            final String key = keys[i];
            if (jsonObject == null) {
                throw new RuntimeException();
            }
            jsonObject = (JSONObject) jsonObject.get(key);
        }
        return clazz.cast(jsonObject.get(keys[keys.length - 1]));
    }

}
