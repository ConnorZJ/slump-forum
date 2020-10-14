package com.connor.slump.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.connor.slump.result.CommonResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 基本增删改查接口 前端控制器
 * </p>
 *
 * @author Connor
 * @since 2020/9/18
 */
@RestController
public abstract class BaseController<T extends Serializable> {

    protected abstract IService<T> getService();

    @GetMapping
    public List<T> listAll() {
        return getService().list();
    }

    @GetMapping("{id}")
    public CommonResult<T> getById(@PathVariable String id) {
        return CommonResult.success(getService().getById(id));
    }

    @PostMapping
    public CommonResult<T> save(@RequestBody T t) {
        getService().save(t);
        return CommonResult.success();
    }

    @PutMapping
    public CommonResult<T> update(@RequestBody T t) {
        getService().updateById(t);
        return CommonResult.success();
    }

    @DeleteMapping("{id}")
    public CommonResult<T> deleteById(@PathVariable String id) {
        getService().removeById(id);
        return CommonResult.success();
    }

    @DeleteMapping
    public CommonResult<T> batchDelete(@RequestBody List<String> ids) {
        getService().removeByIds(ids);
        return CommonResult.success();
    }

}
