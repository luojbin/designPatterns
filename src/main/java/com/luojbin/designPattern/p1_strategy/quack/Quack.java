package com.luojbin.designPattern.p1_strategy.quack;

public class Quack implements QuackBehavior {

    public void yell() {
        System.out.println("真的鸭子，嘎嘎叫");
    }

}
