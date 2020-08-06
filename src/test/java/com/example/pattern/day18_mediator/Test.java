package com.example.pattern.day18_mediator;

public class Test {
    public static void main(String[] args) {
        User john = new User("John");
        User tom = new User("Tom");

        john.sendMessage("Hi Tom!");
        tom.sendMessage("Hi John!");
    }
}
