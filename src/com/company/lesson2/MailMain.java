package com.company.lesson2;

import java.util.ArrayList;
import java.util.List;

public class MailMain {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Triangle(4,5,6));
        shapes.add(new Rectangle(8,9));
        System.out.println(shapes.get(0).perimetr());
        System.out.println(shapes.get(1).sahe());
    }
}
