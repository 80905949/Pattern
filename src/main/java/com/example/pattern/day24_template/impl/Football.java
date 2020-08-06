package com.example.pattern.day24_template.impl;

import com.example.pattern.day24_template.Game;

public class Football extends Game {
    @Override
    public void init() {
        System.out.println("init game......");
    }

    @Override
    public void start() {
        System.out.println("start football game......");
    }

    @Override
    public void end() {
        System.out.println("football game over.");
    }
}
