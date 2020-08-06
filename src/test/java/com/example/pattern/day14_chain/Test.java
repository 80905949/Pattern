package com.example.pattern.day14_chain;

import com.example.pattern.day14_chain.impl.DebugLogger;
import com.example.pattern.day14_chain.impl.ErrorLogger;
import com.example.pattern.day14_chain.impl.InfoLogger;

public class Test {
    public static void main(String[] args) {
        Logger chain = getChain();
        chain.log(Logger.INFO,"this is info");
        chain.log(Logger.DEBUG,"this is debug");
        chain.log(Logger.ERROR,"this is error1");
        chain.log(Logger.ERROR,"this is error2");
    }
    private static Logger getChain(){
        Logger error = new ErrorLogger(Logger.ERROR,null);
        Logger debug = new DebugLogger(Logger.DEBUG,error);
        Logger info = new InfoLogger(Logger.INFO,debug);
        return info;
    }
}
