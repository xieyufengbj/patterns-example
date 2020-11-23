package com.example.behavioral.mediator;

/**
 * Copyright (C), 2020
 * FileName: MediatorPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/20 21:00
 * @description:
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User jony = new User("jony");

        User tom = new User("tom");

        jony.sendMessage("Hello, Mrs Wang!");
        tom.sendMessage("Hi, How are you!");
    }
}
