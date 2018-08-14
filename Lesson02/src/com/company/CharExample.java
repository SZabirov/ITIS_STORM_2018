package com.company;

import java.util.Scanner;

public class CharExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        if (c1 >= 'A' & c1 <= 'Z') {
            char c2 = (char) (c1 + 32);
            System.out.println(c2);
        } else {
            if (c1 >= 'a' & c1 <= 'z') {
                char c2 = (char) (c1 - 32);
                System.out.println(c2);
            }
        }
    }
}
