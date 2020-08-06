package com.example.pattern.day24_template;

import com.example.pattern.day24_template.impl.Basketball;
import com.example.pattern.day24_template.impl.Football;

public class Test {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();

        Game basketball = new Basketball();
        basketball.play();
    }
}
