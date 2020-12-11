package com.example.behavioral.observer;

/**
 * Copyright (C), 2020
 * FileName: HexObserver
 *
 * @author: xieyufeng
 * @date: 2020/12/11 15:48
 * @description:
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HEX: OX" + Integer.toHexString(this.subject.getState()).toUpperCase());
    }
}
