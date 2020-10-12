package com.connor.slump.exception;

import com.connor.slump.result.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p>
 * 全局异常处理器
 * </p>
 *
 * @author Connor
 * @since 2020/10/12
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public CommonResult handleException(Exception e) {
        return new CommonResult().error("系统错误，请联系管理员QAQ");
    }

}
