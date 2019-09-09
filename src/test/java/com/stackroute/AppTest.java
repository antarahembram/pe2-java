package com.stackroute;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Scanner;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static App apptest;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        apptest = new App();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        apptest = null;

    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testmyreverse()
    {
        assertEquals( "myreverse(), To reverse the input string","abba",apptest.myreverse("abba"));
        assertEquals( "myreverse(), To reverse the input string","dcba",apptest.myreverse("abcd"));
        assertEquals( "myreverse(), To reverse the input string","1234321",apptest.myreverse("1234321"));

    }
    @Test
    public void testisPalindrome()
    {
        assertEquals( "isPalindrome(), To check the input string is palindrome ","Given string is palindrome",apptest.isPalindrome("abba"));
        assertEquals( "isPalindrome(), To check the input string is palindrome ","Given string is not palindrome",apptest.isPalindrome("abcd"));
        assertEquals( "isPalindrome(), To check the input string is palindrome ","Given string is palindrome",apptest.isPalindrome("1234321"));
    }

    @Test
    public void testisPower()
    {
        assertEquals( "isPower(), To check the input string is palindrome ","16 is power of 4",apptest.isPower(16));
        assertEquals( "isPower(), To check the input string is palindrome ","8 is not power of 4",apptest.isPower(8));
        assertEquals( "isPower(), To check the input string is palindrome ","256 is power of 4",apptest.isPower(256));

    }

    @Test
    public void testShow()
    {
        assertEquals("show","Name: Antara Age: 22 Salary: 1000.0",apptest.show());
    }


  //  private static EvenNumTest eventest;
    App.EvenNumTest eventest=new App.EvenNumTest();

    @Test
    public void testEven()
    {
        assertEquals("isEven(),to check number is even or not",true,eventest.isEven(2));
        assertEquals("isEven(),to check number is even or not",false,eventest.isEven(5));
        assertEquals("isEven(),to check number is even or not",true,eventest.isEven(80));

    }
    int[] g1={86,65,98,77};
    int[] g2={78,35,57,89,92};
    int[] g3={86,65,89,77,90};

    private static final double DELTA = 1e-2;
    @Test
    public void testAverage()
    {
        assertEquals("average()",81.5,apptest.Average(g1),DELTA);
        assertEquals("average()",70.2,apptest.Average(g2),DELTA);
        assertEquals("average()",81.4,apptest.Average(g3),DELTA);

    }

    @Test
    public void testMax()
    {
        assertEquals("Max()",98,apptest.Max(g1));
        assertEquals("Max()",92,apptest.Max(g2));
        assertEquals("Max()",90,apptest.Max(g3));

    }
    @Test
    public void testMin()
    {
        assertEquals("Min()",65,apptest.Min(g1));
        assertEquals("Min()",35,apptest.Min(g2));
        assertEquals("Min()",65,apptest.Min(g3));

    }
    @Test
    public void testFactorial()
    {
        assertEquals("factoral(), to print factorials",
                new String[]{
                        "Factorial of 1 is 1",
                        "Factorial of 2 is 2",
                        "Factorial of 3 is 6",
                        "Factorial of 4 is 24",
                        "Factorial of 5 is 120",
                        "Factorial of 6 is 720",
                        "Factorial of 7 is 5040",
                        "Factorial of 8 is 40320",
                        "Factorial of 9 is 362880",
                        "Factorial of 10 is 3628800",
                        "Factorial of 11 is 39916800",
                        "Factorial of 12 is 479001600",
                        "Factorial of 13 is 6227020800",
                        "Factorial of 14 is 87178291200",
                        "Factorial of 15 is 1307674368000",
                        "Factorial of 16 is 20922789888000",
                        "Factorial of 17 is 355687428096000",
                        "Factorial of 18 is 6402373705728000",
                        "Factorial of 19 is 121645100408832000",
                        "Factorial of 20 is 2432902008176640000",
                        "Factorial of 21 is Out of Range"},
                apptest.factorial());
    }

    App.User user1=new App.User("Antara","Hembram",22,204900);
    App.User user2=new App.User("Harry","Potter",120,20490);
    App.User user3=new App.User("Ram","Das",22,204900);

    @Test
    public void testgetFullName()
    {
        assertEquals("getFullName(), to print full name","Antara Hembram",user1.getFullName());

        assertEquals("getFullName(), to print full name","Harry Potter",user2.getFullName());

        assertEquals("getFullName(), to print full name","Ram Das",user3.getFullName());
    }

    @Test
    public void testValidAge()
    {
        assertEquals("validAge(),to check age is valid or not","Age is valid",user1.validAge());
        assertEquals("validAge(),to check age is valid or not","Age is not valid",user2.validAge());
        assertEquals("validAge(),to check age is valid or not","Age is valid",user3.validAge());

    }

}
