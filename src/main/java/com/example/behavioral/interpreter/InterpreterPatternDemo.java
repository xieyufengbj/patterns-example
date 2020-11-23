package com.example.behavioral.interpreter;

/**
 * Copyright (C), 2020
 * FileName: InterpreterPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/20 21:00
 * @description:
 */
public class InterpreterPatternDemo {

    // John is man !
    public static Expression isMale() {
        Expression expr1 = new TerminalExpression("John");
        Expression expr2 = new TerminalExpression("Male");

        return new OrExpression(expr1, expr2);
    }

    public static Expression isMarriedWoman() {
        Expression expr1 = new TerminalExpression("Hony");
        Expression expr2 = new TerminalExpression("Married Woman");

        return new AndExpression(expr1, expr2);
    }

    public static void main(String[] args) {
        Expression isMale = InterpreterPatternDemo.isMale();

        Expression isMarriedWoman = InterpreterPatternDemo.isMarriedWoman();

        System.out.println("John is man? " + isMale.interpret("John"));
        System.out.println("Hony is warried woman? " + isMarriedWoman.interpret("Hony Married Woman"));
    }
}
