package com.graduation.coupon;

import com.graduation.base.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CouponUserDO extends BaseEntity {

    //优惠券id
    private Integer couponId;

    //优惠券id
    private String couponName;

    //顾客id
    private Integer userId;

    //顾客id
    private String userName;

    //发放个数
    private Integer num;

    //有效期开始日期
    private LocalDate validStartDate;

    //有效期截止日期
    private LocalDate validEndDate;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

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
        this.userName = userName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public LocalDate getValidStartDate() {
        return validStartDate;
    }

    public void setValidStartDate(LocalDate validStartDate) {
        this.validStartDate = validStartDate;
    }

    public LocalDate getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(LocalDate validEndDate) {
        this.validEndDate = validEndDate;
    }

}