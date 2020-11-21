package com.example.wirebarley.common.api;

public interface API {
    void request();
    <R> R get(Class<R> clazz, String key);
}
