package com.example.pattern.day3_abstractfactory.produce;

import com.example.pattern.day3_abstractfactory.factory.AbstractFactory;
import com.example.pattern.day3_abstractfactory.factory.ColorFactory;
import com.example.pattern.day3_abstractfactory.factory.ShapeFactory;

public class FactoryProduce {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
