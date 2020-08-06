package com.example.demo;

import java.util.ArrayList;

public class Stack {
    public Stack() {}

    ArrayList<Object> list = new ArrayList<>();

    //入栈
    public void push(Object o){
        list.add(o);
    }
    //出栈
    public Object pop(){
        Object o = list.get(list.size() - 1);
        list.remove(o);
        return o;
    }
    //栈是否为空
    public boolean isEmpty(){
        return list.isEmpty();
    }
    //栈大小
    public int size(){
        return list.size();
    }
    //打印栈元素
    @Override
    public String toString(){
        return String.valueOf(list);
    }
}
class mainStack{
    public static void main(String[] args) {
        //创建一个栈
        Stack stack = new Stack();
        //入栈
        for(int i=1;i<=10;i++){
            stack.push(i);
        }
        //出栈
        while(!stack.isEmpty()){
            System.out.println("栈：" + stack.toString() + "\t栈大小为：" + stack.size() + "\t出栈元素为：" + stack.pop());
        }
    }
}
