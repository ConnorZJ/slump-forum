package com.connor.slump.service.impl;

import com.connor.slump.model.OperateLogModel;
import com.connor.slump.dao.OperateLogDao;
import com.connor.slump.service.OperateLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@Service
public class OperateLogServiceImpl extends ServiceImpl<OperateLogDao, OperateLogModel> implements OperateLogService {

}
