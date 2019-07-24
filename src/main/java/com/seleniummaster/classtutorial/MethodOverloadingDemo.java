package com.seleniummaster.classtutorial;

public class MethodOverloadingDemo {
    // add two integer numbers
    public int addNumbers(int i1,int i2)
    {
        return  i1+i2;

    }
    public long addNumbers(long l1,long l2)
    {
       return l1+l2;

    }

    //add numbers in an arry
    public int addNumbers(int[] a)
    {
      int s=0;
      for (int i=0; i<a.length;i++)
      {

       s=s+a[i];

      }

return s;
    }

    public double addNumbers(double d1,double d2)
    {

      return d1+d2;

    }
}
