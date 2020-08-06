package com.example.pattern.day11_facade;

import com.example.pattern.day11_facade.impl.Circle;
import com.example.pattern.day11_facade.impl.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
