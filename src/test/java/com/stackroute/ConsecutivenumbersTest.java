package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutivenumbersTest {

    public static Consecutivenumbers consecutiveNumbers;

    @Before
    public void setUp() throws Exception {
        consecutiveNumbers = new Consecutivenumbers();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumbers = null;
    }

    @Test
    public void input01(){
        int[] expected =(new int[]{54, 53, 52, 51, 50, 49, 48} );
        int[] actual = consecutiveNumbers.func();
        assertEquals("Error!",actual,expected );
    }
    @Test
    public void input02(){
        int[] expected =(new int[]{54, 53, 52, 51, 50} );
        int[] actual = consecutiveNumbers.func();
        assertNotEquals("Error!",actual,expected );
    }
    @Test
    public void input03(){
        int[] expected =(new int[]{1,2,3,4,5,6,6} );
        int[] actual = consecutiveNumbers.func();
        assertNotEquals("Error!",actual,expected );
    }
}



}