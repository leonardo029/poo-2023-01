package com.github.Leonardo029.poo-2023-01.t07;

public class TestaSomaNaturais {
    public static long SomaNaturais(int n){
        int c = 1;
        long s = 0;
        while (c <= n) {
            s = s+c;
            c = c+1;
        }
    }

    public static void main(String[] args){
        System.out.println(SomaNaturais(10));
    }
}
