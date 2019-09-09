package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertEquals( "isPower(), Failed to check ","16 is power of 4",power.isPower(16));
        assertEquals( "isPower(), Failed to check ","8 is not power of 4",power.isPower(8));
        assertEquals( "isPower(), Failed to check ","256 is power of 4",power.isPower(256));

    }

    @Test
    public void testisPowerFailure()
    {
        assertNotEquals("isPower(), Failed to check ","24 is a power of 4",power.isPower(24));
        assertNotNull("isPower(), Failed to check ",power.isPower(8));
    }

}
