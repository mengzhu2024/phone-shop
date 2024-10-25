package com.graduation.base;

import java.util.List;

public interface BaseMapper<T, Q> {

    void insert(T t);

    void updateById(T t);

    void deleteById(Integer id);

    List<T> selectList(Q q);

    Integer selectCount(Q q);

    T selectById(Integer id);
}
