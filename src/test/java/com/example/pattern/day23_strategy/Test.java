package com.example.pattern.day23_strategy;

import com.example.pattern.day23_strategy.impl.Add;
import com.example.pattern.day23_strategy.impl.Reduce;

public class Test {
    public static void main(String[] args) {
        Context c1 = new Context(new Add());
        System.out.println("1 + 2 = " + c1.execute(1,2));

        Context c2 = new Context(new Reduce());
        System.out.println("2 - 1 = " + c2.execute(2,1));
    }
}
