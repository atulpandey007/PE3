package com.stackroute;

import org.junit.*;
import java.io.File;
import java.io.FileWriter;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class FileHandlingTest {
    private static FileHandling fileHandling;
    @Before
    public void setUp() throws Exception {
        fileHandling =new FileHandling();
    }

    @After
    public void tearDown() throws Exception {

        fileHandling = null;
    }

    @Test
    public void textReadFile() throws Exception{
        FileWriter f = new FileWriter("/home/cgi/abc.txt");
        f.write("this is file handling");
        f.close();
        assertEquals("THIS IS FILE HANDLING",fileHandling.printFileUpper("/home/cgi/abc.txt"));
    }
}
