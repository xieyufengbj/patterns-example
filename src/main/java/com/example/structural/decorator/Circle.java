package com.example.structural.decorator;

/**
 * Copyright (C), 2020
 * FileName: Circle
 *
 * @author: xieyufeng
 * @date: 2020/11/4 10:41
 * @description:
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle: Shape()," + getClass());
    }
}
