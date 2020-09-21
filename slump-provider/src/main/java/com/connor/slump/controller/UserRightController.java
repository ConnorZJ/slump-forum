package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.UserRightModel;
import com.connor.slump.service.UserRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 用户权限表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/userRight")
public class UserRightController extends BaseController<UserRightModel> {

    @Autowired
    private UserRightService userRightService;

    @Override
    protected IService<UserRightModel> getService() {
        return userRightService;
    }
}

