package com.example.structural.decorator;

/**
 * Copyright (C), 2020
 * FileName: Rectangle
 *
 * @author: xieyufeng
 * @date: 2020/11/4 10:38
 * @description:
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle: Shape(), " + getClass());
    }
}
