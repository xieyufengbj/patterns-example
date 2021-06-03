package com.example.constructional.singleton;

/**
 * Copyright (C), 2021
 * FileName: LazySingleton
 *
 * @author: xieyufeng
 * @date: 2021/6/3 14:45
 * @description:
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {
        System.out.println("LazySingleton:LazySingleton构建器初始化完成");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
