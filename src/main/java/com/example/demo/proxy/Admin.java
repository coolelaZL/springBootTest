package com.example.demo.proxy;

import com.example.demo.proxy.Manager;

public class Admin implements Manager {

    @Override
    public void doSomething() {
        System.out.println("admin do something");
    }
}
