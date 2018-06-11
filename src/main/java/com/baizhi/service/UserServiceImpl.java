package com.baizhi.service;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.selectByPrimary();
    }
}
