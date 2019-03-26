package com.wjsljx.exception;

/**
 * --------------------------------------------------------------
 * CopyRights(c)2018,YJLC
 * All Rights Reserved
 * <p>
 * FileName: MyException.java
 * Description:自定义异常
 * Author: ljx
 * CreateDate: 2019-03-20
 * --------------------------------------------------------------
 */
public class MyException extends Exception {

    private static final long serialVersionUID = 1L;

    private String code;
    private String msg;

    public MyException() {}

    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
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

}
