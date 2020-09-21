package com.connor.slump.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.model.AttachmentDownloadModel;
import com.connor.slump.service.AttachmentDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 论坛附件下载表 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Controller
@RequestMapping("/attachmentDownload")
public class AttachmentDownloadController extends BaseController<AttachmentDownloadModel> {

    @Autowired
    private AttachmentDownloadService attachmentDownloadService;

    @Override
    protected IService<AttachmentDownloadModel> getService() {
        return attachmentDownloadService;
    }
}

