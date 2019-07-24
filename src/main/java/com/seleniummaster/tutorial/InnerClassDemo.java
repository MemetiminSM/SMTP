package com.seleniummaster.tutorial;

public class InnerClassDemo {
        public static void main(String[] args) {
           InnerClassB.multiplicationTable(9); //calling Static class with static method

           InnerClassDemo innerClassDemo=new InnerClassDemo();
           InnerClassDemo.InnerClassA classA=innerClassDemo.new InnerClassA();
            classA.addTwoNumbers(10,20);
    }
    public void print()
    {
        InnerClassA innerClassA=new InnerClassA();
        System.out.println(innerClassA.addTwoNumbers(10,20));
    }
    //define inner class A
    class InnerClassA{
        private int addTwoNumbers(int a, int b)
        {
            System.out.println(String.format("%d+%d=%d",a,b,a+b));
            return a+b;
        }
    }
    //define inner static class B
    static class InnerClassB
    {
        private static void multiplicationTable(int end)
        {
            for(int i=1;i<=end;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(String.format("%d*%d=%d  ",i,j,i*j));
                }
                System.out.println();
            }
        }
    }
}
