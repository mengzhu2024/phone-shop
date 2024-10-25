package com.graduation.coupon;

import com.graduation.base.BaseRequest;

import java.util.List;

public class CouponRequest extends BaseRequest {

    //优惠券名称
    private String name;

    //优惠金额(元)
    private String discountPrice;

    //适用类型
    private String suitType;

    //适用品类id
    private List<Integer> suitId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getSuitType() {
        return suitType;
    }

    public void setSuitType(String suitType) {
        this.suitType = suitType;
    }

    public List<Integer> getSuitId() {
        return suitId;
    }

    public void setSuitId(List<Integer> suitId) {
        this.suitId = suitId;
    }
}
