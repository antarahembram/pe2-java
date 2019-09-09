package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    public static User user;
    @BeforeClass
    public static void setup() {

         user = new User();

    }

    @AfterClass
    public static void teardown() {

        user = null;

    }


   // User user1=new User();
    //User user2=new User("Harry","Potter",120,20490);
    //User user3=new User("Ram","Das",22,204900);

    @Test
    public void testgetFullName()
    {
        user.setVal("Antara","Hembram",22,204900);
        assertEquals("getFullName(), to print full name","Antara Hembram",user.getFullName());

        user.setVal("Harry","Potter",120,20490);
        assertEquals("getFullName(), to print full name","Harry Potter",user.getFullName());

        user.setVal("Ron","Das",22,204900);
        assertEquals("getFullName(), to print full name","Ron Das",user.getFullName());
    }
}
