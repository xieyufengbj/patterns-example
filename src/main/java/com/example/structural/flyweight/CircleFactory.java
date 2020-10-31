package com.example.structural.flyweight;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * Copyright (C), 2020
 * FileName: CircleFactory
 *
 * @author: xieyufeng
 * @date: 2020/10/31 14:59
 * @description:
 */
public class CircleFactory {

    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);
        if (Objects.isNull(circle)) {
            circle = new Circle();
            circle.setColor(color);
            circle.setRadius(getRandomRadius());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circleMap.put(color, circle);
            System.out.println("Creating new Circle of color:" + color);
        }
        return circle;
    }

    private static int getRandomY() {

        return (int)(Math.random()* 100);
    }

    private static int getRandomX() {
        return  (int)(Math.random()* 200);
    }

    private static int getRandomRadius() {
        return  (int)(Math.random()* 80);
    }
}
