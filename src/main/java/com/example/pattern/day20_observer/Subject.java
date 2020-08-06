package com.example.pattern.day20_observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> list = new ArrayList<>();
    private int num;

    public int getNum() {
        return num;
    }

    public void change(int num) {
        this.num = num;
        this.notifyAllObserver();
    }

    public void addObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    private void notifyAllObserver(){
        for(Observer observer : list){
            observer.execute();
        }
    }
}
