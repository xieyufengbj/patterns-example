package com.example.structural.facade;

/**
 * Copyright (C), 2020
 * FileName: ShapeMaker
 *
 * @author: xieyufeng
 * @date: 2020/11/2 09:27
 * @description:
 */
public class ShapeMaker {

    private Circle circle;

    private Rectangle rectangle;

    private Square square;


    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
