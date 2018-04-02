package com.example.demo.proxy;

public class ManagerProxy implements Manager{
    private Manager manager;

    public ManagerProxy(Manager manager){
        super();
        this.manager = manager;
    }

    public void doSomething(){
        System.out.println("开始代理doSomething");
        manager.doSomething();
        System.out.println("结束代理doSomething");
    }
}
