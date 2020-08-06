package com.example.demo;

import java.util.Arrays;

public class main1 {
    public static void main(String[] args) {
        int[] g = {1,2,3,4};
        int[] s = {1,2,3};
        System.out.println(a(g,s));
    }
    private static int a(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0;
        int si = 0;
        while(gi < g.length && si < s.length){
            if(g[gi] <= s[si]){
                gi++;
            }
            si++;
        }
        return gi;
    }
}
