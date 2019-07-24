package com.seleniummaster.classtutorial;


public class ShapeArea {
    public static void main(String[] args) {
        Rectangle.area(10, 5);
        ShapeArea shapeArea = new ShapeArea();
        shapeArea.calculateCircleArea(3);
    }

    public void calculateCircleArea(double radius) {

        Circle circle = new Circle();
        System.out.println(circle.area(radius));

    }

    class Circle {
        //define a method to calculate the area of the circle
        public double area(double circleRadius) {
            double circleArea = Math.PI * Math.pow(circleRadius, 2);
            return circleArea;
        }

    }

    static class Rectangle {
        //define a static method to calcualte the area of a rectangle
        public static void area(double width, double length) {

            double rectangleArea = width * length;
            System.out.println(String.format("Area of a rectangle %.1f is %.1f", width, length, rectangleArea));

        }
    }
}
