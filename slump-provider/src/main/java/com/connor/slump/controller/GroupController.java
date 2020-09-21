package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.GroupModel;
import com.connor.slump.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛权限组 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/group")
public class GroupController extends BaseController<GroupModel> {

    @Autowired
    private GroupService groupService;

    @Override
    protected IService<GroupModel> getService() {
        return groupService;
    }
}

