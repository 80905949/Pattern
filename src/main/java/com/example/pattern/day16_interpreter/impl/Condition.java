package com.example.pattern.day16_interpreter.impl;

import com.example.pattern.day16_interpreter.Expression;

public class Condition implements Expression {
    private String content;

    public Condition(String content) {
        this.content = content;
    }

    @Override
    public boolean interpreter(String context) {
        return context.contains(content);
    }
}
