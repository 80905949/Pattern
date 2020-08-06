package com.example.pattern.day3_abstractfactory.factory;

import com.example.pattern.day3_abstractfactory.Color;
import com.example.pattern.day3_abstractfactory.Shape;
import com.example.pattern.day3_abstractfactory.impl.Circle;
import com.example.pattern.day3_abstractfactory.impl.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
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
