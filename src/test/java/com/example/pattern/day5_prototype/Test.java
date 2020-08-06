package com.example.pattern.day5_prototype;

public class Test {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape s1 = ShapeCache.getShape(1);
        s1.draw();
        System.out.println(s1.getType());

        Shape s2 = ShapeCache.getShape(2);
        s2.draw();
        System.out.println(s2.getType());
    }
}
