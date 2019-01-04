package com.stackroute;

import java.util.*;

public class Collection6 {
    public static Set<String> sortAscending(List<String> li)
    {
        TreeSet<String> treeset=new TreeSet<String>(li);
        Iterator<String> itr=treeset.iterator();
        itr.next();
        return treeset;
    }
    public  List<String> convertList(TreeSet<String> tset)
    {
        List<String> arraylist=new ArrayList<String>(tset);
        Iterator<String> itr=arraylist.iterator();
        return arraylist;
    }
}