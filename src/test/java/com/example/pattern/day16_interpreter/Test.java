package com.example.pattern.day16_interpreter;

import com.example.pattern.day16_interpreter.impl.AndExpression;
import com.example.pattern.day16_interpreter.impl.Condition;

public class Test {
    public static void main(String[] args) {
        Expression condition1 = new Condition("John");
        Expression condition2 = new Condition("Male");

        AndExpression and = new AndExpression(condition1,condition2);

        System.out.println("The text includes 'John' and 'Male' ? " + and.interpreter("The text includes 'John' and 'Male' ? "));
    }
}
