package com.example.constructional.builder;

import lombok.Data;

/**
 * Copyright (C), 2020
 * FileName: Airship
 *
 * @author: xieyufeng
 * @date: 2020/11/20 15:39
 * @description:
 */
@Data
public class Airship {
    // 逃逸塔
    private EscapeTower escapeTower;
    // 轨道舱
    private OrbitalModule orbitalModule;
    // 引擎
    private Engine engine;

    public void launch() {
        System.out.println("发射升空。。。");
    }

    @Data
    public static class EscapeTower {
        private String name;

        public EscapeTower(String name) {
            this.name = name;
        }
    }

    @Data
    public static class OrbitalModule {
        private String name;

        public OrbitalModule(String name) {
            this.name = name;
        }
    }

    @Data
    public static class Engine {

        private String name;

        public Engine(String name) {
            this.name = name;
        }
    }
}
