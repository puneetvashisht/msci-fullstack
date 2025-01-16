package com.msci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCalculator {

    Calculator calc;

    @BeforeAll
    public static void setUpOnce(){
        System.out.println("Fired only once...");
    }

    @BeforeEach
    public void setup(){
        System.out.println("Called before every test case");
        calc = new Calculator();
    }

    public void testAdd(){
        int a = 34;
        int b = 12;
        int result = calc.add(a, b);
        assertEquals(46, result);
    }

    
    @Test
    public void testAddWithNegativeValue(){
        int a = -34;
        int b = 12;
        int result = calc.add(a, b);
        assertEquals(-22, result);
    }

    @Test
    public void testMultiplication(){
        int a = 34;
        int b = 12;
        int result = calc.multiply(a, b);
        assertEquals(408, result);
    }

    @Test
    public void testBasic(){
        // call function

        // assertions
        assertTrue(true);

    }


    @AfterEach
    public void tearDown(){
        calc = null;
    }

    @AfterAll
    public static void tearDownOnce(){
        System.out.println("Fired after all the test cases .. ");
    }

}
