package com.example.pattern.day20_observer;

public abstract class Observer {
    public Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void execute();
}
