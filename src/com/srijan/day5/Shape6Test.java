package com.srijan.day5;

public class Shape6Test {
    public static void main(String[] args){

        Shape6 s= new Triangle1(3.3,4.0);
        double a= s.calculateArea();
        System.out.println(a);

        Shape6 s1= new Square1(9);
        double b = s1.calculateArea();
        System.out.println(b);

    }
}
