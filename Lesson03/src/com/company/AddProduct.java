package com.company;

import java.io.*;

public class AddProduct {
    public static void main(String[] args) throws IOException {
        File f = new File("products.txt");
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(f, true));
        writer.newLine();

        writer.write("abc");
        writer.close();
    }
}
