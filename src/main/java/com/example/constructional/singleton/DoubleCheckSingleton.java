package com.example.constructional.singleton;

/**
 * Copyright (C), 2021
 * FileName: DoubleCheckSingleton
 *
 * @author: xieyufeng
 * @date: 2021/6/3 14:46
 * @description:
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {
        System.out.println("DoubleCheckSingleton:DoubleCheckSingleton构建器初始化完成");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized(DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
