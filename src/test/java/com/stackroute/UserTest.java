package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertEquals("getFullName(), printing full name is failed","Antara Hembram",user.getFullName());

        user.setVal("Harry","Potter",120,20490);
        assertEquals("getFullName(), printing full name is failed","Harry Potter",user.getFullName());

        user.setVal("Ron","Das",22,204900);
        assertEquals("getFullName(), printing full name is failed","Ron Das",user.getFullName());
    }

    @Test
    public void testgetFullNameFailure()
    {

        user.setVal("Ants","Hembram",22,204900);
        assertNotEquals("getFullName(), printing full name is failed","Antara Hembram",user.getFullName());
    }

    @Test
    public void testValidAge()
    {
        user.setVal("Antara","Hembram",22,204900);
        assertEquals("validAge(),falied","Age is valid",user.validAge());
        user.setVal("Harry","Potter",120,20490);
        assertEquals("validAge(),failed","Age is not valid",user.validAge());
        user.setVal("Ron","Das",22,204900);
        assertEquals("validAge(),failed","Age is valid",user.validAge());

    }
    @Test
    public void testValidAgeFailure()
    {
        user.setVal("Antara","Hembram",129,204900);
        assertNotEquals("validAge(),falied","Age is valid",user.validAge());

    }
}
