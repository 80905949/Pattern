package com.example.pattern.day3_abstractfactory.impl;

import com.example.pattern.day3_abstractfactory.Color;

public class Red implements Color {
    @Override
    public void paint() {
        System.out.println("Paint Red");
    }
}
