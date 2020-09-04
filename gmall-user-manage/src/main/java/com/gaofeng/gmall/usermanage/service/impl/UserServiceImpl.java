package com.gaofeng.gmall.usermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaofeng.gmall.bean.UserAddress;
import com.gaofeng.gmall.bean.UserInfo;
import com.gaofeng.gmall.service.UserService;
import com.gaofeng.gmall.usermanage.mapper.UserAddressMapper;
import com.gaofeng.gmall.usermanage.mapper.UserInfoMapper;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> findUserAddressByUserId(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        List<UserAddress> userAddressList = userAddressMapper.select(userAddress);

        return userAddressList;
    }
}
