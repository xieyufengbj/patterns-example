package com.example.structural.flyweight;

import lombok.Data;

/**
 * Copyright (C), 2020
 * FileName: Circle
 *
 * @author: xieyufeng
 * @date: 2020/10/31 14:54
 * @description:
 */
@Data
public class Circle implements Shape {

    private String color;

    private int x;

    private int y;

    private int radius;

    @Override
    public void draw() {
        System.out.println("Circle[draw(): color='"+ color+"', x= "+ x +", y= "+ y +", radius= "+ radius +"]");
    }
}
