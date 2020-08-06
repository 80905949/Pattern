package com.example.pattern.day21_state;

import com.example.pattern.day21_state.impl.StartState;
import com.example.pattern.day21_state.impl.StopState;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        StartState start = new StartState();
        start.action(context);
        System.out.println("current state is : " + context.getState());

        StopState stop = new StopState();
        stop.action(context);
        System.out.println("current state is : " + context.getState());
    }
}
