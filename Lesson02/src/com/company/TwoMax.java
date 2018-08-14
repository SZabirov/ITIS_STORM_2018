package com.company;

import java.util.Scanner;

public class TwoMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int n = sc.nextInt();
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else {
                if (x > max2) {
                    max2 = x;
                }
            }
        }
        System.out.println("Max1 = " + max1);
        System.out.println("Max2 = " + max2);
    }
}
