package com.graduation.phone;

import com.graduation.base.BaseRequest;

public class PhoneBrandRequest extends BaseRequest {

    //品牌名称
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}