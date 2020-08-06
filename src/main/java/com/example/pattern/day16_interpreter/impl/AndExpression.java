package com.example.pattern.day16_interpreter.impl;

import com.example.pattern.day16_interpreter.Expression;

public class AndExpression implements Expression {
    private Expression condition1;
    private Expression condition2;

    public AndExpression(Expression condition1, Expression condition2) {
        this.condition1 = condition1;
        this.condition2 = condition2;
    }

    @Override
    public boolean interpreter(String context) {
        return condition1.interpreter(context) && condition2.interpreter(context);
    }
}
