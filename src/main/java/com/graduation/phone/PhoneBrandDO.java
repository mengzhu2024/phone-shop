package com.graduation.phone;

import com.graduation.base.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PhoneBrandDO extends BaseEntity {

    //品牌名称
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}