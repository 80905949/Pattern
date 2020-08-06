package com.example.pattern.day25_visitor;

import com.example.pattern.day25_visitor.impl.Computer;
import com.example.pattern.day25_visitor.impl.ComputerVisitor;

public class Test {
    public static void main(String[] args) {
        ComputerPart part = new Computer();

        part.insert(new ComputerVisitor());
    }
}
