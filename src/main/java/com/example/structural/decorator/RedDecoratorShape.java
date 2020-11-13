package com.example.structural.decorator;

/**
 * Copyright (C), 2020
 * FileName: RedDecoratorShape
 *
 * @author: xieyufeng
 * @date: 2020/11/4 10:45
 * @description:
 */
public class RedDecoratorShape extends DecoratorShape {

    public RedDecoratorShape(Shape redDecoratorShape) {

        super(redDecoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        this.setColor(decoratedShape);

    }

    public void setColor(Shape redDecoratorShape) {
        System.out.println("Set Shape Border: Red!");
    }
}
