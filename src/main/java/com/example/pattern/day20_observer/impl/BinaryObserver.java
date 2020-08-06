package com.example.pattern.day20_observer.impl;

import com.example.pattern.day20_observer.Observer;
import com.example.pattern.day20_observer.Subject;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        super(subject);
        super.subject.addObserver(this);
    }

    @Override
    public void execute() {
        System.out.println("Binary observer: " + Integer.toBinaryString(super.subject.getNum()));
    }
}
