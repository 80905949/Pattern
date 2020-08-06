package com.example.pattern.day21_state.impl;

import com.example.pattern.day21_state.Context;
import com.example.pattern.day21_state.State;

public class StartState implements State {
    @Override
    public void action(Context context) {
        System.out.println("start action");
        context.setState("start");
    }
}
