package com.example.behavioral.chainofresponsibility;

import lombok.Data;

/**
 * Copyright (C), 2020
 * FileName: Manager
 *
 * @author: xieyufeng
 * @date: 2020/10/13 17:07
 * @description:
 */
@Data
public abstract class Manager {

    private String name;

    private Manager nextLeader;

    public abstract void handleRequest(RequestMeta request);
}
