package com.example.behavioral.visitor;

/**
 * Copyright (C), 2020, 上海昌投网络科技有限公司
 * FileName: ComputerPart
 *
 * @author: xieyufeng
 * @date: 2020/12/8 09:24
 * @description:
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}
