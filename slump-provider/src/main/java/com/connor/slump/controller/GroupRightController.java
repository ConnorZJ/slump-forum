package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.GroupRightModel;
import com.connor.slump.service.GroupRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 权限组的权限表-组对应有哪些功能 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/groupRight")
public class GroupRightController extends BaseController<GroupRightModel> {

    @Autowired
    private GroupRightService groupRightService;

    @Override
    protected IService<GroupRightModel> getService() {
        return groupRightService;
    }
}

