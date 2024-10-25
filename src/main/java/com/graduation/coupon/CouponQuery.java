package com.graduation.coupon;

import com.graduation.base.BaseQuery;

public class CouponQuery extends BaseQuery {

    //优惠券名称
    private String name;

    //优惠金额(分)
    private Integer discountPrice;

    //适用类型
    private String suitType;

    //适用品类id
    private String suitId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getSuitType() {
        return suitType;
    }

    public void setSuitType(String suitType) {
        this.suitType = suitType;
    }

    public String getSuitId() {
        return suitId;
    }

    public void setSuitId(String suitId) {
        this.suitId = suitId;
    }

}