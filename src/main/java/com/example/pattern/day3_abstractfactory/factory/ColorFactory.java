package com.example.pattern.day3_abstractfactory.factory;

import com.example.pattern.day3_abstractfactory.Color;
import com.example.pattern.day3_abstractfactory.Shape;
import com.example.pattern.day3_abstractfactory.impl.Green;
import com.example.pattern.day3_abstractfactory.impl.Red;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color){
        switch (color) {
            case "red":
                return new Red();
            case "green":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
