package com.example.behavioral.memento;

/**
 * Copyright (C), 2020
 * FileName: MementoPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/20 21:01
 * @description:
 */
public class MementoPatternDemo {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("STATE #1");
        careTaker.save(originator.saveMemento());
        originator.setState("STATE #2");
        originator.setState("STATE #3");
        careTaker.save(originator.saveMemento());
        originator.setState("STATE #4");

        System.out.println("FIRST STATE:" + careTaker.get(0));
        System.out.println("SECOND STATE:" + careTaker.get(1));
        System.out.println("Originator state:" + originator.getState());
    }
}
