package com.example.demo;

public class RandName {
    private static final String[] chinese = {
            "企","财","税","大","优",
            "通","云","诚","信","达"
    };

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        for(int i = 0;i < 1000;i++){
            int index = (int) (2 + Math.random()*3);
            if(index == 2){
                System.out.println(chinese[(int) (Math.random()*chinese.length)]+chinese[(int) (Math.random()*chinese.length)]);
            }
            if(index == 3){
                System.out.println(chinese[(int) (Math.random()*chinese.length)]+chinese[(int) (Math.random()*chinese.length)]+chinese[(int) (Math.random()*chinese.length)]);
            }
            if(index == 4){
                System.out.println(chinese[(int) (Math.random()*chinese.length)]+chinese[(int) (Math.random()*chinese.length)]+chinese[(int) (Math.random()*chinese.length)]);
            }
        }
    }
}
