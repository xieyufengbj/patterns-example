package com.example.behavioral.state;

/**
 * Copyright (C), 2020
 * FileName: StopState
 *
 * @author: xieyufeng
 * @date: 2020/12/16 16:15
 * @description:
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("player is in stop state!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "STOP STATE";
    }
}
