package com.example.structural.proxy;

/**
 * Copyright (C), 2020
 * FileName: ProxySubject
 *
 * @author: xieyufeng
 * @date: 2020/10/20 18:44
 * @description:
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    private void before() {
        System.out.println("代理对象执行前置操作--before" + getClass());
    }

    private void after() {
        System.out.println("代理对象执行前置操作--after" + getClass());
    }

    private void init() {
        realSubject = new RealSubject();
    }
    @Override
    public void proxySubject() {
        this.init();
        this.before();
        realSubject.proxySubject();
        this.after();
    }
}
