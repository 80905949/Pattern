package com.example.pattern.day22_null;

import com.example.pattern.day22_null.impl.NullCustomer;
import com.example.pattern.day22_null.impl.RealCustomer;

public class CustomerFactory {
    public static final String[] names = {"Bob","Tom","John"};

    public static AbstractCustomer getCustomer(String name){
        for(String n : names){
            if(n.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
