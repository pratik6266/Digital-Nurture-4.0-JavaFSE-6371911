package org.example.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    // Test method for adding two numbers
    @Test
    public void testAdd() {
        int result = Calculator.add(2, 3);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSubtract() {
        int result = Calculator.subtract(5, 3);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}
