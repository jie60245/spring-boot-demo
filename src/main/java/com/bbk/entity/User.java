package com.bbk.entity;

public class User {
    private Integer userId;
    private Integer userName;
    private Integer userPassword;
    private Integer userEmail;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public Integer getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Integer userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Integer userEmail) {
        this.userEmail = userEmail;
    }

    public User() {
    }

    public User(Integer userId, Integer userName, Integer userPassword, Integer userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }
}
