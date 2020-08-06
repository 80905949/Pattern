package com.example.pattern.day17_iterator.impl;

import com.example.pattern.day17_iterator.Container;
import com.example.pattern.day17_iterator.Iterator;

public class NameContainer implements Container {
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
