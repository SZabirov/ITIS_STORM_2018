package com.company;

import java.io.*;
import java.util.Scanner;

public class AddProduct {
    public static void main(String[] args) throws IOException {
        Product p = new Product();
        p.name = "сметана";
        p.price = 50;
        p.count = 20;
        System.out.println(p.toString());
        addProduct(p);

    }

    static void addProduct(Product p) throws IOException {
        File f = new File("products.txt");
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(f, true));
        writer.newLine();
        writer.write((productsCount() + 1) + " " + p.name + " " + p.price + " " + p.count);
        writer.close();

    }

    static int productsCount() throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);
        int count = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }
        return count;
    }

    static Product[] getAllFromFile() throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);
        Product[] products = new Product[productsCount()];
        int i = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] elems = line.split(" ");
            Product p = new Product();
            p.id = Integer.valueOf(elems[0]);
            p.name = elems[1];
            p.price = Integer.valueOf(elems[2]);
            p.count = Integer.valueOf(elems[3]);
            products[i] = p;
            i++;
        }
        return products;
    }
}











