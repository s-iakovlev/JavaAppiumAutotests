package lesson1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    // Задание 1
    @Test
    public void testGetLocalNumber(){
        int expected = 14;
        int actual = getLocalNumber();

        Assert.assertTrue("expected result is " + expected + " but get " + actual, actual == expected);
    }

    // Задание 2
    @Test
    public void testGetClassNumber(){
        int expected = 45;
        int actual = getClassNumber();

        Assert.assertTrue("value " + actual + " less than " + expected, actual > expected);
    }

    // Задание 3
    @Test
    public void testGetClassString(){
        String actual = getClassString();

        if ((actual.contains("hello")) || (actual.contains("Hello")))  {
            Assert.assertTrue("Test pass",true);
        } else {
            Assert.assertTrue("Test failed",false);
        }
    }
}