package com.baizhi.service;

import com.baizhi.annotation.LogAnnotation;
import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements  UserService{
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;
    @LogAnnotation(name = "插入一条记录")
    @Override
    public void save(User user) {
        logger.info("插入一条记录");
        userMapper.insertSelective(user);
    }
    @LogAnnotation(name = "查询所有功能")
    @Override
    public List<User> queryAll() {
        return userMapper.selectByPrimary();
    }
}
