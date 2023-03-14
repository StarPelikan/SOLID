package org.example;

import java.util.Map;

public class Products {
    String name;
    int price;

    public Products(String name, int price) {
        this.name = name.toLowerCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
