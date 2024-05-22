package com.company.lesson1.lumu;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {new Student("Hasan", 28,1500L),
                new Student("Nihat",25,1800L),
                new Student("Samil",26,1700L)};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };

        Arrays.sort(students,comparator);
        System.out.println(Arrays.toString(students));

        Comparator<Student> comparator1 = (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge());
        Arrays.sort(students,comparator1);
        System.out.println(Arrays.toString(students));
    }

}
