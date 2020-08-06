package com.example.pattern.day10_decorator;

import com.example.pattern.day10_decorator.impl.Circle;
import com.example.pattern.day10_decorator.impl.RedShapeDecorator;
import com.example.pattern.day10_decorator.impl.Square;

public class Test {
    public static void main(String[] args) {
        System.out.println("普通圆");
        Shape s1 = new Circle();
        s1.draw();

        System.out.println("红色装饰圆");
        Shape sd = new RedShapeDecorator(new Circle());
        sd.draw();
        System.out.println("红色装饰正方形");
        Shape sd2 = new RedShapeDecorator(new Square());
        sd2.draw();
    }
}
