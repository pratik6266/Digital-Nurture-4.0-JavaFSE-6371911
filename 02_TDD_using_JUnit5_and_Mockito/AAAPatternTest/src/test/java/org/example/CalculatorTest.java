package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before  // Setup method (runs before each test)
    public void setUp() {
        calculator = new Calculator();  // Arrange (shared setup)
        System.out.println("Setup complete");
    }

    @After  // Teardown method (runs after each test)
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Arrange (already done in setUp)

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange

        // Act
        int result = calculator.subtract(10, 4);

        // Assert
        assertEquals(6, result);
    }
}
