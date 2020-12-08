package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020
 * FileName: Computer
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:24
 * @description:
 */
public class Computer implements ComputerPart {

    ComputerPart[] computerParts;

    public Computer() {

        computerParts = new ComputerPart[]{new Keyboard(), new Mouse(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (int i = 0, len = computerParts.length; i < len; i++) {
            computerParts[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
