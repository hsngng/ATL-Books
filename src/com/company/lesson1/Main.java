package com.company.lesson1;

public class Main {
    public static void main(String[] args) {
        BookC bookC = new BookC("Qara Gun", "Shamil Azakhov",Status.BORROWED);
        System.out.println(bookC);
        bookC.borrowBook();
        System.out.println(bookC);
    }
}
