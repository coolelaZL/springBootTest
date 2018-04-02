package com.example.demo.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerHandler implements InvocationHandler {

    private Object target;

    public TimerHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("Car is ready to run...");
        method.invoke(target, args);
        long stopTime = System.currentTimeMillis();
        System.out.println("Car has run for: "+(stopTime-startTime)+"milisecond");
        return null;
    }
}
