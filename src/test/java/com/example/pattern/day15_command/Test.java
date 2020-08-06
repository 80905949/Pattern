package com.example.pattern.day15_command;

import com.example.pattern.day15_command.impl.BuyStock;
import com.example.pattern.day15_command.impl.SellStock;

public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buy = new BuyStock(stock);
        SellStock sell = new SellStock(stock);

        Broker broker = new Broker();
        //买
        broker.setCommands(buy);
        broker.setCommands(buy);
        broker.setCommands(buy);
        broker.setCommands(buy);
        broker.setCommands(buy);
        broker.setCommands(buy);
        //卖
        broker.setCommands(sell);
        broker.go();//批量执行
    }
}
