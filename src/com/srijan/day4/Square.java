package com.srijan.day4;



public class Square implements Shape1 {
    double x;
    public Square(double x){
        this.x= x;
    }
    double getX(){
        return this.x;
    }

    @Override
    public double calculateArea() {
        return this.x *this.x;
    }
}
