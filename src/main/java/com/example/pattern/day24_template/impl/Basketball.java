package com.example.pattern.day24_template.impl;

import com.example.pattern.day24_template.Game;

public class Basketball extends Game {
    @Override
    public void init() {
        System.out.println("init game......");
    }

    @Override
    public void start() {
        System.out.println("start basketball......");
    }

    @Override
    public void end() {
        System.out.println("basketball game over.");
    }
}
