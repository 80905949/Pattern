package com.example.pattern.day15_command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> commands = new ArrayList<>();
    public void setCommands(Command c){
        commands.add(c);
    }
    public void go(){
        for(Command c : commands){
            c.execute();
        }
        commands.clear();
    }
}
