package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/save")
    public String save(){
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        user.setPassword("1234567");
        user.setSalt("231213");
        System.out.println("dhjkasldhalsdhaskldjaslhalskdjsad");
        user.setStatus("1");
        user.setSign("无敌是多么多么寂寞");
        ServletRequestAttributes servletRequestAttributes=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        servletRequestAttributes.getRequest().setAttribute("user",user);
        userService.save(user);
        return "redirect:/user/getAll";
    }
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<User>  getAll(){
        List<User> users = userService.queryAll();
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request =requestAttributes.getRequest();
        request.setAttribute("users",users);
        return users;
    }
}
