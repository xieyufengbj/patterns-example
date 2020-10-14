package com.example.behavioral.chainofresponsibility;

import lombok.Data;

/**
 * Copyright (C), 2020
 * FileName: RequestMeta
 *
 * @author: xieyufeng
 * @date: 2020/10/14 11:45
 * @description:
 */
@Data
public class RequestMeta {

    private String name;

    private Integer num;

    private Integer requestType;

    public RequestMeta(String name, Integer num, Integer requestType) {
        this.name = name;
        this.num = num;
        this.requestType = requestType;
    }
}
