package com.example.pattern.day12_flyweight;

import com.example.pattern.day12_flyweight.impl.Circle;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String,Shape> map = new HashMap<>();
    public static Shape getCircle(String color){
        Shape s = map.get(color);
        if(s == null){
            s = new Circle(color);
            map.put(color, s);
        }
        return s;
    }
}
