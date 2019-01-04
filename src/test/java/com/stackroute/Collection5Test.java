package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Collection5Test {
    Collection5 collection5= new Collection5();

    @Test
    public void swapString(){
        Map<String,String> input=new HashMap<>();
        input.put("val1","java");
        input.put("val2","c++");
        Map<String,String> output=new HashMap<>();
        output.put("val1"," ");
        output.put("val2","java");
        assertEquals(output,collection5.swapString((HashMap<String, String>) input));
    }
}