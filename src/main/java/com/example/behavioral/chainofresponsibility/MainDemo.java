package com.example.behavioral.chainofresponsibility;

/**
 * Copyright (C), 2020
 * FileName: MainDemo
 *
 * @author: xieyufeng
 * @date: 2020/10/13 17:54
 * @description:
 */
public class MainDemo {

    public static void main(String[] args) {

        Manager commonManager = new CommonManager();
        commonManager.setName("JingLi");
        Manager majorManager = new MajorManager();
        majorManager.setName("ZongJian");
        Manager gereralManager = new GeneralManager();
        gereralManager.setName("ZongJingLi");
        commonManager.setNextLeader(majorManager);
        majorManager.setNextLeader(gereralManager);

        RequestMeta requestMeta1 = new RequestMeta("张三", 2, RequestTypeEnum.HOLIDAY.getRequestType());
        RequestMeta requestMeta2 = new RequestMeta("李四", 4, RequestTypeEnum.HOLIDAY.getRequestType());
        RequestMeta requestMeta3 = new RequestMeta("王五", 8, RequestTypeEnum.HOLIDAY.getRequestType());
        RequestMeta requestMeta4 = new RequestMeta("小六", 15, RequestTypeEnum.HOLIDAY.getRequestType());
        commonManager.handleRequest(requestMeta1);
        commonManager.handleRequest(requestMeta2);
        commonManager.handleRequest(requestMeta3);
        commonManager.handleRequest(requestMeta4);

        RequestMeta requestMeta5 = new RequestMeta("张三", 500, RequestTypeEnum.RAISE.getRequestType());
        RequestMeta requestMeta6 = new RequestMeta("李四", 1500, RequestTypeEnum.RAISE.getRequestType());
        RequestMeta requestMeta7 = new RequestMeta("王五", 3000, RequestTypeEnum.RAISE.getRequestType());
        RequestMeta requestMeta8 = new RequestMeta("小六", 10000, RequestTypeEnum.RAISE.getRequestType());
        commonManager.handleRequest(requestMeta5);
        commonManager.handleRequest(requestMeta6);
        commonManager.handleRequest(requestMeta7);
        commonManager.handleRequest(requestMeta8);
    }
}
