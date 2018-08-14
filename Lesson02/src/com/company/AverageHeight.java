package com.company;

import java.util.Scanner;

public class AverageHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int heightSum = 0;
        for (int i = 0; i < n; i++) {
            heightSum = heightSum + arr[i];
        }
        double averageHeight = ((double) heightSum) / n;
        System.out.println(averageHeight);
        int numOfMoreThanAvg = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > averageHeight) {
                numOfMoreThanAvg++;
            }
        }
        System.out.println(numOfMoreThanAvg);
    }
}
