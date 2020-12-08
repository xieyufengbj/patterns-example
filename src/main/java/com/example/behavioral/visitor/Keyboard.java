package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020, 上海昌投网络科技有限公司
 * FileName: Keyboard
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:29
 * @description:
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
