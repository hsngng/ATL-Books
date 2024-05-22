package com.company.lesson1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class HasMapAze {
    public static void main(String[] args) {
//        final String word = "AZERBAIJAN";
//        char[] chars = word.toCharArray();
//
//        Map<Character,Integer> hashMap = new HashMap<>();
//        for (char c : chars){
//            if (hashMap.containsKey(c)){
//                Integer count = hashMap.get(c);
//                hashMap.put(c, count + 1);
//            }else {
//                hashMap.put(c,1);
//            }
//        }

        final String word = "AZERBAIJAN";
        char[] chars = word.toCharArray();

        Map<Character,Integer> hashMap = new HashMap<>();
        for (char c : chars){
            if (hashMap.containsKey(c)){
                hashMap.merge(c, 1, Integer::sum);
            }
        }
        System.out.println(hashMap);
    }
}
