package com.example.behavioral.state;

/**
 * Copyright (C), 2020
 * FileName: StatePatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/12/11 17:22
 * @description:
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);
        System.out.println(startState.toString());

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(stopState.toString());
    }
}
