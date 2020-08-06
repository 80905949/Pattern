package com.example.pattern.day14_chain;

public abstract class Logger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public int level;
    public Logger next;

    public void log(int level,String msg){
        if(this.level == level){
            write(msg);
        }
        if(next != null){
            next.log(level, msg);
        }
    }
    public abstract void write(String msg);
}
