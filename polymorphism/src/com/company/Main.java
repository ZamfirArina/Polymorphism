package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> fruits = new ArrayList<Product>();
        fruits.add(new Grapefruit("Rozalie", "Turcia", 50, 500 ));
        fruits.add(new Ananas("Galben", "Costa Rica", 100));

        for (Product product : fruits) {
            System.out.println(product.toString());
            product.taste();
        }
    }
}