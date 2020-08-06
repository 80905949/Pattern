package com.example.pattern.day17_iterator.impl;

import com.example.pattern.day17_iterator.Iterator;

public class NameIterator implements Iterator {
    private String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    private int index = 0;
    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        return this.hasNext() ? names[index++] : null;
    }
}
