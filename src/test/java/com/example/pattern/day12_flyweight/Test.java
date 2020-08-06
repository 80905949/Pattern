package com.example.pattern.day12_flyweight;

import com.example.pattern.day12_flyweight.impl.Circle;

public class Test {
    public static void main(String[] args) {
        for(int i = 0;i < 20;i++){
            Circle circle = (Circle) ShapeFactory.getCircle("red");
            circle.draw();
        }
    }
}
