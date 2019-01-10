package com.mybatis.model;

import java.util.Date;

public class Users {
    private Integer userId;

    private String userName;

    private Date brithday;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

	@Override
	public String toString() {
		return "姓名:" + userName + "生日:" + brithday + super.toString();
	}
}