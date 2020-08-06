package com.example.pattern.day7_bridge;

public abstract class Shape {
    public Draw draw;

    public Shape(Draw draw) {
        this.draw = draw;
    }

    public abstract void draw();
}
