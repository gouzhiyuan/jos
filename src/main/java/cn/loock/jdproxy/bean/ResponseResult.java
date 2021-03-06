package cn.loock.jdproxy.bean;

import java.io.Serializable;

public class ResponseResult implements Serializable {

    private int code = 0;
    private String message = "";
    private Object result;

    public ResponseResult() {
    }

    public ResponseResult(Object result) {
        this.code = 200;
        this.result = result;
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

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
