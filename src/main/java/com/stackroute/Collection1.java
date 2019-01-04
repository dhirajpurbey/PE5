package com.stackroute;
import java.util.*;
public class Collection1 {

    public List<String> arrayListCheck(List<String> list1)
    {
        list1.set(0,"Kiwi");
        list1.set(2,"Mango");
        return list1;
    }
    public List<String> emptyArrayCheck(List<String> list2)
    {
        List<String> str = new java.util.ArrayList<>(list2);
        str.removeAll(str);
        return str;
    }
}