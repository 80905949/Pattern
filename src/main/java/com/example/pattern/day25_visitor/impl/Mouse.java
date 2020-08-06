package com.example.pattern.day25_visitor.impl;

import com.example.pattern.day25_visitor.ComputerPart;
import com.example.pattern.day25_visitor.Visitor;

public class Mouse implements ComputerPart {
    @Override
    public void insert(Visitor visitor) {
        visitor.visit(this);
    }
}
