package com.example.pattern.day6_adapter.impl;

import com.example.pattern.day6_adapter.Media;

public class Mp5Player implements Media {
    @Override
    public void play(String file) {
        System.out.println("Play Mp5 " + file);
    }
}
