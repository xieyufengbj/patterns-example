package com.example.behavioral.chainofresponsibility;

import java.util.Objects;

/**
 * Copyright (C), 2020
 * FileName: GeneralManager
 *
 * @author: xieyufeng
 * @date: 2020/10/13 17:48
 * @description:
 */
public class GeneralManager extends Manager {

    @Override
    public void handleRequest(RequestMeta request) {

        if (Objects.equals(request.getRequestType(), RequestTypeEnum.HOLIDAY.getRequestType()) && request.getNum() <= 10) {
            System.out.println("总经理【name="+ this.getName() +"】已批准"+ request.getName() + request.getNum() +"天请假申请！");
        } else if (Objects.equals(request.getRequestType(), RequestTypeEnum.RAISE.getRequestType()) && request.getNum() <= 3000) {
            System.out.println("总经理【name="+ this.getName() +"】已批准"+ request.getName() + request.getNum() +"的加薪申请！");
        } else {
            System.out.println("总经理【name="+ this.getName() +"】暂不批准");
        }
    }
}
