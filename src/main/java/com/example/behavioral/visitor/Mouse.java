package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020, 上海昌投网络科技有限公司
 * FileName: Mouse
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:28
 * @description:
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
