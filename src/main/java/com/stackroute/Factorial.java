package com.stackroute;

public class Factorial {
    public  String[] factorial()
    {
        int n=1;
        long num=1;
        long max=Long.MAX_VALUE;
        long[] a=new long[50];
        while(true)
        {
            num=num*(long)n;
            a[n-1]=num;
            n++;

            if(num<0)
            {
                break;
            }
        }
        String[] s=new String[n-1];
        for(int i=0;i<n-2;i++)
        {
            s[i]="Factorial of "+(i+1)+" is "+a[i];
        }
        s[n-2]="Factorial of "+(n-1)+" is Out of Range";
        return s;
    }
}
