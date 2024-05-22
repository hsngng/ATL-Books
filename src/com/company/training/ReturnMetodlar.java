package com.company.training;

public class ReturnMetodlar {
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;

        }
        return result;
    }

    public static void main(String[] args) {
        int s = power(2, 3);
        System.out.println(s);
    }
}
