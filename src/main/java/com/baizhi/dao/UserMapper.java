package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    List<User>  selectByPrimary();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}