package com.example.demo.dynamicProxy;

import java.util.Random;

public class Car implements Movable {
    @Override
    public void move() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        System.out.println("Car is moving...");
    }
}
