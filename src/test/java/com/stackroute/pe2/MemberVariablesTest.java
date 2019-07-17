package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariablesTest {

    private MemberVariables memberVariables;

    @Before
    public void setUp() {

        this.memberVariables = new MemberVariables();
    }

    @After
    public void tearDown() {

        memberVariables = null;
    }

    /*
    we will be giving a null value to the string and
    it should send error
   */
    @Test
    public void givenStringShouldReturnErrorMessage() {
        String[] error ={"Error"};
        String[] actualResult = memberVariables.membersData(null,0,0);
        assertArrayEquals(error,actualResult);
    }
     /*
    we will be giving name,salary and age so it returns the data
   */

    @Test
    public void givenStringShouldReturntTheResult() {
        String[] expectedResult=memberVariables.membersData("sruthi",1500,22);
        String[] actualResult = memberVariables.membersData("sruthi",1500,22);
        assertArrayEquals(expectedResult,actualResult);
    }

    /*
   we will be giving name empty salary 1500 age 22 we get the error message as:name should not be empty
  */
    @Test
    public void shouldReturnAMessageAsNameShouldNotBeEmpty() {
        String[] error={"name should not be empty"};
        String[] actualResult = memberVariables.membersData(" ",1500,22);
        assertArrayEquals(error,actualResult);
    }

}