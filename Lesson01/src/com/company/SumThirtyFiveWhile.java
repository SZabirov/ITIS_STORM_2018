package com.company;


public class SumThirtyFiveWhile {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 35) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
