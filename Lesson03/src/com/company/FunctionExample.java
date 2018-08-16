package com.company;

public class FunctionExample {
    public static void main(String[] args) {
        int res = sum(10, 15);
        System.out.println(res);
    }

    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    static int fact (int n) {
        int f = 1;
        for (int i = 0; i < n; i++) {
            f *= i;
        }
        return f;
    }
}
