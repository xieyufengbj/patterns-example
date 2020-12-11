package com.example.behavioral.observer;

/**
 * Copyright (C), 2020
 * FileName: OctalObserver
 *
 * @author: xieyufeng
 * @date: 2020/12/11 15:46
 * @description:
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("OCTAL:" + Integer.toOctalString(this.subject.getState()));
    }
}
