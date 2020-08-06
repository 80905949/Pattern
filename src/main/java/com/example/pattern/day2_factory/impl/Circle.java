package com.example.pattern.day2_factory.impl;

import com.example.pattern.day2_factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
