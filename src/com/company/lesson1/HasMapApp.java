package com.company.lesson1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HasMapApp {
    public static void main(String[] args) {


        HashMap<Long,String> hashMap = new HashMap<>();
        hashMap.put(1L,"Hasan");
        hashMap.put(2L,"Nihat");
        hashMap.put(3L,"Araz");

        System.out.println(hashMap);

        Hashtable<Long,String> hashtable = new Hashtable<>();
        hashtable.put(1L,"Hasan");
        hashtable.put(2L,"Nihat");
        hashtable.put(3L,"Araz");

        System.out.println(hashtable);

        TreeMap<Long,String> treeMap = new TreeMap<>();
        treeMap.put(1L,"Zeka");
        treeMap.put(3L,"Oruc");
        treeMap.put(2L,"Samil");

        System.out.println(treeMap);
    }
}
