package com.company;

public class Ananas extends Product {
    public Ananas(String culoare, String countryOfOrigin, float price) {

        super(culoare, countryOfOrigin, price);
    }

    @Override
    public void taste() {

        System.out.println("Ananas dulce");
    }

    @Override
    public String toString() {
        return "Culoare = " + culoare +
                "\nCountry of origin = " + countryOfOrigin +
                "\nPrice = " + price + "\n";

    }
}