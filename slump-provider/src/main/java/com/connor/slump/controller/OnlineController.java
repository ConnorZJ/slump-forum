package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.OnlineModel;
import com.connor.slump.service.OnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛在线用户表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/online")
public class OnlineController extends BaseController<OnlineModel> {

    @Autowired
    private OnlineService onlineService;

    @Override
    protected IService<OnlineModel> getService() {
        return onlineService;
    }
}

