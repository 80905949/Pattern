package com.example.pattern.day2_factory.factory;

import com.example.pattern.day2_factory.Shape;
import com.example.pattern.day2_factory.impl.Circle;
import com.example.pattern.day2_factory.impl.Square;

public class ShapeFactory {
    public Shape getShape(String shape){
        switch (shape) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
