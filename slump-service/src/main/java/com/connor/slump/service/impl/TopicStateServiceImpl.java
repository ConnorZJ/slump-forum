package com.connor.slump.service.impl;

import com.connor.slump.model.TopicStateModel;
import com.connor.slump.dao.TopicStateDao;
import com.connor.slump.service.TopicStateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛帖子状态表、例如精华、置顶、推荐等 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class TopicStateServiceImpl extends ServiceImpl<TopicStateDao, TopicStateModel> implements TopicStateService {

}
