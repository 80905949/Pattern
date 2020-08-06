package com.example.pattern.day10_decorator.impl;

import com.example.pattern.day10_decorator.Shape;
import com.example.pattern.day10_decorator.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRed();
    }

    private void setRed(){
        System.out.println("Print Red");
    }
}
