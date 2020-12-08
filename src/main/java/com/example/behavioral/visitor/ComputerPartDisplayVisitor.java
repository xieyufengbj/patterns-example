package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020
 * FileName: ComputerPartDisplayVisitor
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:36
 * @description:
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Display: Computer!");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display: keyboard!");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display: monitor!");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Display: mouse!");
    }
}
