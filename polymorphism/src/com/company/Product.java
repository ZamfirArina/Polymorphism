package com.company;

public abstract class Product {
    protected String culoare;
    protected String countryOfOrigin;
    protected float  price;

    public Product(String culoare, String countryOfOrigin, float price) {
        this.culoare = culoare;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {

        this.culoare = culoare;
    }

    public String getCountryOfOrigin() {

        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {

        this.countryOfOrigin = countryOfOrigin;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        this.price = price;
    }

    public abstract void taste();

}