package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    public static Palindrome pal;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        pal = new Palindrome();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        pal = null;

    }
    @Test
    public void testmyreverse()
    {
        assertEquals( "myreverse(), To reverse the input string","abba",pal.myreverse("abba"));
        assertEquals( "myreverse(), To reverse the input string","dcba",pal.myreverse("abcd"));
        assertEquals( "myreverse(), To reverse the input string","1234321",pal.myreverse("1234321"));

    }
    @Test
    public void testisPalindrome()
    {
        assertEquals( "isPalindrome(), To check if failed ","Given string is palindrome",pal.isPalindrome("abba"));
        assertEquals( "isPalindrome(), To check if failed","Given string is not palindrome",pal.isPalindrome("abcd"));
        assertEquals( "isPalindrome(), To check if failed","Given string is palindrome",pal.isPalindrome("1234321"));
    }

    @Test
    public void testisPalindromeFailure()
    {
        assertNotEquals("isPalindrome(), To check if failed","Given string is palindrome",pal.isPalindrome("kjsh"));
        assertNotNull("isPalindrome(), check is failed ",pal.isPalindrome("abcba"));
    }


}
