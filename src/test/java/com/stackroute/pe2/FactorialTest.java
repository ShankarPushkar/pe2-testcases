package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private Factorial factorial;

    @Before
    public void setUp() {

        this.factorial = new Factorial();
    }

    @After
    public void tearDown() {
        factorial = null;
    }

    /*
    Given a int number, it should return its factorial
     */
    @Test
    public void givenNumberShouldRetunFactorial() {
        int actualResult = factorial.factorialFinder(5);
        assertEquals(120, actualResult);
    }
    /*
    Given input is zero it should return int 1
     */

    @Test
    public void givenZeroShoulReturnOne() {
        int actualResult = factorial.factorialFinder(0);
        assertEquals(1, actualResult);
    }
}
