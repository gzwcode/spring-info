package com.gzw.service;

import com.gzw.bean.UserInfo;
import com.gzw.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfoById(Integer userId) {
        return userInfoDao.getUserInfoById(userId);
    }
}
