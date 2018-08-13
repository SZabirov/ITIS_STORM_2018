package com.company;

public class Factorial {
    public static void main(String[] args) {
        int f = 1;
        int i = 1;
        int n = 9;
        while (i <= n) {
            f = f * i;
            i++;
        }
        System.out.println(f);
    }
}
