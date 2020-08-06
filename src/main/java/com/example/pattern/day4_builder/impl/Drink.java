package com.example.pattern.day4_builder.impl;

import com.example.pattern.day4_builder.Item;
import com.example.pattern.day4_builder.Pack;

public abstract class Drink implements Item {
    @Override
    public abstract String name();//饮料名字不确定交给子类实现

    @Override
    public Pack use() {
        return new Bottle();//饮料默认使用瓶子装
    }

    @Override
    public abstract float price();
}
