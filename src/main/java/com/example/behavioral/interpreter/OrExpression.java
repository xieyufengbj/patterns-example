package com.example.behavioral.interpreter;

/**
 * Copyright (C), 2020
 * FileName: OrExpression
 *
 * @author: xieyufeng
 * @date: 2020/11/23 10:42
 * @description:
 */
public class OrExpression implements Expression {

    private Expression expression1;

    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
