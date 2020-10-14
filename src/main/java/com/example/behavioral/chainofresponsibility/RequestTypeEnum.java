package com.example.behavioral.chainofresponsibility;

/**
 * Copyright (C), 2020
 * FileName: RequestTypeEnum
 *
 * @author: xieyufeng
 * @date: 2020/10/13 17:32
 * @description:
 */
public enum RequestTypeEnum {
    HOLIDAY(1, "请假"),
    RAISE(2, "加薪")
    ;

    private int requestType;

    private String desc;

    RequestTypeEnum(int requestType, String desc) {
        this.requestType = requestType;
        this.desc = desc;
    }

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
