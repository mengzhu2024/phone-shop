package com.graduation.order;

import com.graduation.base.BaseRequest;

public class UserOrderRequest extends BaseRequest {

    //手机名称
    private String phoneName;

    //手机图片
    private String phoneImg;

    //总金额(分)
    private Integer totalPrice;

    //实付金额(分)
    private Integer actualPrice;

    //使用的优惠券
    private Integer couponUserId;

    //优惠金额(分)
    private Integer discountPrice;

    //购买量
    private Integer buyNum;

    //收货地址
    private String address;

    //下单用户
    private Integer userId;

    // 下单商品
    private Integer phoneId;

    // 评价
    private String remark;

    // 评分
    private Integer remarkScore;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneImg() {
        return phoneImg;
    }

    public void setPhoneImg(String phoneImg) {
        this.phoneImg = phoneImg;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Integer actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCouponUserId() {
        return couponUserId;
    }

    public void setCouponUserId(Integer couponUserId) {
        this.couponUserId = couponUserId;
    }

    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getRemarkScore() {
        return remarkScore;
    }

    public void setRemarkScore(Integer remarkScore) {
        this.remarkScore = remarkScore;
    }
}
