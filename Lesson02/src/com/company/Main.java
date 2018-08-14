package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Max = " + max);
    }
}
