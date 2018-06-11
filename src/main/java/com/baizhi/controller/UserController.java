package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    public String save(){
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        user.setPassword("1234567");
        user.setSalt("231213");
        user.setStatus("1");
        user.setSign("无敌是多么多么寂寞");
        userService.save(user);
        return "redirect:user/getAll";
    }
    @RequestMapping("/getAll")
    public String  getAll(){
        userService.queryAll();
        return "index";
    }
}
