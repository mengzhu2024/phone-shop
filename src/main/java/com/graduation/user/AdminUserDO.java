package com.graduation.user;

import com.graduation.base.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AdminUserDO extends BaseEntity {

    //登录账户
    private String account;

    //姓名
    private String name;

    //性别
    private String sex;

    //登录密码
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}