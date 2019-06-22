package com.srijan.day4;



public class Shape1test {
    public static void main(String [] args){

        Shape1 s = new Triangle(3.3,5.5);
        double a = s.calculateArea();
        System.out.println(a);

        Shape1 s1= new Square(3.9);
        double b = s1.calculateArea();
        System.out.println(b);

    }

}
