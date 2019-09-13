package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionHandlingTest {

    String message = "ATULPANDEY";
    ExceptionHandling  exceptionHandling = new ExceptionHandling(message);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
            (expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        exceptionHandling.printMessage();
    }
    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "ATULPANDEY";
        assertEquals(message,exceptionHandling.salutationMessage());
    }
}


}