package com.srijan.day3;

public class Rectangle extends Shape{

    float length;
    float breadth;

    public Rectangle(){}

    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public float getBreadth() {
        return this.breadth;
    }
    public float getLength(){
        return this.length;
    }

    @Override
    public double calculateArea(){
        return this.length *this.breadth;

    }
}
