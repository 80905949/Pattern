package com.example.pattern.day25_visitor;

import com.example.pattern.day25_visitor.impl.Computer;
import com.example.pattern.day25_visitor.impl.KeyBoard;
import com.example.pattern.day25_visitor.impl.Mouse;

public interface Visitor {
    void visit(KeyBoard keyBoard);
    void visit(Mouse mouse);
    void visit(Computer computer);
}
