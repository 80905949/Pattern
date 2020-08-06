package com.example.pattern.day11_facade.impl;

import com.example.pattern.day11_facade.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
