package com.example.constructional.builder;

/**
 * Copyright (C), 2020
 * FileName: AirshipDirectorImpl
 *
 * @author: xieyufeng
 * @date: 2020/11/20 15:57
 * @description:
 */
public class AirshipDirectorImpl implements AirshipDirector {

    private AirshipBuilder airshipBuilder;

    public AirshipDirectorImpl(AirshipBuilder airshipBuilder) {
        this.airshipBuilder = airshipBuilder;
    }

    @Override
    public Airship directAirship() {
        Airship airship = new Airship();
        airship.setEngine(airshipBuilder.buildEngine());
        airship.setEscapeTower(airshipBuilder.buildEscapeTower());
        airship.setOrbitalModule(airshipBuilder.buildOrbitalModule());
        return airship;
    }
}
