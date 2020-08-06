package com.example.pattern.day4_builder.impl;

import com.example.pattern.day4_builder.Pack;

public class Box implements Pack {
    @Override
    public String container() {
        return "Box";
    }
}
