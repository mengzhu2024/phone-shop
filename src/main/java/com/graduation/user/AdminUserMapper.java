package com.graduation.user;

import com.graduation.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUserDO, AdminUserQuery> {
}