package com.stackroute;

public class StudentGrade {
    public float Average(int marks[])
    {
        int n=marks.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+marks[i];
        }
        float avg=(float)sum/(float)n;
        //   System.out.println(avg);

        return avg;
    }

    public int Max(int marks[])
    {
        int n=marks.length;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(marks[i]>m)
            {
                m=marks[i];
            }
        }
        return m;
    }

    public int Min(int marks[])
    {
        int n=marks.length;
        int m=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(marks[i]<m)
            {
                m=marks[i];
            }
        }
        return m;
    }
}
