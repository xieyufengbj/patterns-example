package com.example.structural.decorator;

/**
 * Copyright (C), 2020
 * FileName: DecoratorPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/4 10:44
 * @description:
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();

        DecoratorShape circleShape = new RedDecoratorShape(new Circle());
        DecoratorShape rectangleShape = new RedDecoratorShape(new Rectangle());

        System.out.println("create circle: ");
        circleShape.draw();

        System.out.println("create rectangle: ");
        rectangleShape.draw();
    }
}
