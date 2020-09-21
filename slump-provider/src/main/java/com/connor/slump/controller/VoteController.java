package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.VoteModel;
import com.connor.slump.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛投票帖子 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/vote")
public class VoteController extends BaseController<VoteModel> {

    @Autowired
    private VoteService voteService;

    @Override
    protected IService<VoteModel> getService() {
        return voteService;
    }
}

