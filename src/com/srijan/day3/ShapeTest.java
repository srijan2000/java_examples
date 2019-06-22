package com.srijan.day3;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args){

        Shape c = new Circle(8);
        double a = c.calculateArea();
        System.out.println(a);

        Shape r = new Rectangle(5, 4);
        double b = r.calculateArea();
        System.out.println(b);

        ArrayList sList = new ArrayList();

        sList.add(5);
        sList.add(7.5);
        sList.add("Hi");
        sList.add(c);

    }
}
