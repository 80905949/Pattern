package com.example.pattern.day3_abstractfactory;

import com.example.pattern.day3_abstractfactory.factory.AbstractFactory;
import com.example.pattern.day3_abstractfactory.produce.FactoryProduce;

public class Test {
    public static void main(String[] args) {
        //形状
        AbstractFactory sf = FactoryProduce.getFactory("shape");
        Shape c = sf.getShape("circle");
        Shape s = sf.getShape("square");

        c.draw();
        s.draw();
        //涂色
        AbstractFactory cf = FactoryProduce.getFactory("color");
        Color red = cf.getColor("red");
        Color green = cf.getColor("green");

        red.paint();
        green.paint();
    }
}
