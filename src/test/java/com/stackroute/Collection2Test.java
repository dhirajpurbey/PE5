package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class Collection2Test {
    Collection2 collection2=new Collection2();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stringCheck() {
        String str= "one one -one two three, one @three*one?two";

        HashMap<String,Integer> expected=new HashMap<>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);

    }

    @Test
    public void stringCheck1() {
        String str="one one -one two three, one @three*one?two";

    }
}