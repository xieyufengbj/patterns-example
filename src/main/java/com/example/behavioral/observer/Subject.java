package com.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2020
 * FileName: Subject
 *
 * @author: xieyufeng
 * @date: 2020/12/11 14:32
 * @description:
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObserver() {
        observerList.stream().forEach(obj -> {
            obj.update();
        });
    }
}
