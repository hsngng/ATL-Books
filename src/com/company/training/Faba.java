package com.company.training;

public class Faba {

    public static void main(String[] args) {
//        f(4);
//        System.out.println("ikinci metod");
//        f(6);
        power(2,3);
    }
    static void f(int x){
        int result = (x+2) * 6;
        System.out.println(result);
    }

    static void power(int n1, int n2){
        int result = 1;
        for (int i = 0; i < n2; i++) {
            result *= n1;
        }
        System.out.println("cevab :" + result);
    }
}
