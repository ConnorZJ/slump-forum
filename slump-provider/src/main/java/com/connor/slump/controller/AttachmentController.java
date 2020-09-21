package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.AttachmentModel;
import com.connor.slump.service.AttachmentService;
import com.sun.xml.internal.ws.api.message.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛附件表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/attachment")
public class AttachmentController extends BaseController<AttachmentModel> {

    @Autowired
    private AttachmentService attachmentService;

    @Override
    protected IService<AttachmentModel> getService() {
        return attachmentService;
    }
}

