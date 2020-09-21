package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.SpecialModel;
import com.connor.slump.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛帖子专题分类表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/special")
public class SpecialController extends BaseController<SpecialModel> {

    @Autowired
    private SpecialService specialService;

    @Override
    protected IService<SpecialModel> getService() {
        return specialService;
    }
}

