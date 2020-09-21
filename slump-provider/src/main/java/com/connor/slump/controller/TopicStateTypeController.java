package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.TopicStateTypeModel;
import com.connor.slump.service.TopicStateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛帖子状态分类 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/topicStateType")
public class TopicStateTypeController extends BaseController<TopicStateTypeModel> {

    @Autowired
    private TopicStateTypeService topicStateTypeService;

    @Override
    protected IService<TopicStateTypeModel> getService() {
        return topicStateTypeService;
    }
}

