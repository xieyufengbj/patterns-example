package com.example.behavioral.command;

/**
 * Copyright (C), 2020
 * FileName: CommandPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/18 13:54
 * @description:
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock stock = new Stock("大宝", 100);

        BuyStock buyStock = new BuyStock(stock);

        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.add(buyStock);
        broker.add(sellStock);

        broker.process();
    }
}
