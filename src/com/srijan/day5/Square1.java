package com.srijan.day5;

public class Square1 implements Shape6 {
    double x;
    public Square1 (double x){
        this.x =x;
    }
    double getX(){
       return this.x= x;
    }

    @Override
    public double calculateArea() {
        return this.x*this.x;
    }
}
