package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestSpringboot {
    @Autowired
    private UserMapper userMapper;
    @Test
    public  void test(){
        List<User> users =userMapper.selectByPrimary();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
