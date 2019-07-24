package com.seleniummaster.classtutorial;

public abstract class GraphicObject {
    int x,y;
    //this method has implementation
    void moveTo(int newX,int newY){

        System.out.println(String.format("This object is moved to location %d,%d",newX,newY));

    }
    //add abstract methods
    abstract void draw();
    abstract void resize();
}
