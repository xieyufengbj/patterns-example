package com.example.structural.proxy;

/**
 * Copyright (C), 2020
 * FileName: Beauty
 *
 * @author: xieyufeng
 * @date: 2020/10/27 11:02
 * @description:
 */
public class Beauty implements Girl {
    @Override
    public void eat() {
        System.out.println(Thread.currentThread().getId() + "-今天一起去吃个饭-" + getClass());
        this.shopping();
    }

    @Override
    public void shopping() {
        System.out.println(Thread.currentThread().getId() + "-吃完饭后出去shopping啊-" + getClass());
    }
}
