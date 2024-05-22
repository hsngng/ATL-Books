package com.company.training;

import java.util.Scanner;

public class Metodlar {

    public static boolean fo(int sayi) {
        boolean sonuc = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sonuc = false;
                break;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(fo(10));
    }
}
