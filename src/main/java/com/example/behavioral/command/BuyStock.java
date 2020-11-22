package com.example.behavioral.command;

/**
 * Copyright (C), 2020
 * FileName: BuyStock
 *
 * @author: xieyufeng
 * @date: 2020/11/22 10:37
 * @description:
 */
public class BuyStock implements Order {

    private Stock buyStock;

    public BuyStock(Stock buyStock) {
        this.buyStock = buyStock;
    }
    @Override
    public void execute() {
        buyStock.buyStock();
    }
}
