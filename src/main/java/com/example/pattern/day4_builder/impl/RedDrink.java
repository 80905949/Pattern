package com.example.pattern.day4_builder.impl;

public class RedDrink extends Drink {
    @Override
    public String name() {
        return "Red Drink";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
