package com.seleniummaster.classtutorial;

public class Circle extends GraphicObject{
    @Override
    void draw() {
        System.out.println(" I draw a circle");
    }

    @Override
    void resize() {
        System.out.println(" I have resized the circle");
    }
    public static void main(String[] args){


      Circle circle=new Circle();
      circle.draw();
      circle.moveTo(100,200);
      circle.resize();
    }
}
