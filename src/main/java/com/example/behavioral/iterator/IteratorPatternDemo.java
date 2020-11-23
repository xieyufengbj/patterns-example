package com.example.behavioral.iterator;

/**
 * Copyright (C), 2020
 * FileName: IteratorPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/20 21:00
 * @description:
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            Object obj = iterator.next();
            System.out.println("name= " + obj);
        }
    }
}
