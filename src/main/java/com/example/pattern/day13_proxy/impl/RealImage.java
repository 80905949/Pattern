package com.example.pattern.day13_proxy.impl;

import com.example.pattern.day13_proxy.Image;

public class RealImage implements Image {
    public RealImage() {}

    @Override
    public void load() {
        System.out.println("loading real image");
    }
}
