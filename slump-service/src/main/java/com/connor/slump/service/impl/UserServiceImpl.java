package com.connor.slump.service.impl;

import com.connor.slump.model.UserModel;
import com.connor.slump.dao.UserDao;
import com.connor.slump.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛用户表 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserModel> implements UserService {

}
