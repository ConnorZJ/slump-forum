package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.TopicModel;
import com.connor.slump.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛帖子表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/topic")
public class TopicController extends BaseController<TopicModel> {

    @Autowired
    private TopicService topicService;

    @Override
    protected IService<TopicModel> getService() {
        return topicService;
    }
}

