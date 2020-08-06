package com.example.pattern.day3_abstractfactory.impl;

import com.example.pattern.day3_abstractfactory.Color;

public class Green implements Color {
    @Override
    public void paint() {
        System.out.println("Paint Green");
    }
}
