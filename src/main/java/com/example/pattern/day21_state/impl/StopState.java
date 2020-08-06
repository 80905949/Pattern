package com.example.pattern.day21_state.impl;

import com.example.pattern.day21_state.Context;
import com.example.pattern.day21_state.State;

public class StopState implements State {
    @Override
    public void action(Context context) {
        System.out.println("stop action");
        context.setState("stop");
    }
}
