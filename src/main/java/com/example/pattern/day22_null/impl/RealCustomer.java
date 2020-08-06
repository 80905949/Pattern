package com.example.pattern.day22_null.impl;

import com.example.pattern.day22_null.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
