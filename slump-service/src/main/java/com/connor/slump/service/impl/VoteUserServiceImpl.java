package com.connor.slump.service.impl;

import com.connor.slump.model.VoteUserModel;
import com.connor.slump.dao.VoteUserDao;
import com.connor.slump.service.VoteUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票帖的投票用户 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class VoteUserServiceImpl extends ServiceImpl<VoteUserDao, VoteUserModel> implements VoteUserService {

}
