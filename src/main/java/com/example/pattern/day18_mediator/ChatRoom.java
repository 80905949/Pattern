package com.example.pattern.day18_mediator;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date() + " : " + user.getName() + " say " + message);
    }
}
