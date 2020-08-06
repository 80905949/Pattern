package com.example.pattern.day22_null;

public class Test {
    public static void main(String[] args) {
        AbstractCustomer c1 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer c2 = CustomerFactory.getCustomer("Jack");

        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }
}
