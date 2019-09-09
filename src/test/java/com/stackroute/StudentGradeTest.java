package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    public static StudentGrade stugrade;
    @BeforeClass
    public static void setup() {

        stugrade = new StudentGrade();

    }

    @AfterClass
    public static void teardown() {

        stugrade = null;

    }

    //arrays to be passed
    int[] g1={86,65,98,77};
    int[] g2={78,35,57,89,92};
    int[] g3={86,65,89,77,90};

    private  double DELTA = 1e-2;

    @Test
    public void testAverage()
    {
        assertEquals("average() is  failed",81.5,stugrade.Average(g1),DELTA);
        assertEquals("average() is  failed",70.2,stugrade.Average(g2),DELTA);
        assertEquals("average() is  failed",81.4,stugrade.Average(g3),DELTA);

    }
    @Test
    public void testAverageFailure() {
        assertNotEquals("average() is  failed", 50, stugrade.Average(g1), DELTA);
    }

    @Test
    public void testMax()
    {
        assertEquals("Max() is  failed",98,stugrade.Max(g1));
        assertEquals("Max() is  failed",92,stugrade.Max(g2));
        assertEquals("Max() is  failed",90,stugrade.Max(g3));
    }

    @Test
    public void testMaxFailure()
    {
        assertNotEquals("Max() is  failed",65,stugrade.Max(g1));

    }
    @Test
    public void testMin()
    {
        assertEquals("Min() is  failed",65,stugrade.Min(g1));
        assertEquals("Min() is  failed",35,stugrade.Min(g2));
        assertEquals("Min() is  failed",65,stugrade.Min(g3));

    }

    @Test
    public void testMinFailure()
    {
        assertNotEquals("Min() is  failed",90,stugrade.Min(g3));
    }
}
