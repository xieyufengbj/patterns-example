package com.example.behavioral.command;

/**
 * Copyright (C), 2020
 * FileName: SellStock
 *
 * @author: xieyufeng
 * @date: 2020/11/22 10:36
 * @description:
 */
public class SellStock implements Order {

    private Stock sellStock;

    public SellStock(Stock sellStock) {
        this.sellStock = sellStock;
    }

    @Override
    public void execute() {
        sellStock.sellStock();
    }
}
