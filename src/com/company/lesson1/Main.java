package com.company.lesson1;


import com.company.lesson1.lumu.Person;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,6,3,11,1,12};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }

}
