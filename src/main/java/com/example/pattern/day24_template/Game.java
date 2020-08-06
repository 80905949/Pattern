package com.example.pattern.day24_template;

public abstract class Game {
    public abstract void init();
    public abstract void start();
    public abstract void end();

    public final void play(){
        init();
        start();
        end();
    }
}
