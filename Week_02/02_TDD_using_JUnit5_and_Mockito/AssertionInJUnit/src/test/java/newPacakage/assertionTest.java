package org.example;

import org.junit.Test;
import static org.junit.Assert.*; // Imports all assertion methods

public class assertionTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());

        // Assert same (optional)
        Object obj = new Object();
        assertSame(obj, obj);

        // Assert not same (optional)
        assertNotSame(new Object(), new Object());

        // Assert array equals (optional)
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }
}
