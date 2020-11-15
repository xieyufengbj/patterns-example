package com.example.structural.bridge;

/**
 * Copyright (C), 2020
 * FileName: Circle
 *
 * @author: xieyufeng
 * @date: 2020/11/15 10:45
 * @description:
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
