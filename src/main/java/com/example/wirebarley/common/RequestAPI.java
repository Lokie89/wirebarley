package com.example.wirebarley.common;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class RequestAPI implements API<JSONObject> {

    private final String API_URL;
    private final JSONParser jsonParser = new JSONParser();
    private JSONObject jsonObject = null;

    public RequestAPI(String API_URL) {
        this.API_URL = API_URL;
    }

    @Override
    public void update() {
        HttpURLConnection con = null;
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        try {
            con = (HttpURLConnection) new URL(API_URL).openConnection();
            br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            jsonObject = (JSONObject) jsonParser.parse(sb.toString());

        } catch (IOException | ParseException e) {

        } finally {
            try {
                br.close();
                con.disconnect();
            } catch (IOException e) {

            }
        }
    }

    @Override
    public JSONObject get() {
        return jsonObject;
    }
}
