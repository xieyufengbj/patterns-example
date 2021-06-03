package com.example.constructional.singleton;

/**
 * Copyright (C), 2021
 * FileName: StaticSingleton
 *
 * @author: xieyufeng
 * @date: 2021/6/3 14:51
 * @description:
 */
public class StaticSingleton {

    private StaticSingleton() {
        System.out.println("StaticSingleton:StaticSingleton构建器初始化完成");

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class Inner {
        private static final StaticSingleton staticSingleton = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {

        return Inner.staticSingleton;
    }
}
