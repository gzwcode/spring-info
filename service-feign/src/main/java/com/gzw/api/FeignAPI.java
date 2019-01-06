package com.gzw.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-one" ,fallback = FeignAPIFallBack.class)
public interface FeignAPI {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String helloWorld(@RequestParam("msg") String msg);

}
