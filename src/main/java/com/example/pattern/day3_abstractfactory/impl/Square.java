package com.example.pattern.day3_abstractfactory.impl;

import com.example.pattern.day3_abstractfactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}