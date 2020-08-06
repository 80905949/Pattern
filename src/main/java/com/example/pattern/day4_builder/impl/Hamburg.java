package com.example.pattern.day4_builder.impl;

import com.example.pattern.day4_builder.Item;
import com.example.pattern.day4_builder.Pack;

public abstract class Hamburg implements Item {
    @Override
    public abstract String name();//汉堡名字不确定交给子类实现

    @Override
    public Pack use() {
        return new Box();//汉堡默认盒子打包
    }

    @Override
    public abstract float price();//汉堡价格不确定交给子类实现
}
