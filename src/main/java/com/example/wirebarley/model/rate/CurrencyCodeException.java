package com.example.wirebarley.model.rate;

public class CurrencyCodeException extends RuntimeException {
    final String message = "사용할 수 없는 코드입니다.";
    @Override
    public String getMessage() {
        return message;
    }
}
