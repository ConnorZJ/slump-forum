package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.VoteUserModel;
import com.connor.slump.service.VoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 投票帖的投票用户 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/voteUser")
public class VoteUserController extends BaseController<VoteUserModel> {

    @Autowired
    private VoteUserService voteUserService;

    @Override
    protected IService<VoteUserModel> getService() {
        return voteUserService;
    }
}

