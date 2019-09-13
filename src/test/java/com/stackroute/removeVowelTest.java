package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class removeVowelTest {

    private static removeVowel removeVowel;

    @Before
    public void setUp() throws Exception {

        removeVowel = new removeVowel();
    }

    @After
    public void tearDown() throws Exception {

        removeVowel = null;
    }

    @Test
    public void UTC_input(){
    List <String>  countries = new ArrayList<>();
        countries.add("India");
        countries.add("United States");
        countries.add("Germany");
        countries.add("Egypt");
        countries.add("czechoslovakia");
        List<String> expected = new ArrayList<>();
        expected.add("Ind");
        expected.add("Untd Stts");
        expected.add("Grmny");
        expected.add("Egypt");
        expected.add("czchslvk");

        assertEquals("Error! ",expected,removeVowel.Remove());
    }
    }
}