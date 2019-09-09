package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    public static Factorial factorial;
    @BeforeClass
    public static void setup() {

        factorial = new Factorial();

    }

    @AfterClass
    public static void teardown() {

        factorial = null;

    }

    @Test
    public void testlongFactorial()
    {
        assertEquals("factoral(), printing factorials is failed",
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
                factorial.longfactorial());
    }
    @Test
    public void testlongFactorialFailure()
    {
        assertNotEquals("factoral(),  printing factorials is failed",
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
                        "Factorial of 20 is 243290200817664000",
                        "Factorial of 21 is Out of Range"},
                factorial.longfactorial());
    }
    @Test
    public void testFactorial()
    {
        assertEquals("factoral(), printing factorials is failed",
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
                        "Factorial of 13 is Out of Range"},
                factorial.factorial());
    }

    @Test
    public void testFactorialFailure()
    {
        assertNotEquals("factoral(), printing factorials is failed",
                new String[]{
                        "Factorial of 1 is 1",
                        "Factorial of 2 is 4",
                        "Factorial of 3 is 6",
                        "Factorial of 4 is 24",
                        "Factorial of 5 is 120",
                        "Factorial of 6 is 720",
                        "Factorial of 7 is 5040",
                        "Factorial of 8 is 40320",
                        "Factorial of 9 is 362880",
                        "Factorial of 10 is 3628807",
                        "Factorial of 11 is 39916800",
                        "Factorial of 12 is 479001600",
                        "Factorial of 13 is Out of Range"},
                factorial.factorial());
    }


}
