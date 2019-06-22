package com.srijan.day5;

public class Rectangle5 extends Shape5{
    double length;
    double breadth;
    public Rectangle5 (){}

    public Rectangle5(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return this.length;
    }
    public double getBreadth(){
        return this.breadth;
    }

    @Override
    public double calculateArea() {
        return this.length*this.breadth;
    }
}
