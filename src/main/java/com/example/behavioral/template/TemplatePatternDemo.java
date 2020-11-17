package com.example.behavioral.template;

/**
 * Copyright (C), 2020
 * FileName: TemplatePatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/17 18:08
 * @description:
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        NewBankAction newBankAction = new NewBankAction();
        newBankAction.process();

        BankTemplateAction bta1 = new BankTemplateAction() {
            @Override
            public void transact() {
                System.out.println("取款操作中。。。");
            }
        };
        bta1.process();
    }

    public static class NewBankAction extends BankTemplateAction {

        @Override
        public void transact() {
            System.out.println("存款操作中。。。");
        }
    }
}
