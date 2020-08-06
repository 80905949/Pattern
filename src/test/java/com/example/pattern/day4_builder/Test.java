package com.example.pattern.day4_builder;

import com.example.pattern.day4_builder.impl.RedDrink;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        Bill bill = order.Red();
        bill.addItem(new RedDrink());//套餐饮料不够 多点一杯
        bill.showItems();
        bill.getCost();

        Bill bill2 = order.Green();
        bill2.showItems();
        bill2.getCost();
    }
}
