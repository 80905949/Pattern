package com.example.pattern.day20_observer;

import com.example.pattern.day20_observer.impl.BinaryObserver;
import com.example.pattern.day20_observer.impl.HexObserver;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);

        subject.change(21);

        subject.change(20);
    }
}
