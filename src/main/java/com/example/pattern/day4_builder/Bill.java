package com.example.pattern.day4_builder;

import java.util.ArrayList;
import java.util.List;

//账单
public class Bill {
    private List<Item> list = new ArrayList<Item>();

    public void addItem(Item item){
        list.add(item);
    }
    public void getCost(){
        float cost = 0.0f;
        for(Item e : list){
            cost += e.price();
        }
        System.out.println("总计消费 "+ cost);
    }
    public void showItems(){
        for (Item e : list) {
            System.out.print(" 消费产品 "+e.name());
            System.out.print(" 使用容器 "+e.use().container());
            System.out.println(" 价格 "+e.price());
        }
    }
}
