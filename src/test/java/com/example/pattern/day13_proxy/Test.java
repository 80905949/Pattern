package com.example.pattern.day13_proxy;

import com.example.pattern.day13_proxy.impl.ProxyImage;

public class Test {
    public static void main(String[] args) {
        Image img = new ProxyImage();
        img.load();
    }
}
