package com.example.behavioral.observer;

/**
 * Copyright (C), 2020
 * FileName: Observer
 *
 * @author: xieyufeng
 * @date: 2020/12/11 14:33
 * @description:
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
