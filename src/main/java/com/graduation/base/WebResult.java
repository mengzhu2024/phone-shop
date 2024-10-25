package com.graduation.base;

public class WebResult<T> {

    private Integer code;

    private T data;

    private String msg;

    public WebResult(T data) {
        this.code = 0;
        this.data = data;
        this.msg = "操作成功";
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static WebResult<?> success() {
        return new WebResult<>(null);
    }

    public static WebResult<?> failed(String msg) {
        WebResult<?> webResult = new WebResult<>(null);
        webResult.setMsg(msg);
        webResult.setCode(1);
        return webResult;
    }
}
