package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.VoteItemModel;
import com.connor.slump.service.VoteItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛投票帖的投票项 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/voteItem")
public class VoteItemController extends BaseController<VoteItemModel> {

    @Autowired
    private VoteItemService voteItemService;

    @Override
    protected IService<VoteItemModel> getService() {
        return voteItemService;
    }
}

