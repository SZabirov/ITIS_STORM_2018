package com.company;

import java.util.Scanner;

public class TaxiCost {
    public static void main(String[] args) {
        System.out.println("Введите расстояние:");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        int kmCost = 15;
        double drivePrice = s * kmCost;
        if (s >= 15) {
            System.out.println("Применена скидка 5%");
            drivePrice = (drivePrice / 100) * 95;
        }
        System.out.println("Стоимость: " + drivePrice);
    }
}
