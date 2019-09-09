package com.stackroute;

public class User {
    String firstName;
    String lastName;
    int Age;
    double Salary;
    public void setVal(String fname,String lname,int age,double sal)
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
