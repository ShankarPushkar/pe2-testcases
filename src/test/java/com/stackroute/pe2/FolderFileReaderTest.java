/*
package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FolderFileReaderTest {

    private FolderFileReader folderFileReader;

    @Before
    public void setUp() {
        this.folderFileReader = new FolderFileReader();
    }

    @After
    public void tearDown() {
        folderFileReader = null;
    }
    */
/*
    we will be giving folder name and it should look for all files with
    extension .txt and then show the content of that files
    *//*

    @Test
    public void givenFoldereShouldReturnFileContent() {
        String actualResult = folderFileReader.contentReader("HelloWorld");
        assertEquals("Hello World", actualResult);
    }
     */
/*
    we will be giving folder name and it should look for all files with
    extension .txt and when it is not there then send error saying empty
    folder
    *//*

    @Test
    public void givenEmptyFolderShouldReturnErrorMessage() {
        String actualResult = folderFileReader.contentReader("EmptyFolder");
        assertEquals("Empty Folder", actualResult);
    }
     */
/*
    we will be giving dummy folder name and it should look for all folder
    and when it is not there then send error saying empty folder
    *//*

    @Test
    public void givenNonExistentFileShouldReturnError() {
        String actualResult = folderFileReader.contentReader("NotFound");
        assertEquals("Folder Not Found", actualResult);

    }
}*/
