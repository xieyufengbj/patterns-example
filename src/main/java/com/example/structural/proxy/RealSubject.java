package com.example.structural.proxy;

/**
 * Copyright (C), 2020
 * FileName: RealSubject
 *
 * @author: xieyufeng
 * @date: 2020/10/20 18:43
 * @description:
 */
public class RealSubject implements Subject {


    @Override
    public void proxySubject() {
        System.out.println("我是真正决策执行者：" + getClass());
    }
}
