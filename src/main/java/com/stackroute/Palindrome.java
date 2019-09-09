package com.stackroute;

public class Palindrome {
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
}
