package com.connor.slump.service.impl;

import com.connor.slump.model.VoteItemModel;
import com.connor.slump.dao.VoteItemDao;
import com.connor.slump.service.VoteItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛投票帖的投票项 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class VoteItemServiceImpl extends ServiceImpl<VoteItemDao, VoteItemModel> implements VoteItemService {

}
