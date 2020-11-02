package com.example.structural.facade;

/**
 * Copyright (C), 2020
 * FileName: Rectangle
 *
 * @author: xieyufeng
 * @date: 2020/11/2 09:22
 * @description:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle," + getClass());
    }
}
