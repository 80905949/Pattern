package com.example.pattern.day7_bridge;

import com.example.pattern.day7_bridge.impl.Circle;
import com.example.pattern.day7_bridge.impl.DrawGreen;
import com.example.pattern.day7_bridge.impl.DrawRed;

public class Test {
    public static void main(String[] args) {
        Shape red = new Circle(new DrawRed(),10,10);
        red.draw();

        Shape green = new Circle(new DrawGreen(),20,20);
        green.draw();

    }
}
