package com.example.pattern.day25_visitor.impl;

import com.example.pattern.day25_visitor.Visitor;

public class ComputerVisitor implements Visitor {
    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("insert into keyboard");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("insert into mouse");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("start computer");
    }
}
