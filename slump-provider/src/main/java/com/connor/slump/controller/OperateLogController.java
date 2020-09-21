package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.OperateLogModel;
import com.connor.slump.service.OperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 操作日志 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/operateLog")
public class OperateLogController extends BaseController<OperateLogModel> {

    @Autowired
    private OperateLogService operateLogService;

    @Override
    protected IService<OperateLogModel> getService() {
        return operateLogService;
    }
}

