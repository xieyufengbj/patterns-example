package com.example.constructional.builder;

/**
 * Copyright (C), 2020
 * FileName: BuilderPatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/19 16:08
 * @description:
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {

        AirshipDirectorImpl airshipDirector = new AirshipDirectorImpl(new AirshipBuilderImpl());
        Airship airship = airshipDirector.directAirship();

        airship.launch();
    }
}
