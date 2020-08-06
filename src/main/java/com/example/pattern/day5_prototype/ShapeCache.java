package com.example.pattern.day5_prototype;

import com.example.pattern.day5_prototype.impl.Circle;
import com.example.pattern.day5_prototype.impl.Square;

import java.util.Hashtable;

public abstract class ShapeCache {
    private static Hashtable<Integer,Shape> shape = new Hashtable<>();

    public static void loadCache(){
        Circle c = new Circle();
        c.setId(1);
        shape.put(c.getId(),c);

        Square s = new Square();
        s.setId(2);
        shape.put(s.getId(),s);
    }
    public static Shape getShape(int id){
        Shape s = shape.get(id);
        return (Shape) s.clone();
    }

}
