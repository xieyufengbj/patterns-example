package com.example.constructional.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Copyright (C), 2021
 * FileName: SingletonDemo
 *
 * @author: xieyufeng
 * @date: 2021/6/3 14:54
 * @description:
 */
public class SingletonDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0, len = 100; i < len; i++) {

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //EagerSingleton.getInstance();
                    //LazySingleton.getInstance();
                    //DoubleCheckSingleton.getInstance();
                    StaticSingleton.getInstance();
                }
            });
            executorService.execute(thread);
        }
    }
}
