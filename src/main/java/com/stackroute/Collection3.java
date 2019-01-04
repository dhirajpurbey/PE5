package com.stackroute;

import java.util.*;

public class Collection3 {


    public Map<String, Boolean> stringCount11(String[] str) {
        Map<String, Boolean> map = new HashMap();
        int c1=0,c2=0,c3=0,c4=0;
        for (int i=0;i<str.length;i++){
            if (str[i].contains("a")) {
                c1++;}
            else if (str[i].contains("b")){
                c2++;
            }
            else if (str[i].contains("c")){
                c3++;
            }
            else if (str[i].contains("d")){
                c4++;
            }

        }
        if (c1>1)
            map.put("a",true);
        else
            map.put("a",false);
        if (c2>1)
            map.put("b",true);
        else
            map.put("b",false);
        if (c3>1)
            map.put("c",true);
        else
            map.put("c",false);
        if (c4>1)
            map.put("d",true);
        else
            map.put("d",false);

        return map;
    }
}