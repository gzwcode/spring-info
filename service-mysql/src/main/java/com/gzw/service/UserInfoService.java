package com.gzw.service;

import com.gzw.bean.UserInfo;

public interface UserInfoService {
    UserInfo getUserInfoById(Integer userId);

    Integer addUserInfo(UserInfo userInfo);
}
