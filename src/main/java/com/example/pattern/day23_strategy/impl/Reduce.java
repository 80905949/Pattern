package com.example.pattern.day23_strategy.impl;

import com.example.pattern.day23_strategy.Strategy;

public class Reduce implements Strategy {
    @Override
    public int action(int n1, int n2) {
        return n1 -n2;
    }
}
