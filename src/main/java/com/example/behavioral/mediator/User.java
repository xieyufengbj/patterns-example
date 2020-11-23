package com.example.behavioral.mediator;

import lombok.Data;

/**
 * Copyright (C), 2020
 * FileName: User
 *
 * @author: xieyufeng
 * @date: 2020/11/23 17:49
 * @description:
 */
@Data
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String context) {
        ChatRoom.sendMessage(this, context);
    }
}
