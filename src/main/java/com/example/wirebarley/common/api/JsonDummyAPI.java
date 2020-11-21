package com.example.wirebarley.common.api;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public abstract class JsonDummyAPI implements API {

    private final JSONParser jsonParser = new JSONParser();
    private JSONObject jsonObject = null;

    final String dummy;

    public JsonDummyAPI(String dummy) {
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
    public <R> R get(Class<R> clazz, String key) {
        return clazz.cast(jsonObject.get(key));
    }

}
