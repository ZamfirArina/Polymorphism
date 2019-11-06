package com.company;

public class Grapefruit extends Product {
   private float  weightOfTheProduct;

    public Grapefruit(String culoare, String countryOfOrigin, float price, float  weightOfTheProduct) {
        super(culoare, countryOfOrigin, price);
        this.weightOfTheProduct = weightOfTheProduct;

    }

    public float getWeightOfTheProduct() {
        return weightOfTheProduct;
    }

    public void setWeightOfTheProduct(float weightOfTheProduct) {

        this.weightOfTheProduct = weightOfTheProduct;
    }

    @Override
    public void taste() {

        System.out.println("Grapefruit amar");
    }

    @Override
    public String toString() {
        return " Weight of the product = " + weightOfTheProduct +
                "\nCuloare = " + culoare +
                "\nCountry Of Origin = " + countryOfOrigin +
                "\nPrice = " + price + "\n";
    }
}