package com.example.pattern.day9_composite;

import java.util.ArrayList;
import java.util.List;

public class Depart {
    private String name;
    private List<Depart> under;

    public Depart(String name) {
        this.name = name;
        this.under = new ArrayList<>();
    }

    public void add(Depart depart){
        this.under.add(depart);
    }

    public void remove(Depart depart){
        this.under.remove(depart);
    }

    public List<Depart> getUnders(){
        return this.under;
    }

    public String getName() {
        return name;
    }
}
