package com.example.structural.proxy;

/**
 * Copyright (C), 2020
 * FileName: StaticProxyDemo
 *
 * @author: xieyufeng
 * @date: 2020/10/22 11:16
 * @description:
 */
public class StaticProxyDemo {

    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject();

        subject.proxySubject();
    }
}
