package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertEquals("isEven(),checking is failed",true,evennum.isEven(2));
        assertEquals("isEven(),checking is failed",false,evennum.isEven(5));
        assertEquals("isEven(),checking is failed",true,evennum.isEven(80));

    }

    @Test
    public void testEvenFailure()
    {
        assertNotEquals("isEven(),checking is failed",false,evennum.isEven(10));
    }
}
