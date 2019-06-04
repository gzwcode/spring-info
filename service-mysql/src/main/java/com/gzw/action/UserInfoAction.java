package com.gzw.action;

import com.gzw.bean.UserInfo;
import com.gzw.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoAction {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/userInfo/getUserInfoById")
    public UserInfo getUserInfoById(@RequestParam("userId")Integer userId){
        return userInfoService.getUserInfoById(userId);
    }
}
