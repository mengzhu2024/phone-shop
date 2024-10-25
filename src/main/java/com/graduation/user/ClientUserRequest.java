package com.graduation.user;

import com.graduation.base.BaseRequest;

public class ClientUserRequest extends BaseRequest {

    //手机号
    private String phone;

    //姓名
    private String name;

    //性别
    private String sex;

    //登录密码
    private String password;

    //默认地址
    private String defaultAddress;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

}