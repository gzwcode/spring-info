package com.gzw.action;

import com.gzw.api.FeignAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignAction {

    @Autowired
    private FeignAPI feignAPI;

    @GetMapping("/hi")
    public String helloWorld(String msg){
        return feignAPI.helloWorld(msg);
    }

}
