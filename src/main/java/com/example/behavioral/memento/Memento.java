package com.example.behavioral.memento;

import lombok.Data;

/**
 * Copyright (C), 2020
 * FileName: Memento
 *
 * @author: xieyufeng
 * @date: 2020/11/27 09:16
 * @description:
 */
@Data
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
