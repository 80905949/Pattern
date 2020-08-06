package com.example.pattern.day15_command.impl;

import com.example.pattern.day15_command.Command;
import com.example.pattern.day15_command.Stock;

public class SellStock implements Command {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
