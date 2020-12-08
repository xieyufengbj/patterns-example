package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020
 * FileName: ComputerPartVisitor
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:36
 * @description:
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);
}
