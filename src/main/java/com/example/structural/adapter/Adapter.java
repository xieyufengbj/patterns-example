package com.example.structural.adapter;

/**
 * Copyright (C), 2020
 * FileName: Adapter
 *
 * @author: xieyufeng
 * @date: 2020/11/16 11:27
 * @description:
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void handler() {
        super.handleReq();
    }
}
