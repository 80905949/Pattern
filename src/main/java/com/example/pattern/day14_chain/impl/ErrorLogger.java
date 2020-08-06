package com.example.pattern.day14_chain.impl;

import com.example.pattern.day14_chain.Logger;

public class ErrorLogger extends Logger {
    public ErrorLogger(int level, Logger next) {
        this.level = level;
        this.next = next;
    }

    @Override
    public void write(String msg) {
        System.out.println("ERROR：" + msg);
    }
}
