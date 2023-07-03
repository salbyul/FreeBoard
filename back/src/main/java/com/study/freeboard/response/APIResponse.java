package com.study.freeboard.response;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
public class APIResponse {

    private final LocalDateTime timestamp;
    private final Map<String, Object> body = new HashMap<>();

    private APIResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public static APIResponse generateResponse() {
        return new APIResponse();
    }

    public APIResponse addData(String key, Object value) {
        this.body.put(key, value);
        return this;
    }
}
