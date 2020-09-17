package com.connor.slump.service.impl;

import com.connor.slump.model.GroupModel;
import com.connor.slump.dao.GroupDao;
import com.connor.slump.service.GroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛权限组 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class GroupServiceImpl extends ServiceImpl<GroupDao, GroupModel> implements GroupService {

}
