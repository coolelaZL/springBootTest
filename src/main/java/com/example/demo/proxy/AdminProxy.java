package com.example.demo.proxy;

public class AdminProxy extends Admin {
    @Override
    public void doSomething() {
        System.out.println("儿子dosomething");
        super.doSomething();
        System.out.println("儿子dosomething结束");
    }
}
