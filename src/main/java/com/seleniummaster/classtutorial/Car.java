package com.seleniummaster.classtutorial;

public class Car {
   private String type;
   private  String make;
   private String model;
    private int year;
    private double price;
   private String color;
   private  boolean isNEW;
   private String engintype;
   //Create defaul construactor


    public Car() {
    }

    //create constract with argument

    public Car(String type, String make, String model, int year, double price, String color, boolean isNEW, String engintype) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.isNEW = isNEW;
        this.engintype = engintype;
    }
    //generate get method to get instance variables

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isNEW() {
        return isNEW;
    }

    public String getEngintype() {
        return engintype;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNEW(boolean NEW) {
        isNEW = NEW;
    }

    public void setEngintype(String engintype) {
        this.engintype = engintype;
    }
}
