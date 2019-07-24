package com.seleniummaster.classtutorial;



public class Calculator implements ISimpleCalculator ,IScientificCalculator{

    public double addTwoNumbers(double a, double b) {
        return a+b;
    }

    public int multiplyTwoNumbers(int x, int y) {
        return x*y;
    }

    public int subtractTwoNumbers(int n1, int n2) {
        return n1-n2;
    }

    public double divideTwoNumbers(double d1, double d2) {
        if (d2!=0)
            return d1/d2;
        else
        return 0;

        }
        public static void main(String[] args){

        //use simple calcualtor interface
            System.out.println(ISimpleCalculator.information);
        ISimpleCalculator simpleCalculator=new Calculator();
            System.out.println(simpleCalculator.addTwoNumbers(10,50));
            System.out.println(simpleCalculator.multiplyTwoNumbers(5,6));
            System.out.println(simpleCalculator.divideTwoNumbers(10,5));
            System.out.println(simpleCalculator.subtractTwoNumbers(100,80));
            // use scientific calculator interfaces
            IScientificCalculator scientificCalculator=new Calculator();
            System.out.println(scientificCalculator.calculatorPower(10,2));
            System.out.println(scientificCalculator.calculatorRoot(9));
            System.out.println(scientificCalculator.calculatorRectangleArea(5,10));

        }
//this section for scientific interfaces
    @Override
    public double calculatorPower(double base, double power) {
        return Math.pow(base,power);
    }

    @Override
    public double calculatorRoot(double x) {
        return Math.sqrt(x);
    }

    @Override
    public int calculatorRectangleArea(int length, int width) {
        return length*width;
    }
}


