package com.example.pattern.day4_builder.impl;

public class RedHamburg extends Hamburg {
    @Override
    public String name() {
        return "Red Hamburg";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
