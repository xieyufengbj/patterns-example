package com.example.behavioral.chainofresponsibility;


import java.util.Objects;

/**
 * Copyright (C), 2020
 * FileName: CommonManager
 *
 * @author: xieyufeng
 * @date: 2020/10/13 17:31
 * @description:
 */
public class CommonManager extends Manager {

    @Override
    public void handleRequest(RequestMeta request) {

        if (Objects.equals(request.getRequestType(), RequestTypeEnum.HOLIDAY.getRequestType()) && request.getNum() <= 2) {
            System.out.println("经理【name="+ this.getName() +"】已批准"+ request.getName() + request.getNum() +"天请假申请！");
        } else if (Objects.equals(request.getRequestType(), RequestTypeEnum.RAISE.getRequestType()) && request.getNum() <= 500) {
            System.out.println("经理【name="+ this.getName() +"】已批准"+ request.getName() + request.getNum() +"的加薪申请！");
        } else {
            if (Objects.nonNull(this.getNextLeader())) {
                this.getNextLeader().handleRequest(request);
            }
        }
    }
}
