package com.example.pattern.day7_bridge.impl;

import com.example.pattern.day7_bridge.Draw;
import com.example.pattern.day7_bridge.Shape;

public class Circle extends Shape {
    private int x;
    private int y;

    public Circle(Draw draw, int x, int y) {
        super(draw);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        draw.draw(x, y);
    }
}
