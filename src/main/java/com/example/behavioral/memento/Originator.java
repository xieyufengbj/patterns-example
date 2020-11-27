package com.example.behavioral.memento;

import lombok.Data;

/**
 * Copyright (C), 2020
 * FileName: Originator
 *
 * @author: xieyufeng
 * @date: 2020/11/27 09:17
 * @description:
 */
@Data
public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento saveMemento() {
        return new Memento(state);
    }

    public void getMementoState(Memento memento) {
        state = memento.getState();
    }
}
