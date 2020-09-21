package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.TopicStateModel;
import com.connor.slump.service.TopicStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛帖子状态表、例如精华、置顶、推荐等 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/topicState")
public class TopicStateController extends BaseController<TopicStateModel> {

    @Autowired
    private TopicStateService topicStateService;

    @Override
    protected IService<TopicStateModel> getService() {
        return topicStateService;
    }
}

