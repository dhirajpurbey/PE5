package com.stackroute;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Collection3Test {
    Collection3 collection3=new Collection3();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stringMapCheck() {
        String[] str={"a","b","c","d","a","c","c"};

        HashMap<String,Boolean> expected=new HashMap<>();
            expected.put("a",true);
            expected.put("b",false);
            expected.put("c",true);
            expected.put("d",true);

    }

    @Test
    public void stringMapCheck1() {
        String[] str={"a","b","c","d","a","c","c"};

    }
}