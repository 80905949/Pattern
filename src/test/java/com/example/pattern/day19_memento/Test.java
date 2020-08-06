package com.example.pattern.day19_memento;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());//保存状态#3

        originator.setState("state #3");
        System.out.println("当前状态：" + originator.getState());//当前状态#3

        originator.getStateFromMemento(careTaker.get(0));//回退状态#2
        System.out.println("回退状态：" + originator.getState());
    }
}
