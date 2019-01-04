package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class Collection1Test {
   Collection1 collection1=new Collection1();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void arrayListCheck() {
        List<String> input= Arrays.asList("Apple","Grape","Melon","Berry");
        //Act
        List<String> Expected= Arrays.asList("Kiwi","Grape","Mango","Berry");
        //Arrange
        List<String> Actual=collection1.arrayListCheck(input);
        //Assert
        assertEquals(Expected,Actual);

    }
    @Test
    public void arrayListCheck1() {
        List<String> input= Arrays.asList("Apple","Grape","Melon","Berry");
        //Act
        List<String> Expected= new java.util.ArrayList<>();
        //Arrange
        List<String> Actual= collection1.emptyArrayCheck(input);
        //Assert
        assertEquals(Expected,Actual);

    }
}