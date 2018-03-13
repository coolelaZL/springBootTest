package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("fastjson")
public class FastjsonController {

    @RequestMapping("/test")
    @ResponseBody
    @CrossOrigin(origins="http://localhost")//细粒度
    public User test() {
        User user = new User();

        user.setId(1);
        user.setUsername("jack");
        user.setPassword("jack123");
        user.setBirthday(new Date());

        //int i = 1/0;
        //System.out.println(i);

        return user;
    }
}