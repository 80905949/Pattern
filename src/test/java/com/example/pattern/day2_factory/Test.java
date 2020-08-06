package com.example.pattern.day2_factory;

import com.example.pattern.day2_factory.factory.ShapeFactory;

public class Test {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape s1 = sf.getShape("circle");
        s1.draw();

        Shape s2 = sf.getShape("square");
        s2.draw();

    }
}
