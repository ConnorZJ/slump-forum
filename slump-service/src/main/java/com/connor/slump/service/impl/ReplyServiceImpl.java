package com.connor.slump.service.impl;

import com.connor.slump.model.ReplyModel;
import com.connor.slump.dao.ReplyDao;
import com.connor.slump.service.ReplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛帖子回复表 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class ReplyServiceImpl extends ServiceImpl<ReplyDao, ReplyModel> implements ReplyService {

}
