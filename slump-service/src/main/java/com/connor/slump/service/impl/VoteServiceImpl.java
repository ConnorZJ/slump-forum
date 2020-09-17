package com.connor.slump.service.impl;

import com.connor.slump.model.VoteModel;
import com.connor.slump.dao.VoteDao;
import com.connor.slump.service.VoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛投票帖子 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class VoteServiceImpl extends ServiceImpl<VoteDao, VoteModel> implements VoteService {

}
