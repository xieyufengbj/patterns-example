package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020
 * FileName: ComputerPart
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:24
 * @description:
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}
