package com.example.behavioral.observer;

/**
 * Copyright (C), 2020
 * FileName: BinaryObserver
 *
 * @author: xieyufeng
 * @date: 2020/12/11 15:45
 * @description:
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("BINARY:" + Integer.toBinaryString(this.subject.getState()));
    }
}
