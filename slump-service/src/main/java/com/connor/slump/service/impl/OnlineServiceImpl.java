package com.connor.slump.service.impl;

import com.connor.slump.model.OnlineModel;
import com.connor.slump.dao.OnlineDao;
import com.connor.slump.service.OnlineService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛在线用户表 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class OnlineServiceImpl extends ServiceImpl<OnlineDao, OnlineModel> implements OnlineService {

}
