package com.example.pattern.day25_visitor.impl;

import com.example.pattern.day25_visitor.ComputerPart;
import com.example.pattern.day25_visitor.Visitor;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new KeyBoard(),new Mouse()};
    }

    @Override
    public void insert(Visitor visitor) {
        for(ComputerPart part : parts){
            part.insert(visitor);
        }
    }
}
