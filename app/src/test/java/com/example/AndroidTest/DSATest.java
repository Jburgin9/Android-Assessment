package com.example.AndroidTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class DSATest {

    @Test
    public void multiply() {
        int a = 2;
        int b = 3;
        int output;

        DSA dsaTest = new DSA();
        output = dsaTest.multiply(a,b);
        assertEquals(6,output);
    }
}