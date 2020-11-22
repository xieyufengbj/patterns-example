package com.example.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2020
 * FileName: Broker
 *
 * @author: xieyufeng
 * @date: 2020/11/22 10:37
 * @description:
 */
public class Broker {

    public static List<Order> orderList = new ArrayList();

    public void add(Order order) {
        orderList.add(order);
    }

    public void process() {
        orderList.stream().forEach(obj -> {
            obj.execute();
        });
    }
}
