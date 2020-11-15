package com.example.structural.bridge;

/**
 * Copyright (C), 2020
 * FileName: GreenCircle
 *
 * @author: xieyufeng
 * @date: 2020/11/14 11:06
 * @description:
 */
public class GreenCircle implements DrawApi {


    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw circle:[color : green,radius = "+ radius +", x=" + x + ", y= "+ y +" ]");
    }
}
