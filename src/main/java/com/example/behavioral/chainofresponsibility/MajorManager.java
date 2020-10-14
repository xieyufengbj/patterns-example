package com.example.behavioral.chainofresponsibility;

import java.util.Objects;

/**
 * Copyright (C), 2020
 * FileName: MajorManager
 *
 * @author: xieyufeng
 * @date: 2020/10/13 17:47
 * @description:
 */
public class MajorManager extends Manager {

    @Override
    public void handleRequest(RequestMeta request) {

        if (Objects.equals(request.getRequestType(), RequestTypeEnum.HOLIDAY.getRequestType()) && request.getNum() <= 4) {
            System.out.println("总监【name="+ this.getName() +"】已批准"+ request.getName() + request.getNum() +"天请假申请！");
        } else if (Objects.equals(request.getRequestType(), RequestTypeEnum.RAISE.getRequestType()) && request.getNum() <= 1500) {
            System.out.println("总监【name="+ this.getName() +"】已批准"+ request.getName() + request.getNum() +"的加薪申请！");
        } else {
            if (Objects.nonNull(this.getNextLeader())) {
                this.getNextLeader().handleRequest(request);
            }
        }
    }
}
