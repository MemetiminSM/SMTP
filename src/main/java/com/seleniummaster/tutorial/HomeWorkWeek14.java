package com.seleniummaster.tutorial;
import java.util.*;

public class HomeWorkWeek14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i+" ");
            }
        }

    }
}
