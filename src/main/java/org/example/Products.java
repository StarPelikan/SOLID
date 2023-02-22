package org.example;

import java.util.HashMap;
import java.util.Map;

public class Products {
    private static HashMap<String, Integer> products = new HashMap<>();
    // В классе Basket есть  массив Purchase[] purchases, размер которого равен количеству ассортимента
    // поэтому указал мапу products как static.
    static {
        products.put("Хлеб", 50);
        products.put("Масло", 150);
        products.put("Колбаса", 300);
        products.put("Пирожок", 50);
    }

    public static HashMap<String, Integer> getProducts() {
        return products;
    }

    public static void showProducts () {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}
