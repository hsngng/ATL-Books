package com.company.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        Integer integer = Integer.parseInt(a);
        
        try {
            int num = Integer.parseInt(a);
        } catch (NumberFormatException e){
            System.out.println("111");
        }

    }
}
