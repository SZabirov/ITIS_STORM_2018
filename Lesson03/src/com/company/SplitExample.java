package com.company;

public class SplitExample {
    public static void main(String[] args) {
        String s = "34,56,253,1";
        String[] arr = s.split(",");
        System.out.println(arr[0]);
    }
}
