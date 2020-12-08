package com.example.behavioral.strategy;

/**
 * Copyright (C), 2020
 * FileName: OperationAdd
 *
 * @author: xieyufeng
 * @date: 2020/12/8 13:45
 * @description:
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {

        return num1 + num2;
    }
}
