package com.graduation.coupon;

import com.graduation.base.BaseRequest;

public class CouponUserRequest extends BaseRequest {

    //优惠券id
    private Integer couponId;

    //顾客id
    private Integer userId;

    //发放个数
    private Integer num;

    //有效期开始日期
    private String validStartDate;

    //有效期截止日期
    private String validEndDate;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getValidStartDate() {
        return validStartDate;
    }

    public void setValidStartDate(String validStartDate) {
        this.validStartDate = validStartDate;
    }

    public String getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(String validEndDate) {
        this.validEndDate = validEndDate;
    }

}