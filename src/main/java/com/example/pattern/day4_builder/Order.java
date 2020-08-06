package com.example.pattern.day4_builder;

import com.example.pattern.day4_builder.impl.RedDrink;
import com.example.pattern.day4_builder.impl.RedHamburg;

//套餐
public class Order {
    //红色套餐
    public Bill Red(){
        System.out.println("红色套餐-已上市");
        Bill bill = new Bill();
        bill.addItem(new RedDrink());
        bill.addItem(new RedHamburg());
        return bill;
    }
    //绿色套餐-未上市
    public Bill Green(){
        System.out.println("绿色套餐-未上市");
        return new Bill();
    }
}
