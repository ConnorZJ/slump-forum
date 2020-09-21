package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.ManageModel;
import com.connor.slump.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛版本权限功能表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/manage")
public class ManageController extends BaseController<ManageModel> {

    @Autowired
    private ManageService manageService;

    @Override
    protected IService<ManageModel> getService() {
        return manageService;
    }
}

