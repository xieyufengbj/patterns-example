package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020
 * FileName: VisitorPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:59
 * @description:
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
