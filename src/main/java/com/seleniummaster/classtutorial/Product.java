package com.seleniummaster.classtutorial;

public class Product {
    private String name;
    private String category;
    private  double price;
    private  double increaseprice;
    private  double reduceprice;
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Product() {

        }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

public void increaseprice(double increaseprice){
    System.out.println(increaseprice);
}
public void reduceprice(double reduceprice){
    System.out.println(reduceprice);
}

    public void increaseprice() {
    }
}
