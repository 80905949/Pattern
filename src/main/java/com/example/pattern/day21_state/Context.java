package com.example.pattern.day21_state;

public class Context {
    private String state;

    public Context() {
        this.state = null;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
