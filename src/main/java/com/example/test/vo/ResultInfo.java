package com.example.test.vo;

import com.example.test.bean.UserBean;

public class ResultInfo<T> extends UserBean {
    private Integer code;//状态码 0 失败 1 成功
    private String smg;//错误信息提示
    private T result;//返回结果

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getSmg() {
        return smg;
    }

    public void setSmg(String smg) {
        this.smg = smg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
