package com.connor.slump.service.impl;

import com.connor.slump.model.TopicModel;
import com.connor.slump.dao.TopicDao;
import com.connor.slump.service.TopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛帖子表 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class TopicServiceImpl extends ServiceImpl<TopicDao, TopicModel> implements TopicService {

}
