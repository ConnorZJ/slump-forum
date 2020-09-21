package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.UserModel;
import com.connor.slump.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛用户表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController<UserModel> {
    @Autowired
    private UserService userService;

    @Override
    protected IService<UserModel> getService() {
        return userService;
    }
}

