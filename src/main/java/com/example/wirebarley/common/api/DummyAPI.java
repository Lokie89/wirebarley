package com.example.wirebarley.common.api;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public abstract class DummyAPI<R> implements API<JSONObject> {

    private final JSONParser jsonParser = new JSONParser();
    private JSONObject jsonObject = null;

    final String dummy;

    public DummyAPI(String dummy) {
        this.dummy = dummy;
    }

    @Override
    public void update() {
        try {
            jsonObject = (JSONObject) jsonParser.parse(dummy);
        } catch (ParseException e) {

        }
    }

    @Override
    public JSONObject get() {
        return jsonObject;
    }

    public abstract R get(String key);
}
