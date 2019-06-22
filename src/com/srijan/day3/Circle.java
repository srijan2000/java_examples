package com.srijan.day3;

public class Circle extends Shape {

    double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }


    double getRadius(){
        return this.radius;
    }
    public double calculateArea(){
        return  3.14 * this.radius * this.radius;
    }
}
