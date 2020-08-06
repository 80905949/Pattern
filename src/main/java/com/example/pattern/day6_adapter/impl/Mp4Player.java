package com.example.pattern.day6_adapter.impl;

import com.example.pattern.day6_adapter.Media;

public class Mp4Player implements Media {
    @Override
    public void play(String file) {
        System.out.println("Play Mp4 " + file);
    }
}
