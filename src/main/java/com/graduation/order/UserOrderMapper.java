package com.graduation.order;

import com.graduation.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOrderMapper extends BaseMapper<UserOrderDO, UserOrderQuery> {
}