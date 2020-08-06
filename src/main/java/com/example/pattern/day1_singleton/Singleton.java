package com.example.pattern.day1_singleton;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void say(){
        System.out.println("Singleton is create");
    }
}