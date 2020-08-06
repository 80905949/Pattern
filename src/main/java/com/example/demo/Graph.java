package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Graph {

}
class main{
    public static void main(String[] args) {
        //自动装箱 int -> Integer
        int i = 100;
        Integer j = Integer.valueOf(i);//j = i;
        System.out.println(j);
        //自动拆箱 Integer -> int
        Integer ii = 100;
        int jj = ii.intValue();//jj = ii;
        System.out.println(jj);


        /**
         * 小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
         *
         * 魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
         *
         * 魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
         *
         * 小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。
         *
         * 输入描述: 输入包括一行,包括一个正整数n(1 ≤ n ≤ 10^9),表示小易需要的魔法币数量。
         *
         * 输出描述: 输出一个字符串,每个字符表示该次小易选取投入的魔法机器。其中只包含字符'1'和'2'。
         */
        /**
         * 输入例子1: 10
         * 2号0个得2 剩余2
         * 2号2个得6 剩余6
         * 1号2个得5 剩余10
         *
         * 输出例子1: 122
         * 2号0个得2 剩余2
         * 2号2个得6 剩余6
         * 2号6个的14 剩余14
         * 2号14个的30 剩余30
         * 2号30个的62 剩余62
         * 2号58个的118 剩余118+4=122
         *
         * 2x+1 数列 1 3 5 7 9 11
         * 2x+2 数列 2 4 6 8 10 12
         */
        int have = 0;
        int need = 10;




    }
    public static int x1(int have){
        return 2 * have + 1;
    }
    public static int x2(int have){
        return 2 * have + 2;
    }
}