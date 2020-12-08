package com.example.behavioral.strategy;

/**
 * Copyright (C), 2020
 * FileName: OperationMultiply
 *
 * @author: xieyufeng
 * @date: 2020/12/8 13:48
 * @description:
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
