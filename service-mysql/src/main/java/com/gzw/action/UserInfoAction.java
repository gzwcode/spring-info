package com.gzw.action;

import com.gzw.bean.ResultVO;
import com.gzw.bean.UserInfo;
import com.gzw.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


    @PostMapping("/userInfo/addUserInfo")
    public ResultVO addUserInfo(@RequestBody UserInfo userInfo){
        userInfoService.addUserInfo(userInfo);
        return ResultVO.success();
    }



}
