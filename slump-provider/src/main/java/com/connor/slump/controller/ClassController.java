package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.ClassModel;
import com.connor.slump.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛板块分类 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/class")
public class ClassController extends BaseController<ClassModel> {

    @Autowired
    private ClassService classService;

    @Override
    protected IService<ClassModel> getService() {
        return classService;
    }
}

