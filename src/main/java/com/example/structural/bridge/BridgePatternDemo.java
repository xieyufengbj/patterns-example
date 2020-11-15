package com.example.structural.bridge;

/**
 * Copyright (C), 2020
 * FileName: BridgePatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/5 14:50
 * @description:
 */
public class BridgePatternDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(100, 200, 50, new RedCircle());

        Shape greenCircle = new Circle(100, 200, 50, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
