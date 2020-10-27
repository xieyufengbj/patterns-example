package com.example.structural.proxy;

/**
 * Copyright (C), 2020
 * FileName: DynProxyDemo
 *
 * @author: xieyufeng
 * @date: 2020/10/27 13:50
 * @description:
 */
public class DynProxyDemo {

    public static void main(String[] args) {
        Beauty beauty = new Beauty();
        BeautyFamily beautyFamily = new BeautyFamily(beauty);

        Girl girl = beautyFamily.getInstance();
        girl.eat();
    }
}
