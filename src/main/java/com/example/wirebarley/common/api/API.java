package com.example.wirebarley.common.api;

public interface API {
    void generate();
    <R> R get(Class<R> clazz, String key);
}
