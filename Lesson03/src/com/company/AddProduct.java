package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class AddProduct {
    public static void main(String[] args) throws IOException {
        Product p = new Product(1, "сметана", 50, 20);
        p.setPrice(-70);
        System.out.println(Arrays.toString(getAllFromFile()));
//        System.out.println(p.toString());
//        addProduct(p);

    }

    static void addProduct(Product p) throws IOException {
        File f = new File("products.txt");
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(f, true));
        writer.newLine();
        writer.write((productsCount() + 1) + " " + p.name + " " + p.getPrice() + " " + p.count);
        writer.close();

    }

    static int productsCount() throws FileNotFoundException {
        String s = "https://github.com/SZabirov/ITIS_STORM_2018";
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
            Product p = new Product(Integer.valueOf(elems[0]), elems[1], Integer.valueOf(elems[2]), Integer.valueOf(elems[3]));
            products[i] = p;
            i++;
        }
        return products;
    }
}











