package com.example.behavioral.state;

/**
 * Copyright (C), 2020
 * FileName: StartState
 *
 * @author: xieyufeng
 * @date: 2020/12/16 16:14
 * @description:
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("player is in start state! ");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "START STATE";
    }
}
