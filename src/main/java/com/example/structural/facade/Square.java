package com.example.structural.facade;

/**
 * Copyright (C), 2020
 * FileName: Square
 *
 * @author: xieyufeng
 * @date: 2020/11/2 09:14
 * @description:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square, " + getClass());
    }
}
