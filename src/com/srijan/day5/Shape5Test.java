package com.srijan.day5;

public class Shape5Test {
    public static void main(String args[]){

        Shape5 c = new Circle5(8);
        double a = c.calculateArea();
        System.out.println(a);

        Shape5 r = new Rectangle5(6,6);
        double b = r.calculateArea();
        System.out.println(b);

    }
}
