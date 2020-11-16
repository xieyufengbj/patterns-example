package com.example.structural.adapter;

/**
 * Copyright (C), 2020
 * FileName: Adaptee
 *
 * @author: xieyufeng
 * @date: 2020/11/16 10:16
 * @description:
 */
public class Adaptee {

    public void handleReq() {
        System.out.println("我是被适配的对象方法" + getClass());
    }
}
