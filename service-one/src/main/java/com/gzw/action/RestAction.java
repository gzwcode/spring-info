package com.gzw.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAction {


    @GetMapping("/hi")
    public String helloWorld(String msg) {
        return "service-one receiver msg : " + msg;
    }

}
