package com.srijan.day5;

public class Circle5 extends Shape5{

    double radius;

    public Circle5(){}

    public Circle5 (double radius){
        this.radius = radius;

    }
    double getRadius5(){
        return  this.radius;
    }

    @Override
    public double calculateArea() {
        return 3.14*this.radius*this.radius;
    }
}
