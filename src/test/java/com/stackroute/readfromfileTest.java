package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileWriter;

import static org.junit.Assert.*;

public class readfromfileTest {

    public static readfromfile readfromfile;

    @Before
    public void setUp() throws Exception {
        readfromfile = new readfromfile();
    }

    @After
    public void tearDown() throws Exception {

        readfromfile = null;
    }

    @Test
    public void readfile() throws Exception{
        FileWriter f = new FileWriter("/home/cgi/abc.txt");
        f.write("this is my file");
        f.close();
        FileHandling readFromFile;
        assertEquals("THIS IS MY FILE",readfromfile.printFileUpper("/home/cgi/abc.txt"));
    }
}
}