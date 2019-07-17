package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenChecker {
    private EvenCheck evenCheck;

    @Before
    public void setUp() throws Exception {
        this.evenCheck=new EvenCheck();
    }

    @After
    public void tearDown() throws Exception {
        evenCheck=null;
    }
    /*
    Should input any odd number and return a string "odd number"
     */
    @Test public void givenIntegerShouldReturnOdd(){
        boolean actualResult=evenCheck.isEven(13);
        assertEquals(false,actualResult);
    }
    /*
    Should input any even number and return a string "even number"
     */
    @Test public void givenIntegerShouldReturnEven(){
        boolean actualResult=evenCheck.isEven(20);
        assertEquals(true,actualResult);

    }
}