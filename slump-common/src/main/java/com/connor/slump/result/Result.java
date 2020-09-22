package com.connor.slump.result;

/**
 * <p>
 * 返回包装对象实体
 * </p>
 *
 * @author Connor
 * @since 2020/9/22
 */
public class Result {

    private String code;

    private String msg;

    private Object data;

    public static final String SUCCESS = "0";

    public static final String FAIL = "1";

    private Result(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(String msg, Object data) {
        return new Result(SUCCESS, msg, data);
    }

    public static Result success(String msg) {
        return new Result(SUCCESS, msg, null);
    }

    public static Result fail(String msg) {
        return new Result(FAIL, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return new Result(FAIL, msg, data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
