package com.example.pattern.day10_decorator.impl;

import com.example.pattern.day10_decorator.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
