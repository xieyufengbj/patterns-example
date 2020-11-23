package com.example.behavioral.mediator;

import java.util.Date;

/**
 * Copyright (C), 2020
 * FileName: ChatRoom
 *
 * @author: xieyufeng
 * @date: 2020/11/23 17:48
 * @description:
 */
public class ChatRoom {

    public static void sendMessage(User user, String context) {
        System.out.println(new Date() + " user= " + user.getName() + ", sendMessage:" + context);
    }
}
