package com.example.pattern.day3_abstractfactory.factory;

import com.example.pattern.day3_abstractfactory.Color;
import com.example.pattern.day3_abstractfactory.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
