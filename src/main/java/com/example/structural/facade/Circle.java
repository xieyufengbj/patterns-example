package com.example.structural.facade;

/**
 * Copyright (C), 2020
 * FileName: Circle
 *
 * @author: xieyufeng
 * @date: 2020/11/2 09:13
 * @description:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw circle, " + getClass());
    }
}
