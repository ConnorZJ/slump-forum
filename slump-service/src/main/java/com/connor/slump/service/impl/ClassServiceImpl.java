package com.connor.slump.service.impl;

import com.connor.slump.model.ClassModel;
import com.connor.slump.dao.ClassDao;
import com.connor.slump.service.ClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 论坛板块分类 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassDao, ClassModel> implements ClassService {

}
