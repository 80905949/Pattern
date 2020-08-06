package com.example.pattern.day9_composite;

public class Test {
    public static void main(String[] args) {
        Depart assistant = new Depart("assistant");
        Depart it = new Depart("it");

        Depart ceo = new Depart("ceo");
        ceo.add(assistant);
        ceo.add(it);

        for(Depart d : ceo.getUnders()){
            System.out.println(d.getName());
        }

        System.out.println();

        //移除it
        ceo.remove(it);

        for(Depart d : ceo.getUnders()){
            System.out.println(d.getName());
        }
    }
}
