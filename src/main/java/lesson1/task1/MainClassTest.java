package lesson1.task1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {


    @Test
    public void testGetLocalNumber(){
        int expected = 14;
        int actual = getLocalNumber();

        Assert.assertTrue("actual result is " + expected + " but get " + actual, actual == expected);
    }

}