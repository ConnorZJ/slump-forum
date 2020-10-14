package com.connor.slump.result;

/**
 * <p>
 * 返回包装对象实体
 * </p>
 *
 * @author Connor
 * @since 2020/9/22
 */
public class CommonResult<D> {

    public static final String SUCCESS = "0";
    public static final String FAIL = "1";

    private String code;
    private D data;
    private String msg;

    private CommonResult(String code) {
        this.code = code;
    }

    public static <T> CommonResult<T> get(String code) {
        return new CommonResult<>(code);
    }

    public static <T> CommonResult<T> success() {
        return new CommonResult<T>(SUCCESS).setMsg("操作成功");
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(SUCCESS).setMsg("操作成功").setData(data);
    }

    public static <T> CommonResult<T> success(String msg) {
        return new CommonResult<T>(SUCCESS).setMsg(msg);
    }

    public static <T> CommonResult<T> success(String msg, T data) {
        return new CommonResult<T>(SUCCESS).setMsg(msg).setData(data);
    }

    public static <T> CommonResult<T> fail() {
        return new CommonResult<T>(FAIL).setMsg("操作失败");
    }

    public static <T> CommonResult<T> fail(String msg) {
        return new CommonResult<T>(FAIL).setMsg(msg);
    }

    public static <T> CommonResult<T> fail(String msg, T data) {
        return new CommonResult<T>(FAIL).setMsg(msg).setData(data);
    }

    public static <T> CommonResult<T> fail(T data) {
        return new CommonResult<T>(FAIL).setMsg("操作失败").setData(data);
    }

    public D getData() {
        return this.data;
    }

    public CommonResult<D> setData(D data) {
        this.data = data;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CommonResult<D> setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public CommonResult<D> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

}
