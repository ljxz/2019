package com.wjsljx.model;

/**
 * --------------------------------------------------------------
 * CopyRights(c)2018,YJLC
 * All Rights Reserved
 * <p>
 * FileName: User.java
 * Description: 用户
 * Author: ljx
 * CreateDate: 2019-03-20
 * --------------------------------------------------------------
 */

public class User {
    private String userId;
    private String userName;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }
}
