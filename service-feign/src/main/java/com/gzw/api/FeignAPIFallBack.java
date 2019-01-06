package com.gzw.api;

import org.springframework.stereotype.Component;

@Component
public class FeignAPIFallBack implements FeignAPI {

    @Override
    public String helloWorld(String msg) {
        return "SORRY ERROR"+ msg;
    }
}
