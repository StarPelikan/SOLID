package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Перенес логику заполнения ассортимента товара в наличии, и вывода его на экран в класс Products.
        // Для большего удобства и для того, чтобы размер мапы products использовать в классе Basket
        Products.showProducts();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Basket basket = new Basket();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(product, count);
        }
        long sum = basket.sum(Products.getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}