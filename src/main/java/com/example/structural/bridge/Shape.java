package com.example.structural.bridge;

/**
 * Copyright (C), 2020
 * FileName: Shape
 *
 * @author: xieyufeng
 * @date: 2020/11/14 11:24
 * @description:
 */
public abstract class  Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
