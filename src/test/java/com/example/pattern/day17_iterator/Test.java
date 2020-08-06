package com.example.pattern.day17_iterator;

import com.example.pattern.day17_iterator.impl.NameContainer;

public class Test {
    public static void main(String[] args) {
        NameContainer container = new NameContainer();
        for(Iterator iter = container.getIterator();iter.hasNext();){
            System.out.println("Name container has " + iter.next());
        }
    }
}
