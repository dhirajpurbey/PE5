package com.stackroute;

import java.util.*;

public class Collection2 {

    public Map<String, Integer> stringCount(String str){
        Map<String,Integer> map=new HashMap<String, Integer>();
        for(String s: str.split("[^a-zA-Z0-9]+"))
        {
            if(map.containsKey(s))
            {
                int count=map.get(s);
                map.put(s,count+1);
            }
            else
            {
                map.put(s,1);
            }
        }
        return map;
    }
}