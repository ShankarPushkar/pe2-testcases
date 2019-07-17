/*
package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileReadingTest {
    private FileReading fileReading;

    @Before
    public void setUp() {
        this.fileReading = new FileReading();
    }

    @After
    public void tearDown() {
        fileReading = null;
    }
    */
/*
    we will be giving the filename as input and it should return the content of the files
    *//*

    @Test
    public void givenTextFileShouldReturnItsContent() {
        String actualResult = fileReading.fileDataReader("file.txt");
        assertEquals("Content of the file", actualResult);
    }
    */
/*
    we will be giving blank filename and it should return error! empty file
    *//*

    @Test
    public void givenEmptyTextFileShouldReturnErrorMessage() {
        String actualResult = fileReading.fileDataReader(" ");
        assertEquals("Empty file", actualResult);
    }
    */
/*
    we will be giving wrong filename and it should return Wrong file sent
    *//*


    @Test
    public void givenWrongFileShouldReturnError() {
        String actualResult = fileReading.fileDataReader("data.dll");
        assertEquals("Wrong file sent", actualResult);
    }
}*/
