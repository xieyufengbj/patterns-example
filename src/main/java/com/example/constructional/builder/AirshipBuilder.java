package com.example.constructional.builder;

/**
 * Copyright (C), 2020
 * FileName: AirshipBuilder
 *
 * @author: xieyufeng
 * @date: 2020/11/20 15:52
 * @description:
 */
public interface AirshipBuilder {

    Airship.EscapeTower buildEscapeTower();

    Airship.OrbitalModule buildOrbitalModule();

    Airship.Engine buildEngine();
}
