package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.DictModel;
import com.connor.slump.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 字典表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/dict")
public class DictController extends BaseController<DictModel> {

    @Autowired
    private DictService dictService;

    @Override
    protected IService<DictModel> getService() {
        return dictService;
    }
}

