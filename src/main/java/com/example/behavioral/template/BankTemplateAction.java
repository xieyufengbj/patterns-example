package com.example.behavioral.template;

/**
 * Copyright (C), 2020
 * FileName: BankTemplateAction
 *
 * @author: xieyufeng
 * @date: 2020/11/17 18:09
 * @description:
 */
public abstract class BankTemplateAction {

    public void takeNumber() {
        System.out.println("开始取号。。。");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("结束评价。。。");
    }

    public void process() {
        this.takeNumber();

        this.transact();

        this.evaluate();
    }
}
