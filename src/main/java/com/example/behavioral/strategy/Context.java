package com.example.behavioral.strategy;

/**
 * Copyright (C), 2020
 * FileName: Context
 *
 * @author: xieyufeng
 * @date: 2020/12/8 13:49
 * @description:
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
