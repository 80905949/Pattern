package com.example.pattern.day2_factory.impl;

import com.example.pattern.day2_factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
