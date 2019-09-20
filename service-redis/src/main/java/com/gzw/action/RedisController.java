package com.gzw.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {


    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/get")
    public String getValue(@RequestParam("key") String key) {
        return redisTemplate.opsForValue().get(key);
    }


    @GetMapping("/set")
    public void setValue(@RequestParam("key") String key,@RequestParam("value")String value) {
        redisTemplate.opsForValue().set(key,value);
    }




}
