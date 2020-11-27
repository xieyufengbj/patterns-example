package com.example.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2020
 * FileName: CareTaker
 *
 * @author: xieyufeng
 * @date: 2020/11/27 09:16
 * @description:
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void save(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
