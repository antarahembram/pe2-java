package com.stackroute;

public class Power {
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
      //  System.out.println(ans);
        return ans;
    }
}
