package com.gaofeng.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaofeng.gmall.bean.UserAddress;
import com.gaofeng.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Reference
    private UserService userService;

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(String userId) {
        return userService.findUserAddressByUserId(userId);
    }
}
