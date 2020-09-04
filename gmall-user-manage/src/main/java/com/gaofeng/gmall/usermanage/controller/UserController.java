package com.gaofeng.gmall.usermanage.controller;


import com.gaofeng.gmall.bean.UserInfo;
import com.gaofeng.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll() {
        return userService.findAll();
    }
}
