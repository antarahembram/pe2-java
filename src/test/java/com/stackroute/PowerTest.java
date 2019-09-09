package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerTest {
    public static Power power;
    @BeforeClass
    public static void setup() {

        power = new Power();

    }

    @AfterClass
    public static void teardown() {

        power = null;

    }

    @Test
    public void testisPower()
    {
        assertEquals( "isPower(), To check the input string is palindrome ","16 is power of 4",power.isPower(16));
        assertEquals( "isPower(), To check the input string is palindrome ","8 is not power of 4",power.isPower(8));
        assertEquals( "isPower(), To check the input string is palindrome ","256 is power of 4",power.isPower(256));

    }

}
