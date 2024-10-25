package com.graduation.coupon;

import com.graduation.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponMapper extends BaseMapper<CouponDO, CouponQuery> {
}