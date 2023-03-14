package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        Stock.addProd(new Products("Хлеб", 56), products);
        Stock.addProd(new Products("Масло", 153), products);
        Stock.addProd(new Products("Колбаса", 211), products);
        Stock.addProd(new Products("Пирожок", 45), products);
        Purchase purchase;
        Basket basket = new Basket();
        Stock.toStringProducts(products);
        while (true) {
            System.out.println("Введите два слова: название товара и количество. Или end");
            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine().toLowerCase();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String title = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase = new Purchase(title, count);
            basket.addPurchase(purchase);
        }
        basket.toStringProducts(products);
    }
}
