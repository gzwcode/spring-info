package com.gzw.dao;

import com.gzw.bean.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {
    UserInfo getUserInfoById(Integer userId);

    Integer addUserInfo(UserInfo userInfo);
}
