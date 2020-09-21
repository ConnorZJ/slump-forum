package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.ReplyModel;
import com.connor.slump.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛帖子回复表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/reply")
public class ReplyController extends BaseController<ReplyModel> {

    @Autowired
    private ReplyService replyService;

    @Override
    protected IService<ReplyModel> getService() {
        return replyService;
    }
}

