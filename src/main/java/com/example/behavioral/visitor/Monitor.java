package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020
 * FileName: Monitor
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:30
 * @description:
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
