package com.gaofeng.gmall.usermanage.service.impl;

import com.gaofeng.gmall.bean.UserInfo;
import com.gaofeng.gmall.service.UserService;
import com.gaofeng.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
