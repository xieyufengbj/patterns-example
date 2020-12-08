package com.example.behavioral.strategy;

/**
 * Copyright (C), 2020
 * FileName: StrategyPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/12/8 13:40
 * @description:
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context add = new Context(new OperationAdd());
        System.out.println("add: " + add.executeStrategy(10, 20));
        Context subtract = new Context(new OperationSubtract());
        System.out.println("subtract: " + subtract.executeStrategy(20, 10));
        Context multiply = new Context(new OperationMultiply());
        System.out.println("multiply: " + multiply.executeStrategy(10, 20));
    }
}
