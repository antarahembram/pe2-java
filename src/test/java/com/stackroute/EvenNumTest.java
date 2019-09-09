package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenNumTest {
    public static EvenNum evennum;
    @BeforeClass
    public static void setup() {

        evennum = new EvenNum();

    }

    @AfterClass
    public static void teardown() {

        evennum = null;

    }

    @Test
    public void testEven()
    {
        assertEquals("isEven(),to check number is even or not",true,evennum.isEven(2));
        assertEquals("isEven(),to check number is even or not",false,evennum.isEven(5));
        assertEquals("isEven(),to check number is even or not",true,evennum.isEven(80));

    }
}
