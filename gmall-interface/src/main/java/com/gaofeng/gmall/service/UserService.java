package com.gaofeng.gmall.service;


import com.gaofeng.gmall.bean.UserAddress;
import com.gaofeng.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    //查询所有用户
    List<UserInfo> findAll();

    //根据客户ID查询客户地址
    List<UserAddress> findUserAddressByUserId(String userId);
}
