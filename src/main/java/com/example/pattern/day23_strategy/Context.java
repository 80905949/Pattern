package com.example.pattern.day23_strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int execute(int n1,int n2){
        return this.strategy.action(n1,n2);
    }
}
