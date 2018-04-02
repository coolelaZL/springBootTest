package com.example.demo;

import com.example.demo.dynamicProxy.Car;
import com.example.demo.dynamicProxy.Movable;
import com.example.demo.dynamicProxy.TimerHandler;
import com.example.demo.proxy.Admin;
import com.example.demo.proxy.AdminProxy;
import com.example.demo.proxy.ManagerProxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void testProxy1() {
        Admin admin = new Admin();
        ManagerProxy managerProxy = new ManagerProxy(admin);
        managerProxy.doSomething();
    }
    @Test
    public void testProxy2(){
        AdminProxy adminProxy = new AdminProxy();
        adminProxy.doSomething();
    }

    @Test
    public void testProxy3() throws Exception {
        Car car = new Car();
        InvocationHandler h = new TimerHandler(car);
        Class cls = car.getClass();
        /**
         * loader ClassLoader
         * interfaces
         * h InvocationHandler
         */
        Movable m = (Movable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
        m.move();
    }
}
