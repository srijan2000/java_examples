package com.srijan.day5;

public class Triangle1 implements Shape6 {
    double breadth;
    double height;
    public Triangle1(){}
    public Triangle1(double breadth, double height){
        this.breadth = breadth;
        this.height= height;
    }
    double getBreadth(){
        return this.breadth;
    }
    double getHeight(){
        return this.height;
    }
    public double calculateArea(){
        return 0.5*this.breadth*this.height;
    }
}
