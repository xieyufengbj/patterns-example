package com.example.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Copyright (C), 2020
 * FileName: BeautyFamily
 *
 * @author: xieyufeng
 * @date: 2020/10/27 11:29
 * @description:
 */
public class BeautyFamily implements InvocationHandler {

    private Girl beauty;

    public BeautyFamily(Girl girl) {

        this.beauty = girl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.preHandler();
        Object object = method.invoke(beauty, args);
        this.handler();
        return object;
    }

    private void preHandler() {
        System.out.println(Thread.currentThread().getId() + "-先观察看看-" + getClass());
    }

    private void handler() {
        System.out.println(Thread.currentThread().getId() + "-相处的如何呀-" + getClass());
    }

    public Girl getInstance() {

        return (Girl) Proxy.newProxyInstance(beauty.getClass().getClassLoader(), beauty.getClass().getInterfaces(), this);
    }
}
