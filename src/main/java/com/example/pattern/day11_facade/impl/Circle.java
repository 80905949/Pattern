package com.example.pattern.day11_facade.impl;

import com.example.pattern.day11_facade.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
