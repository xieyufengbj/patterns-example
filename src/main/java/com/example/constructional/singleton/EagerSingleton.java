package com.example.constructional.singleton;

/**
 * Copyright (C), 2021
 * FileName: EagerSingleton
 *
 * @author: xieyufeng
 * @date: 2021/6/3 14:45
 * @description:
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton:EagerSingleton构建器初始化");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static EagerSingleton getInstance() {

        return eagerSingleton;
    }
}
