package com.example.behavioral.command;

/**
 * Copyright (C), 2020
 * FileName: Stock
 *
 * @author: xieyufeng
 * @date: 2020/11/22 10:36
 * @description:
 */
public class Stock {

    public String name;

    public int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void sellStock() {
        System.out.println("Stock:[name= "+ name +", quantity= "+ quantity +", sellStock]");
    }

    public void buyStock() {
        System.out.println("Stock:[name= "+ name+", quantity= "+ quantity+", buyStock]");
    }
}
