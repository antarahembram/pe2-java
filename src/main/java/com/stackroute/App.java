package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    /* function to reverse string*/
    public String myreverse(String str)
    {
        int i;
        String rev_str="";
        for(i=str.length()-1;i>=0;i--)
        {
            rev_str=rev_str+str.charAt(i);
        }
      //  System.out.println(rev_str);
        return rev_str;
    }
    /* function to check palindrome*/
    public String isPalindrome(String str)
    {
        String ans="";
        String rev_str=myreverse(str);
        if(rev_str.equals(str))
        {
            ans=ans+"Given string is palindrome";
        }
        else
        {
            ans=ans+"Given string is not palindrome";
        }
        return ans;
    }
    public String isPower(int number)
    {
        int m=number;
        String ans="";
        int flag=0;
        while(number%4==0)
        {
            number=number/4;
            if(number==1)
            {
                flag=1;
                break;
            }
            else if(number<4)
            {
                break;
            }
        }
        if(flag==1)
        {
            ans=ans+m+" is power of 4";
        }
        else{
            ans=ans+m+" is not power of 4";
        }
        System.out.println(ans);
        return ans;
    }

    public class Member
    {
        String name;
        int age;
        double salary;

    }

    public  String show()
    {
        Member  n=new Member();
        n.name="Antara";
        n.age=22;
        n.salary=1000.0;
        String ans="";
        ans=ans+"Name: "+n.name+" Age: "+n.age+" Salary: "+n.salary;
        return ans;
    }

    public static class EvenNumTest
    {
        public boolean isEven(int number)
        {
            if(number%2==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

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

    public static class  User
    {
        String firstName;
        String lastName;
        int Age;
        double Salary;
        public User(String fname,String lname,int age,double sal)
        {
            this.firstName=fname;
            this.lastName=lname;
            this.Age=age;
            this.Salary=sal;
        }
        public String getFullName()
        {
            String full=this.firstName+" "+this.lastName;
            return full;
        }
        public String validAge()
        {
            String ans="";
            if(this.Age<0 || this.Age>100)
            {
                ans=ans+"Age is not valid";
            }
            else
            {
                ans=ans+"Age is valid";
            }
            return ans;
        }
    }
}



