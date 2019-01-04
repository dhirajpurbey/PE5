package com.stackroute;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Collection6Test {
    Collection6 collection6=new Collection6();

    @Test
    public void testCase1()
    {
        List<String> ip=new ArrayList<String>(Arrays.asList("Harry","Olive","Alice","Bluto","Eugine"));
        TreeSet<String> op=new TreeSet<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
        assertEquals(op,new Collection6().sortAscending(ip));
    }
    @Test
    public void testCase2()
    {
        TreeSet<String> ip=new TreeSet<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
        List<String> op=new ArrayList<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
        assertEquals(op,new Collection6().convertList(ip));
    }
}