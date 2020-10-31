package com.example.structural.flyweight;


/**
 * Copyright (C), 2020
 * FileName: FlyweightPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/10/31 15:04
 * @description:
 */
public class FlyweightPatternDemo {

    private static final String[] colorList = new String[]{"GREEN", "RED", "BLUE", "BLACK", "WHITE", "GRAY"};

    public static void main(String[] args) {

        for (int i = 0, len = colorList.length; i < len; i++) {
            Circle circle = CircleFactory.getCircle(colorList[i]);
            circle.draw();
        }
    }
}
