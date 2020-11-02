package com.example.structural.facade;

/**
 * Copyright (C), 2020
 * FileName: FacadePatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/2 09:31
 * @description:
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
