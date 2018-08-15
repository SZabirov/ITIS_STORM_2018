package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Введите имя продукта:");
        String productName = consoleScanner.next();
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            if (arr[1].equals(productName)) {
                System.out.println(arr[2]);
            }
        }

    }
}
