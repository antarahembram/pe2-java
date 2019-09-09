package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MemberTest {
    private static Member_variable member;


    @BeforeClass
    public static void setup(){
        member = new Member_variable();

    }

    @AfterClass
    public static void teardown() {
        member = null;

    }

    @Test
    public void  testdisplay()
    {
        member.set("Antara",22,1000.0);
        assertEquals("display is falied",new String[]{"Name: Antara", "Age: 22", "Salary: 1000.0"},member.display());

        member.set("Harry",22,2000.0);
        assertEquals("display is falied",new String[]{"Name: Harry", "Age: 22", "Salary: 2000.0"},member.display());

        member.set("Ron",22,10000.0);
        assertEquals("display is falied",new String[]{"Name: Ron", "Age: 22", "Salary: 10000.0"},member.display());

    }
    @Test
    public void testdisplayFailure()
    {
        member.set("Ants",22,10010.0);
        assertNotEquals("display is falied",new String[]{"Name: Antara", "Age: 22", "Salary: 1000.0"},member.display());

    }
}
