package com.connor.slump.result;

/**
 * <p>
 * 返回包装对象实体
 * </p>
 *
 * @author Connor
 * @since 2020/9/22
 */
public class CommonResult<T> {

    private T data;
    private int code;
    private String message;
    public CommonResult() {
    }

    public CommonResult(T data) {
        this.data = data;
    }
    private enum CodeType {
        ERROR(1, "失败"),
        SUCCESS(0, "成功");

        private int value;
        private String descript;

        CodeType(int value, String descript) {
            this.value = value;
            this.descript = descript;
        }

        @Override
        public String toString() {
            return this.descript;
        }
    }

    public CommonResult success() {
        code = CodeType.SUCCESS.value;
        message = CodeType.SUCCESS.toString();
        return this;
    }

    public CommonResult error() {
        code = CodeType.ERROR.value;
        message = CodeType.ERROR.toString();
        return this;
    }

    public CommonResult success(String message) {
        code = CodeType.SUCCESS.value;
        this.message = message;
        return this;
    }

    public CommonResult error(String message) {
        code = CodeType.ERROR.value;
        this.message = message;
        return this;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
