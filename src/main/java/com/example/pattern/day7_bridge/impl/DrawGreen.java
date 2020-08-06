package com.example.pattern.day7_bridge.impl;

import com.example.pattern.day7_bridge.Draw;

public class DrawGreen implements Draw {
    @Override
    public void draw(int x, int y) {
        System.out.println("Draw Green x：" + x + " y：" + y);
    }
}
