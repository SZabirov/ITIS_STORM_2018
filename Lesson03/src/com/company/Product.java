package com.company;

public class Product {
    int id;
    String name;
    int price;
    int count;
    int daysAlive;
    int kkal;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", daysAlive=" + daysAlive +
                ", kkal=" + kkal +
                '}';
    }
}
