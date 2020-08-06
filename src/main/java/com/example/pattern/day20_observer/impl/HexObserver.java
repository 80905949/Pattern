package com.example.pattern.day20_observer.impl;

import com.example.pattern.day20_observer.Observer;
import com.example.pattern.day20_observer.Subject;

public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        super(subject);
        super.subject.addObserver(this);
    }

    @Override
    public void execute() {
        System.out.println("Hex observer: " + Integer.toHexString(super.subject.getNum()));
    }
}
