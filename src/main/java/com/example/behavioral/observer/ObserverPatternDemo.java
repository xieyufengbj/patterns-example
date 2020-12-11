package com.example.behavioral.observer;

/**
 * Copyright (C), 2020
 * FileName: ObserverPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/12/11 11:15
 * @description:
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        System.out.println("First input state:" + 100);
        subject.setState(100);
        System.out.println("Second input state:" + 200);
        subject.setState(200);
    }
}
