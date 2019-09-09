package com.stackroute;

public class Member {
    String name;
    int age;
    double salary;
}

class Member_variable
{
    Member n=new Member();
    public void set(String name,int age,double salary)
    {
        n.name=name;
        n.age=age;
        n.salary=salary;

    }

    public String[] display()
    {
        String[] d=new String[3];

        d[0]="Name: "+n.name;
        d[1]="Age: " +n.age;
        d[2]="Salary: "+n.salary;
        return d;
    }


}
