package com.seleniummaster.classtutorial;

import java.awt.image.ColorModel;
import java.util.ArrayList;

public class CarPrint {
    public static void main(String[] args){

        ArrayList<Car> cars=new ArrayList<>();

        cars.add(new Car("SUV","Toyota","RAV4",2014,300000, "silver",false,"V6"));
        cars.add(new Car("Sports","Dodge","challenger",2015,40000,"grey",true,"v3"));
        //print

        for (Car eachCar:cars){

            System.out.println(String.format("%s,%s,%s,%d,%.1f,%s,%s,%s",eachCar.getType(),eachCar.getMake(),eachCar.getModel(),eachCar.getYear(),eachCar.getPrice(),eachCar.getColor(),eachCar.isNEW(),eachCar.getEngintype()));

        }

    }
}
