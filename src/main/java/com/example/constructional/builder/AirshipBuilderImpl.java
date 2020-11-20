package com.example.constructional.builder;

/**
 * Copyright (C), 2020
 * FileName: AirshipBuilderImpl
 *
 * @author: xieyufeng
 * @date: 2020/11/20 15:56
 * @description:
 */
public class AirshipBuilderImpl implements AirshipBuilder {
    @Override
    public Airship.EscapeTower buildEscapeTower() {
        System.out.println("逃逸塔构建完成。。。");
        return new Airship.EscapeTower("上海牌逃逸塔");
    }

    @Override
    public Airship.OrbitalModule buildOrbitalModule() {
        System.out.println("轨道舱构建完成。。。");
        return new Airship.OrbitalModule("上海牌轨道舱");
    }

    @Override
    public Airship.Engine buildEngine() {
        System.out.println("引擎构建完成。。。");
        return new Airship.Engine("重庆牌引擎");
    }
}
