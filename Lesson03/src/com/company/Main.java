package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {2, 5, 9, 1, 4, 6};
	    int[] arr2 = {7, 5, 12, 33};
	    int[] arr3 = {73, 5, 12, 334};
	    sort(arr);
	    sort(arr2);
	    sort(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    static void sort(int[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            int indexOfMax = 0;
            for (int i = 0; i < n - j; i++) {
                if (arr[i] > arr[indexOfMax]) {
                    indexOfMax = i;
                }
            }
            int buf = arr[indexOfMax];
            arr[indexOfMax] = arr[n - 1 - j];
            arr[n - 1 - j] = buf;
        }
    }
}
