package com.example.pattern.day15_command.impl;

import com.example.pattern.day15_command.Command;
import com.example.pattern.day15_command.Stock;

public class BuyStock implements Command {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
