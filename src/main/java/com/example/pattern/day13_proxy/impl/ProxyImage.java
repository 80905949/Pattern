package com.example.pattern.day13_proxy.impl;

import com.example.pattern.day13_proxy.Image;

public class ProxyImage implements Image {
    private RealImage realImage;
    public ProxyImage() {}

    @Override
    public void load() {
        if(realImage == null){
            realImage = new RealImage();
        }
        realImage.load();
    }
}
