package com.example.behavioral.interpreter;

/**
 * Copyright (C), 2020
 * FileName: TerminalExpression
 *
 * @author: xieyufeng
 * @date: 2020/11/23 10:38
 * @description:
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
