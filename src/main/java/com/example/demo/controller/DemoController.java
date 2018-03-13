package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/hehe3")
    public String hehe3(){
        System.out.println("hehe2");
        return"erro";
    }@RequestMapping("/hehe2")
    public String hehe2(){
        return"hehe2!";
    }
    @RequestMapping("/hehe")
    public String hehe(){
        return"hee";
    }
    @GetMapping("/")
    public String hello(){
        try {
            System.out.println("hello wol");
            throw new Exception();
        } catch (Exception  e) {
            e.printStackTrace();
            System.out.println("catc exception");
        } finally {
        }
        return"hello!";
    }
}

