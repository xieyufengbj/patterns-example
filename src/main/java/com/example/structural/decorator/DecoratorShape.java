package com.example.structural.decorator;

/**
 * Copyright (C), 2020
 * FileName: DecoratorShape
 *
 * @author: xieyufeng
 * @date: 2020/11/4 10:43
 * @description:
 */
public abstract class DecoratorShape implements Shape {

    protected Shape decoratedShape;

    public DecoratorShape(Shape decoratedShape) {

        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
